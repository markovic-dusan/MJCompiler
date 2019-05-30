package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.*;
import rs.etf.pp1.symboltable.concepts.*;

public class SemanticAnalyzer extends VisitorAdaptor {
	
	// TODO formati svih poruka

	private Logger log = Logger.getLogger(getClass());
	
	private MyDumpSymbolTableVisitor stv = new MyDumpSymbolTableVisitor ();
	
	private Boolean semanticErrorFound = false;
	
	private Obj programNode;
	
	private Obj currType = null;
	
	private Struct currStruct;
	
	private Integer currConstValue = null; //used for inserting value of constant
	
	private Obj currNode = null;
	
	private Obj currMethod = null;
	
	private Integer currEnumValue = null;
	
	private Integer numOfFormPars;
	
	private ArrayList<Obj> extendedAndImplemented;
	
	public Boolean semanticErrorFound () {
		return semanticErrorFound;
	}

    public void visit (ProgramName pn) { 
    	
    	programNode = Tab.insert(Obj.Prog, pn.getProgramName(), Tab.noType);
    	Tab.openScope();
    	
	}
    
    public void visit (Program p) {
    	
    	Obj mainFound = Tab.currentScope().findSymbol ("main");
    	
    	if (mainFound == null)
    		log.error("Semantic error: no global function main found");
    	else if (mainFound.getKind() != Obj.Meth)
    		log.error("Semantic error: main must be global void function");
    	else if (mainFound.getType().getKind() != Struct.None)
    		log.error("Semantic error: main function must be void");
    	else if (mainFound.getLevel() != 0)
    		log.error("Semantic error: main function can't have arguments");
    	
    	Tab.chainLocalSymbols(programNode);
    	Tab.closeScope();   
    	
    }
    
    public void visit (Type t) {
    	
    	Obj type = Tab.find(t.getTypeName());
    	
    	if (type.getKind() != Obj.Type) {
    		
    		log.error ("Semantic error on line " + t.getLine() + ": " + t.getTypeName() + " must be declared as type!");
    		semanticErrorFound = true;
    		currType = null;
    	}
    	
    	else {
    		currType = type;
    		currType.accept(stv);
    		log.info("Usage of type: " + t.getTypeName() + " on line: " + t.getLine() + ". SymbolTable output: " + stv.getOutput());    		
    		stv = new MyDumpSymbolTableVisitor();
    	}
    	
    	/*if (type.getType().getKind() == Struct.Class) {
    		log.info("KLASA");
    		log.info("type: " + type.getName());
    		if (type.getType().getElemType() != null) {
    			log.info("type.getElemType.kind: " + type.getType().getElemType().getKind());
    			log.info("members: " + type.getType().getElemType().getMembers().size());
        		log.info("fields: " + type.getType().getElemType().getNumberOfFields());
        		log.info("interfaces: " + type.getType().getElemType().getImplementedInterfaces().size());
    		}
    		else log.info("nema nasledjivanja");
    		log.info("members: " + type.getType().getMembers().size());
    		log.info("fields: " + type.getType().getNumberOfFields());
    		log.info("interfaces: " + type.getType().getImplementedInterfaces().size());
    	}
    	else if (type.getType().getKind() == Struct.Interface) {
    		log.info("INTERFEJS");
    		log.info("type: " + type.getName());
    		log.info("methods: " + type.getType().getMembers().size());
    	}
    	else if (type.getType().getKind() == Struct.Array) {
    		log.info("NIZ");
    		log.info("type: " + type.getName());
    	}*/
    }
    
    public void visit (VoidReturn vr) {
    	
    	currType = new Obj (Obj.Type, "void", Tab.noType);
    }
    
    /* global const declarations */
    
