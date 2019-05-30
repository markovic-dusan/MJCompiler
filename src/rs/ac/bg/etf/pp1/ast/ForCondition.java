// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ForCondition extends ForConditionOption {

    private ConditionSyntaxCheck ConditionSyntaxCheck;

    public ForCondition (ConditionSyntaxCheck ConditionSyntaxCheck) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.setParent(this);
    }

    public ConditionSyntaxCheck getConditionSyntaxCheck() {
        return ConditionSyntaxCheck;
    }

    public void setConditionSyntaxCheck(ConditionSyntaxCheck ConditionSyntaxCheck) {
        this.ConditionSyntaxCheck=ConditionSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionSyntaxCheck!=null) ConditionSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ForCondition(\n");

        if(ConditionSyntaxCheck!=null)
            buffer.append(ConditionSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ForCondition]");
        return buffer.toString();
    }
}
