// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class MatchedIfStatement extends MatchedStatement {

    private ConditionSyntaxCheck ConditionSyntaxCheck;
    private MatchedStatement MatchedStatement;
    private MatchedStatement MatchedStatement1;

    public MatchedIfStatement (ConditionSyntaxCheck ConditionSyntaxCheck, MatchedStatement MatchedStatement, MatchedStatement MatchedStatement1) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.setParent(this);
        this.MatchedStatement=MatchedStatement;
        if(MatchedStatement!=null) MatchedStatement.setParent(this);
        this.MatchedStatement1=MatchedStatement1;
        if(MatchedStatement1!=null) MatchedStatement1.setParent(this);
    }

    public ConditionSyntaxCheck getConditionSyntaxCheck() {
        return ConditionSyntaxCheck;
    }

    public void setConditionSyntaxCheck(ConditionSyntaxCheck ConditionSyntaxCheck) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
    }

    public MatchedStatement getMatchedStatement() {
        return MatchedStatement;
    }

    public void setMatchedStatement(MatchedStatement MatchedStatement) {
        this.MatchedStatement=MatchedStatement;
    }

    public MatchedStatement getMatchedStatement1() {
        return MatchedStatement1;
    }

    public void setMatchedStatement1(MatchedStatement MatchedStatement1) {
        this.MatchedStatement1=MatchedStatement1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.accept(visitor);
        if(MatchedStatement!=null) MatchedStatement.accept(visitor);
        if(MatchedStatement1!=null) MatchedStatement1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseTopDown(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseTopDown(visitor);
        if(MatchedStatement1!=null) MatchedStatement1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseBottomUp(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseBottomUp(visitor);
        if(MatchedStatement1!=null) MatchedStatement1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedIfStatement(\n");

        if(ConditionSyntaxCheck!=null)
            buffer.append(ConditionSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MatchedStatement!=null)
            buffer.append(MatchedStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MatchedStatement1!=null)
            buffer.append(MatchedStatement1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedIfStatement]");
        return buffer.toString();
    }
}