    public void visit (SingleConstDeclSuccess constDecl) {
    	    	
    	if (currType != null && currConstValue != null) {
    		
    		Obj constFound = Tab.find(constDecl.getConstName().getConstName());
    		
    		
    		if (constFound.equals(Tab.noObj)) {
    			
    			constFound = Tab.insert(Obj.Con, constDecl.getConstName().getConstName(), currType.getType());
    			constFound.setAdr(currConstValue);
    			constFound.accept(stv);
    			log.info("Declared global constant: " + constDecl.getConstName().getConstName() + ", of type: " + currType.getName() + " on line " + constDecl.getLine() + "; SymbolTable output: " + stv.getOutput() );
    			stv = new MyDumpSymbolTableVisitor();
    		
    		}
    		
    		else {
    			log.error ("Semantic error on line " + constDecl.getLine() + ": " + constDecl.getConstName().getConstName() + " already declared");
    			semanticErrorFound = true;
    		}
    	}
    
    }
    
    public void visit (NumConst nc) {
    	
    	if (currType == null) currConstValue = null;
    	else if (currType.getType().getKind() != Struct.Int) {
    		
    		log.error ("Semantic error on line " + nc.getLine() + ": can't assign number value to " + currType.getName() + " type");
    		semanticErrorFound = true;
    		currConstValue = null;
    		
    	}
    	else
    		currConstValue = nc.getNumberValue();
    }
    
    public void visit (CharConst cc) {
    	
    	if (currType == null) currConstValue = null;
    	else if (currType.getType().getKind() != Struct.Char) {
    		
    		log.error ("Semantic error on line " + cc.getLine() + ": can't assign char value to " + currType.getName() + " type");
    		semanticErrorFound = true;
    		currConstValue = null;
    		
    	}
    	else 
    		currConstValue = Integer.valueOf(cc.getCharValue());
    	
    }
    
    public void visit (BoolConst bc) {
    	
    	if (currType == null) currConstValue = null;
    	else if (currType.getType().getKind() != Struct.Bool) {
    		
    		log.error ("Semantic error on line " + bc.getLine() + ": can't assign bool value to " + currType.getName() + " type");
    		semanticErrorFound = true;
    		currConstValue = null;
    		
    	}
    	else
    		if (bc.getBoolValue()) currConstValue = 1;
    		else currConstValue = 0;
    }
    
    /* (end) global const declarations */
    
    /* enum declarations */ 
    
    public void visit (EnumName en) {
    	
    	Obj objFound = Tab.find(en.getEnumName());
    	
    	if (objFound.equals(Tab.noObj)) {
    		
    		currStruct = new Struct (Struct.Enum);
    		currType = new Obj (Obj.Type, "enum", currStruct, -1, -1);
    		objFound = Tab.insert(Obj.Con, en.getEnumName(), currType.getType());
    		currNode = objFound;
    		currEnumValue = 0;
    		Tab.openScope();
    		currNode.accept(stv);    		
    		stv = new MyDumpSymbolTableVisitor();
    		
    	}
		else {
			log.error ("Semantic error on line " + en.getLine() + ": " + en.getEnumName() + " already declared");
			semanticErrorFound = true;
			currNode = null;
			currStruct = null;
		}
		
    }
    
    public void visit (SingleEnumElemDeclSuccess seeds) {
    	
    	Obj objFound = Tab.currentScope().findSymbol(seeds.getEnumElemName()); 
    	
    	if (objFound == null) {
    		
    		objFound = Tab.insert(Obj.Elem, seeds.getEnumElemName(), Tab.intType);
    		if (seeds.getEnumValueOption() instanceof EnumElemValue)
    			currEnumValue = ((EnumElemValue) seeds.getEnumValueOption()).getEnumValue();
    		objFound.setAdr(currEnumValue);
    		
    		objFound.accept(stv);
    		
    		log.info("Declared enum elem: " + currNode.getName() + "." + seeds.getEnumElemName() + " with value: " + currEnumValue +  " on line " + seeds.getLine() + "; " + stv.getOutput() );
    		currEnumValue++;
    		
    		stv = new MyDumpSymbolTableVisitor();
    		
    	}
		else {
			log.error ("Semantic error on line " + seeds.getLine() + ": enum elem " + seeds.getEnumElemName() + " already declared");
			semanticErrorFound = true;
			
		}
    	
    }
    
