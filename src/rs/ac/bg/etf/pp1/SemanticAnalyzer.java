package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.BoolConst;
import rs.ac.bg.etf.pp1.ast.CharConst;
import rs.ac.bg.etf.pp1.ast.ConstDecl;
import rs.ac.bg.etf.pp1.ast.NumConst;
import rs.ac.bg.etf.pp1.ast.Program;
import rs.ac.bg.etf.pp1.ast.SingleConstDecl;
import rs.ac.bg.etf.pp1.ast.SingleConstDeclSuccess;
import rs.ac.bg.etf.pp1.ast.Type;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class SemanticAnalyzer extends VisitorAdaptor {

	private Logger log = Logger.getLogger(getClass());
	
	public void visit(Program Program) { 
		
		log.info("Program visited");
	}
	
	public void visit(ConstDecl ConstDecl) { 
		log.info("Global Constant Declared");
	}
	
	public void visit(Type Type) { 
		log.info("Type: " + Type.getTypeName());
	}
	
	public void visit(SingleConstDeclSuccess SingleConstDeclSuccess) { 
		log.info("ConstName: " + SingleConstDeclSuccess.getConstName());
	}
	
	public void visit(BoolConst BoolConst) { 
		log.info("ConstValue: " + BoolConst.getBoolValue());
	}
    
	public void visit(CharConst CharConst) { 
		log.info("ConstValue: " + CharConst.getCharValue());
	}
	
    public void visit(NumConst NumConst) { 
    	log.info("ConstValue: " + NumConst.getNumberValue());
    }
}
