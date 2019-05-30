// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class SingleConstDeclSuccess extends SingleConstDeclSyntaxCheck {

    private ConstName ConstName;
    private ConstValue ConstValue;

    public SingleConstDeclSuccess (ConstName ConstName, ConstValue ConstValue) {
        this.ConstName=ConstName;
        if(ConstName!=null) ConstName.setParent(this);
        this.ConstValue=ConstValue;
        if(ConstValue!=null) ConstValue.setParent(this);
    }

    public ConstName getConstName() {
        return ConstName;
    }

    public void setConstName(ConstName ConstName) {
        this.ConstName=ConstName;
    }

    public ConstValue getConstValue() {
        return ConstValue;
    }

    public void setConstValue(ConstValue ConstValue) {
        this.ConstValue=ConstValue;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstName!=null) ConstName.accept(visitor);
        if(ConstValue!=null) ConstValue.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstName!=null) ConstName.traverseTopDown(visitor);
        if(ConstValue!=null) ConstValue.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstName!=null) ConstName.traverseBottomUp(visitor);
        if(ConstValue!=null) ConstValue.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleConstDeclSuccess(\n");

        if(ConstName!=null)
            buffer.append(ConstName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstValue!=null)
            buffer.append(ConstValue.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleConstDeclSuccess]");
        return buffer.toString();
    }
}