    public void visit (EnumDeclSuccess eds) {
    	
    	if (currNode != null) {
    		Tab.chainLocalSymbols(currNode);
    		Tab.closeScope();
    		
    		currNode.accept(stv);
    		//log.info("Enum " + eds.getEnumName().getEnumName() +  "SymbolTable output: " + stv.getOutput());
    		log.info("Declared enum: " + eds.getEnumName().getEnumName() + " on line " + eds.getLine() + " ; SymbolTable: " + stv.getOutput() );
    		stv = new MyDumpSymbolTableVisitor();
    		currNode = null;
    	}
    }
    
    /* (end) enum declarations */ 
    
    /* global var declarations */
    
    public void visit (SingleVarDeclSuccess svds) {
    	
    	if (currType != null) {
    		
    		Obj varFound = Tab.find(svds.getVarName());    		
    		
    		if (varFound.equals(Tab.noObj)) {
    			
    			if (svds.getArrayOption() instanceof NoArrayVariable) {
    				varFound = Tab.insert(Obj.Var, svds.getVarName(), currType.getType());
    			}
    			else if (svds.getArrayOption() instanceof ArrayVariable) {
    				varFound = Tab.insert(Obj.Var, svds.getVarName(), new Struct (Struct.Array, currType.getType()));
    			}
    	    	else log.info("GRESKA!!!"); 
    			log.info("Declared global variable: " + svds.getVarName() + ", of type: " + currType.getName() + " on line " + svds.getLine() );
    			
    		}
    		else {
    			
    			log.error ("Semantic error on line " + svds.getLine() + ": " + svds.getVarName() + " already declared");
    			semanticErrorFound = true;
    			
    		}
    		
    	}
    	
    }
    
    /* (end) global var declarations */
    
    /* interface declarations */
    
    public void visit (InterfaceName in) {
    	
    	Obj objFound = Tab.find(in.getInterfaceName());
    	
    	if (objFound.equals(Tab.noObj)) {
    		    		
    		//currType = Tab.find("interface");
    		currStruct = new Struct(Struct.Interface);
    		currType = new Obj (Obj.Type, "interface", currStruct, -1, -1);
    		objFound = Tab.insert(Obj.Type, in.getInterfaceName(), currType.getType());
    		currNode = objFound;
    		Tab.openScope();
    		log.info("Declared interface: " + in.getInterfaceName() + " on line " + in.getLine() );
    		
    	}
		else {
			log.error ("Semantic error on line " + in.getLine() + ": " + in.getInterfaceName() + " already declared");
			semanticErrorFound = true;
			currNode = null;
		}
		
    }
    
    public void visit (InterfaceDeclSuccess ids) {
    	
    	if (currNode != null) {
    		//Tab.find(currNode.getName()).getType().setMembers(innerElems);
    		Tab.chainLocalSymbols(currStruct);
    		Tab.closeScope();
    		currStruct = null;
    		currNode = null;
    	}
    }
    
    /* (end) interface declarations */
    
    /* interface methods */
    
    public void visit (InterfaceMethodName imn) {
    	
    	if (currType != null && currNode != null) {
	    	Obj declaredMethod = /*innerElems.searchKey(imn.getInterfaceMethodName());*/ Tab.currentScope().findSymbol(imn.getInterfaceMethodName());
	    	if (declaredMethod != null) {
	    		log.error("Semantic error on line " + imn.getLine() + ": " + imn.getInterfaceMethodName() + " already declared as method in interface " + currNode.getName());
	    		currMethod = null;
	    	}
	    	else {
	    		currMethod = /*new Obj(Obj.Meth, imn.getInterfaceMethodName(), currType.getType());*/ Tab.insert(Obj.Meth, imn.getInterfaceMethodName(), currType.getType());
	    		Tab.openScope();
	    		numOfFormPars = 0;
	    		log.info("Declared method: " + imn.getInterfaceMethodName() + " in interface: " + currNode.getName() + " with return type: " + currType.getName() + " on line: " + imn.getLine());
	    	}
    	}
    	else
    		currMethod = null;
    }
    
    public void visit (InterfaceMethodDecl imd) {
    	
    	if (currMethod != null) {
    		Tab.chainLocalSymbols(currMethod);
    		Tab.closeScope();
    		log.info("numOfFormPars: " + numOfFormPars);
    		currMethod.setLevel (numOfFormPars);
    		numOfFormPars = 0;
    		currMethod = null;
    		//innerElems.insertKey(currMethod);
    	}
    }
    
