package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.BoolConst;
import rs.ac.bg.etf.pp1.ast.CharConst;
import rs.ac.bg.etf.pp1.ast.ConstDecl;
import rs.ac.bg.etf.pp1.ast.ConstDeclError;
import rs.ac.bg.etf.pp1.ast.ConstDeclSuccess;
import rs.ac.bg.etf.pp1.ast.NumConst;
import rs.ac.bg.etf.pp1.ast.Program;
import rs.ac.bg.etf.pp1.ast.ProgramName;
import rs.ac.bg.etf.pp1.ast.SingleConstDeclSuccess;
import rs.ac.bg.etf.pp1.ast.SingleVarDeclSuccess;
import rs.ac.bg.etf.pp1.ast.Type;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class SemanticAnalyzer extends VisitorAdaptor {

	private Logger log = Logger.getLogger(getClass());
	
	public void visit(Program Program) { 
		
		log.info("Program visited");
	}
	
	public void visit(ProgramName ProgramName) {
		log.info("ProgramName Visited");
		log.info("ProgramName: " + ProgramName.getProgramName());
	}
	
	public void visit(ConstDeclError ConstDeclError) { 
		
	}
	
	public void visit(ConstDecl ConstDecl) { 
		if (ConstDecl.getConstSyntaxCheck() instanceof ConstDeclSuccess)
			log.info("Global Constant Declared on line " + ConstDecl.getLine());
		else if (ConstDecl.getConstSyntaxCheck() instanceof ConstDeclError)
			log.error("FromVisitor- 1Syntax Error on line " + ConstDecl.getLine() + "; error in constant declaration");
	}
	
	public void visit(Type Type) { 
		log.info("Type: " + Type.getTypeName());
		log.info("TypeLine: " + Type.getLine());
	}
	
	public void visit(SingleConstDeclSuccess SingleConstDeclSuccess) { 
		log.info("ConstName: " + SingleConstDeclSuccess.getConstName());
		log.info("ConstNameLine: " + SingleConstDeclSuccess.getLine());
	}
	
	public void visit(SingleVarDeclSuccess SingleVarDeclSuccess) { 
		log.info("VarName: " + SingleVarDeclSuccess.getVarName());
		log.info("VarNameLine: " + SingleVarDeclSuccess.getLine());
	}
	
	public void visit(BoolConst BoolConst) { 
		log.info("ConstValue: " + BoolConst.getBoolValue());
		log.info("ConstValueLine: " + BoolConst.getLine());
	}
    
	public void visit(CharConst CharConst) { 
		log.info("ConstValue: " + CharConst.getCharValue());
		log.info("ConstValueLine: " + CharConst.getLine());
	}
	
    public void visit(NumConst NumConst) { 
    	log.info("ConstValue: " + NumConst.getNumberValue());
    	log.info("ConstValueLine: " + NumConst.getLine());
    }
}
