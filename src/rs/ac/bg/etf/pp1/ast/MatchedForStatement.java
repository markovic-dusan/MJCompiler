// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class MatchedForStatement extends MatchedStatement {

    private FirstForDesignatorOption FirstForDesignatorOption;
    private ForConditionOption ForConditionOption;
    private SecondForDesignatorOption SecondForDesignatorOption;
    private MatchedStatement MatchedStatement;

    public MatchedForStatement (FirstForDesignatorOption FirstForDesignatorOption, ForConditionOption ForConditionOption, SecondForDesignatorOption SecondForDesignatorOption, MatchedStatement MatchedStatement) {
        this.FirstForDesignatorOption=FirstForDesignatorOption;
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.setParent(this);
        this.ForConditionOption=ForConditionOption;
        if(ForConditionOption!=null) ForConditionOption.setParent(this);
        this.SecondForDesignatorOption=SecondForDesignatorOption;
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.setParent(this);
        this.MatchedStatement=MatchedStatement;
        if(MatchedStatement!=null) MatchedStatement.setParent(this);
    }

    public FirstForDesignatorOption getFirstForDesignatorOption() {
        return FirstForDesignatorOption;
    }

    public void setFirstForDesignatorOption(FirstForDesignatorOption FirstForDesignatorOption) {
        this.FirstForDesignatorOption=FirstForDesignatorOption;
    }

    public ForConditionOption getForConditionOption() {
        return ForConditionOption;
    }

    public void setForConditionOption(ForConditionOption ForConditionOption) {
        this.ForConditionOption=ForConditionOption;
    }

    public SecondForDesignatorOption getSecondForDesignatorOption() {
        return SecondForDesignatorOption;
    }

    public void setSecondForDesignatorOption(SecondForDesignatorOption SecondForDesignatorOption) {
        this.SecondForDesignatorOption=SecondForDesignatorOption;
    }

    public MatchedStatement getMatchedStatement() {
        return MatchedStatement;
    }

    public void setMatchedStatement(MatchedStatement MatchedStatement) {
        this.MatchedStatement=MatchedStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.accept(visitor);
        if(ForConditionOption!=null) ForConditionOption.accept(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.accept(visitor);
        if(MatchedStatement!=null) MatchedStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.traverseTopDown(visitor);
        if(ForConditionOption!=null) ForConditionOption.traverseTopDown(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.traverseTopDown(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.traverseBottomUp(visitor);
        if(ForConditionOption!=null) ForConditionOption.traverseBottomUp(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.traverseBottomUp(visitor);
        if(MatchedStatement!=null) MatchedStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedForStatement(\n");

        if(FirstForDesignatorOption!=null)
            buffer.append(FirstForDesignatorOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ForConditionOption!=null)
            buffer.append(ForConditionOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SecondForDesignatorOption!=null)
            buffer.append(SecondForDesignatorOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MatchedStatement!=null)
            buffer.append(MatchedStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedForStatement]");
        return buffer.toString();
    }
}