    /* (end) interface methods */
    
    /* class declarations */
    
    public void visit (ClassName cn) {
    	
    	Obj objFound = Tab.find(cn.getClassName());
    	
    	if (objFound.equals(Tab.noObj)) {
    		    		
    		//currType = Tab.find("interface");
    		objFound = Tab.insert(Obj.Type, cn.getClassName(), new Struct (Struct.Class));
    		currType = Tab.find(cn.getClassName());
    		currNode = objFound;
    		Tab.openScope();
    		extendedAndImplemented = new ArrayList<Obj> ();
    		log.info("Declared class: " + cn.getClassName() + " on line " + cn.getLine() );
    		
    	}
		else {
			log.error ("Semantic error on line " + cn.getLine() + ": " + cn.getClassName() + " already declared");
			semanticErrorFound = true;
			currNode = null;
		}
		
    }
    
    public void visit (ClassInheritanceSuccess cis) {
    	
    	if (currType != null) {
    		if (currType.getType().getKind() == Struct.Class) {
    			currNode.getType().setElementType(currType.getType());
    			extendedAndImplemented.add(currType);
    			log.info("Class " + currNode.getName() + " extends class " + currType.getName());
    		}
    		else
    			log.error("Semantic error on line " + cis.getLine() + ": " + currType.getName() + " must be class type");
    	}
    	
    }
    
    public void visit (InterfaceImplemented ii) {
    	if (currType != null) {
    		if (currType.getType().getKind() == Struct.Interface) {
    			
    			ArrayList<Struct> alreadyImplementedInterfaces = (ArrayList<Struct>) currNode.getType().getImplementedInterfaces();
    			boolean alreadyImplemented = false;
    			
    			for (Struct implementedInterface : alreadyImplementedInterfaces) {
    				if (implementedInterface.equals(currType.getType())) {
    					log.error("Semantic error on line " + ii.getLine() + ": class " + currNode.getName() + " already implemented interface " + currType.getName());
    					alreadyImplemented = true;
    				}
    			}
    			
    			if (!alreadyImplemented) {
    				currNode.getType().addImplementedInterface(currType.getType());
    				extendedAndImplemented.add(currType);
    				log.info("Class " + currNode.getName() + " implements interface " + currType.getName());
    			}
    		}
    		else
    			log.error("Semantic error on line " + ii.getLine() + ": " + currType.getName() + " must be interface type");
    	}
    }
    
    public void visit (ClassDecl cd) {
    	
    	
    	if (currNode != null) {
    		
    		
        	        	
			for (Obj eai : extendedAndImplemented) {
        		
				//log.error("eai.getType().getMembers().size: " + eai.getType().getMembers().size());
				for (Obj mem : eai.getType().getMembers()) {
					
					Obj found = Tab.currentScope().findSymbol(mem.getName());
					
					if (found == null) {
						//log.error("FOUND JE NULL");
						if (mem.getKind() == Obj.Fld)
							Tab.insert(mem.getKind(), mem.getName(), mem.getType());		
						else if (mem.getKind() == Obj.Meth && eai.getType().getKind() == Struct.Class) {
							Obj inheritedMethod = Tab.insert(mem.getKind(), mem.getName(), mem.getType());
							Tab.openScope();
							
							for (Obj sym : mem.getLocalSymbols()) {
								Tab.insert(sym.getKind(), sym.getName(), sym.getType());
							}
							
							Tab.chainLocalSymbols(inheritedMethod);
							Tab.closeScope();
						}
						else if (mem.getKind() == Obj.Meth && eai.getType().getKind() == Struct.Interface) {
							log.error("Semantic error: " + currNode.getName() + " must implement inherited method " + mem.getName() + " from interface " + eai.getName());
						}
					}
					else {
						//log.error("FOUND NIJE NULL");
						if (mem.getKind() == Obj.Meth && eai.getType().getKind() == Struct.Interface) {
							
							if (!found.equals(mem))
								log.error("Semantic error: implemented method " + found.getName() + " doesn't correspond to inherited method " + mem.getName() + " from interface " + eai.getName());
						}
					}
				}
        	}
        		
    		//Tab.find(currNode.getName()).getType().setMembers(innerElems);
    		Tab.chainLocalSymbols(currNode.getType());
    		Tab.closeScope();
    		currNode = null;
    	}
    }
    
