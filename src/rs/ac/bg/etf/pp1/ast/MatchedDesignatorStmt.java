// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MatchedDesignatorStmt extends MatchedStatement {

    private MatchedDesignatorStatement MatchedDesignatorStatement;

    public MatchedDesignatorStmt (MatchedDesignatorStatement MatchedDesignatorStatement) {
        this.MatchedDesignatorStatement=MatchedDesignatorStatement;
        if(MatchedDesignatorStatement!=null) MatchedDesignatorStatement.setParent(this);
    }

    public MatchedDesignatorStatement getMatchedDesignatorStatement() {
        return MatchedDesignatorStatement;
    }

    public void setMatchedDesignatorStatement(MatchedDesignatorStatement MatchedDesignatorStatement) {
        this.MatchedDesignatorStatement=MatchedDesignatorStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MatchedDesignatorStatement!=null) MatchedDesignatorStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MatchedDesignatorStatement!=null) MatchedDesignatorStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MatchedDesignatorStatement!=null) MatchedDesignatorStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedDesignatorStmt(\n");

        if(MatchedDesignatorStatement!=null)
            buffer.append(MatchedDesignatorStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedDesignatorStmt]");
        return buffer.toString();
    }
}
