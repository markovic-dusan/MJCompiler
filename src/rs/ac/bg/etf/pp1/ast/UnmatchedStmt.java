// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedStmt extends Statement {

    private UnmatchedStatement UnmatchedStatement;

    public UnmatchedStmt (UnmatchedStatement UnmatchedStatement) {
        this.UnmatchedStatement=UnmatchedStatement;
        if(UnmatchedStatement!=null) UnmatchedStatement.setParent(this);
    }

    public UnmatchedStatement getUnmatchedStatement() {
        return UnmatchedStatement;
    }

    public void setUnmatchedStatement(UnmatchedStatement UnmatchedStatement) {
        this.UnmatchedStatement=UnmatchedStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(UnmatchedStatement!=null) UnmatchedStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedStmt(\n");

        if(UnmatchedStatement!=null)
            buffer.append(UnmatchedStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedStmt]");
        return buffer.toString();
    }
}