    /* (end) class declarations */
    
    /* class variables */
    
    public void visit (SingleClassVarDecl scvd) {
    	
    	if (currType != null) {
    		
    		Obj varFound = /*innerElems.searchKey(scvd.getClassVarName());*/ Tab.currentScope().findSymbol(scvd.getClassVarName());
    		
    		if (varFound == null) {
    			
    			if (scvd.getClassVarArrayOption() instanceof NoClassArrayVariable) {
    				Tab.insert(Obj.Fld, scvd.getClassVarName(), currType.getType());
    			}
    			else if (scvd.getClassVarArrayOption() instanceof ClassArrayVariable) {
    				Tab.insert(Obj.Fld, scvd.getClassVarName(), new Struct (Struct.Array, currType.getType()));
    			}
    	    	else log.info("GRESKA!!!"); 
    			log.info("Declared class variable: " + scvd.getClassVarName() + " in class: " + currNode.getName() + ", of type: " + currType.getName() + " on line " + scvd.getLine() );
    			
    		}
    		else {
    			
    			log.error ("Semantic error on line " + scvd.getLine() + ": field " + scvd.getClassVarName() + " of class " + currNode.getName() + " already declared");
    			semanticErrorFound = true;
    			
    		}
    		
    	}
    	
    }
    
    /* (end) class variables */
    
    /* class methods */
    
    public void visit (ClassMethodName cmn) {
    	
    	if (currType != null && currNode != null) {
	    	Obj declaredMethod = /*innerElems.searchKey(cmn.getClassMethodName());*/ Tab.currentScope().findSymbol(cmn.getClassMethodName());
	    	if (declaredMethod != null) {
	    		log.error("Semantic error on line " + cmn.getLine() + ": " + cmn.getClassMethodName() + " already declared in class " + currNode.getName());
	    		currMethod = null;
	    	}
	    	else {
	    		currMethod = Tab.insert(Obj.Meth, cmn.getClassMethodName(), currType.getType());
	    		Tab.openScope();
	    		numOfFormPars = 0;
	    		log.info("Declared method: " + cmn.getClassMethodName() + " in class: " + currNode.getName() + " with return type: " + currType.getName() + " on line: " + cmn.getLine());
	    	}
    	}
    	else
    		currMethod = null;
    }
    
    public void visit (ClassMethodDecl cmd) {
    	
    	if (currMethod != null) {
    		Tab.chainLocalSymbols(currMethod);
    		Tab.closeScope();
    		log.info("numOfFormPars: " + numOfFormPars);
    		currMethod.setLevel(numOfFormPars);
    		numOfFormPars = 0;
    		currMethod = null;
    	}
    }
    
    /* (end) class methods */
    
    /* global methods */
    
    public void visit (MethodName mn) {
    	
    	if (currType != null) {
	    	Obj declaredMethod = Tab.currentScope().findSymbol(mn.getMethodName());
	    	if (declaredMethod != null) {
	    		log.error("Semantic error on line " + mn.getLine() + ": method " + mn.getMethodName() + " already declared ");
	    		currMethod = null;
	    	}
	    	else {
	    		currMethod = Tab.insert(Obj.Meth, mn.getMethodName(), currType.getType());
	    		Tab.openScope();
	    		numOfFormPars = 0;
	    		log.info("Declared method: " + mn.getMethodName() + " with return type: " + currType.getName() + " on line: " + mn.getLine());
	    	}
    	}
    	else
    		currMethod = null;
    }
    
    public void visit (MethodDecl md) {
    	
    	if (currMethod != null) {
    		Tab.chainLocalSymbols(currMethod);
    		Tab.closeScope();
    		currMethod.setLevel(numOfFormPars);
    		log.info("numOfFormPars: " + numOfFormPars);
    		numOfFormPars = 0;
    		currMethod = null;
    	}
    }
    
    /* (end) global methods */
    
    /* class method variables */
    
