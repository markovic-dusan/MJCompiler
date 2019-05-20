// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleInterface extends InterfaceList {

    private InterfaceImplemented InterfaceImplemented;

    public SingleInterface (InterfaceImplemented InterfaceImplemented) {
        this.InterfaceImplemented=InterfaceImplemented;
        if(InterfaceImplemented!=null) InterfaceImplemented.setParent(this);
    }

    public InterfaceImplemented getInterfaceImplemented() {
        return InterfaceImplemented;
    }

    public void setInterfaceImplemented(InterfaceImplemented InterfaceImplemented) {
        this.InterfaceImplemented=InterfaceImplemented;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(InterfaceImplemented!=null) InterfaceImplemented.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceImplemented!=null) InterfaceImplemented.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceImplemented!=null) InterfaceImplemented.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleInterface(\n");

        if(InterfaceImplemented!=null)
            buffer.append(InterfaceImplemented.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleInterface]");
        return buffer.toString();
    }
}
