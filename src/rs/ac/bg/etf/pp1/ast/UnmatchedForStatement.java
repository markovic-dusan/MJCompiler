// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class UnmatchedForStatement extends UnmatchedStatement {

    private FirstForDesignatorOption FirstForDesignatorOption;
    private ForConditionOption ForConditionOption;
    private SecondForDesignatorOption SecondForDesignatorOption;
    private UnmatchedStatement UnmatchedStatement;

    public UnmatchedForStatement (FirstForDesignatorOption FirstForDesignatorOption, ForConditionOption ForConditionOption, SecondForDesignatorOption SecondForDesignatorOption, UnmatchedStatement UnmatchedStatement) {
        this.FirstForDesignatorOption=FirstForDesignatorOption;
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.setParent(this);
        this.ForConditionOption=ForConditionOption;
        if(ForConditionOption!=null) ForConditionOption.setParent(this);
        this.SecondForDesignatorOption=SecondForDesignatorOption;
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.setParent(this);
        this.UnmatchedStatement=UnmatchedStatement;
        if(UnmatchedStatement!=null) UnmatchedStatement.setParent(this);
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
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.accept(visitor);
        if(ForConditionOption!=null) ForConditionOption.accept(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.accept(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.traverseTopDown(visitor);
        if(ForConditionOption!=null) ForConditionOption.traverseTopDown(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.traverseTopDown(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FirstForDesignatorOption!=null) FirstForDesignatorOption.traverseBottomUp(visitor);
        if(ForConditionOption!=null) ForConditionOption.traverseBottomUp(visitor);
        if(SecondForDesignatorOption!=null) SecondForDesignatorOption.traverseBottomUp(visitor);
        if(UnmatchedStatement!=null) UnmatchedStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedForStatement(\n");

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

        if(UnmatchedStatement!=null)
            buffer.append(UnmatchedStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedForStatement]");
        return buffer.toString();
    }
}
