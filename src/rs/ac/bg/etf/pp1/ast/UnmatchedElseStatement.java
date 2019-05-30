// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedElseStatement extends UnmatchedStatement {

    private ConditionSyntaxCheck ConditionSyntaxCheck;
    private MatchedStatement MatchedStatement;
    private UnmatchedStatement UnmatchedStatement;

    public UnmatchedElseStatement (ConditionSyntaxCheck ConditionSyntaxCheck, MatchedStatement MatchedStatement, UnmatchedStatement UnmatchedStatement) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.setParent(this);
        this.MatchedStatement=MatchedStatement;
        if(MatchedStatement!=null) MatchedStatement.setParent(this);
        this.UnmatchedStatement=UnmatchedStatement;
        if(UnmatchedStatement!=null) UnmatchedStatement.setParent(this);
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
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.accept(visitor);
        if(MatchedStatement!=null) MatchedStatement.accept(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseTopDown(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseTopDown(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseBottomUp(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseBottomUp(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedElseStatement(\n");

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

        if(UnmatchedStatement!=null)
            buffer.append(UnmatchedStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedElseStatement]");
        return buffer.toString();
    }
}