    public void visit (SingleClassMethodVarDecl scmvd) {
    	
    	if (currType != null && currMethod != null ) {
    		
    		Obj varFound = Tab.currentScope().findSymbol(scmvd.getClassMethodVarName());
    		
    		if (varFound == null) {
    			
    			if (scmvd.getClassMethodVarArrayOption() instanceof ClassMethodNoArrayVariable) {
    				Tab.insert(Obj.Var, scmvd.getClassMethodVarName(), currType.getType());
    			}
    			else if (scmvd.getClassMethodVarArrayOption() instanceof ClassMethodArrayVariable) {
    				Tab.insert(Obj.Var, scmvd.getClassMethodVarName(), new Struct (Struct.Array, currType.getType()));
    			}
    	    	else log.info("GRESKA!!!"); 
    			log.info("Declared method variable: " + scmvd.getClassMethodVarName() + " in method " + currMethod.getName() + " in class: " + currNode.getName() + ", of type: " + currType.getName() + " on line " + scmvd.getLine() );
    			
    		}
    		else {
    			
    			log.error ("Semantic error on line " + scmvd.getLine() + ": variable " + scmvd.getClassMethodVarName() + " of method " + currMethod.getName() + " of class " + currNode.getName() + " already declared");
    			semanticErrorFound = true;
    			
    		}
    		
    	}
    	
    }
    
    /* (end) class method variables */
    
    /* global method variables */
    
    public void visit (SingleMethodVarDecl smvd) {
    	
    	if (currType != null && currMethod != null ) {
    		
    		Obj varFound = Tab.currentScope().findSymbol(smvd.getMethodVarName());
    		
    		if (varFound == null) {
    			
    			if (smvd.getMethodVarArrayOption() instanceof NoMethodArrayVariable) {
    				Tab.insert(Obj.Var, smvd.getMethodVarName(), currType.getType());
    			}
    			else if (smvd.getMethodVarArrayOption() instanceof MethodArrayVariable) {
    				Tab.insert(Obj.Var, smvd.getMethodVarName(), new Struct (Struct.Array, currType.getType()));
    			}
    	    	else log.info("GRESKA!!!"); 
    			log.info("Declared method variable: " + smvd.getMethodVarName() + " in method " + currMethod.getName() + ", of type: " + currType.getName() + " on line " + smvd.getLine() );
    			
    		}
    		else {
    			
    			log.error ("Semantic error on line " + smvd.getLine() + ": variable " + smvd.getMethodVarName() + " of method " + currMethod.getName() + " already declared");
    			semanticErrorFound = true;
    			
    		}
    		
    	}
    	
    }
    
    /* (end) global method variables */
    
    /* formal parameters */
    public void visit (SingleFormParSuccess sfps) {
    	
    	if (currType != null && currMethod != null ) {
    		
    		Obj varFound = Tab.currentScope().findSymbol(sfps.getFormParName());
    		
    		if (varFound == null) {
    			
    			Obj formPar;
    			if (sfps.getFormParArrayOption() instanceof FormParNoArray) {
    				formPar = Tab.insert(Obj.Var, sfps.getFormParName(), currType.getType());
    				log.info("Tab.currentScope().getnVars(): " + Tab.currentScope().getnVars());
    				formPar.setFpPos(numOfFormPars++);
    			}
    			else if (sfps.getFormParArrayOption() instanceof FormParArray) {
    				formPar = Tab.insert(Obj.Var, sfps.getFormParName(), new Struct (Struct.Array, currType.getType()));
    				log.info("Tab.currentScope().getnVars(): " + Tab.currentScope().getnVars());
    				formPar.setFpPos(numOfFormPars++);
    			}
    	    	else log.info("GRESKA!!!"); 
    			    			
    			log.info("Declared formal parameter: " + sfps.getFormParName() + " in method " + currMethod.getName() + ", of type: " + currType.getName() + " on line " + sfps.getLine() );
    			
    		}
    		else {
    			
    			log.error ("Semantic error on line " + sfps.getLine() + ": formal parameter " + sfps.getFormParName() + " of method " + currMethod.getName() + " already declared");
    			semanticErrorFound = true;
    			
    		}
    		
    	}
    	
    }
    
    /* (end) formal parameters */
}
