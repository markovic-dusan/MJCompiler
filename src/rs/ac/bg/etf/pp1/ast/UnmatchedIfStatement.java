// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedIfStatement extends UnmatchedStatement {

    private ConditionSyntaxCheck ConditionSyntaxCheck;
    private Statement Statement;

    public UnmatchedIfStatement (ConditionSyntaxCheck ConditionSyntaxCheck, Statement Statement) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public ConditionSyntaxCheck getConditionSyntaxCheck() {
        return ConditionSyntaxCheck;
    }

    public void setConditionSyntaxCheck(ConditionSyntaxCheck ConditionSyntaxCheck) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedIfStatement(\n");

        if(ConditionSyntaxCheck!=null)
            buffer.append(ConditionSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedIfStatement]");
        return buffer.toString();
    }
}
