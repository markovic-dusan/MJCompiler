// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class MultipleInterfaces extends InterfaceList {

    private InterfaceList InterfaceList;
    private InterfaceImplemented InterfaceImplemented;

    public MultipleInterfaces (InterfaceList InterfaceList, InterfaceImplemented InterfaceImplemented) {
        this.InterfaceList=InterfaceList;
        if(InterfaceList!=null) InterfaceList.setParent(this);
        this.InterfaceImplemented=InterfaceImplemented;
        if(InterfaceImplemented!=null) InterfaceImplemented.setParent(this);
    }

    public InterfaceList getInterfaceList() {
        return InterfaceList;
    }

    public void setInterfaceList(InterfaceList InterfaceList) {
        this.InterfaceList=InterfaceList;
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
        if(InterfaceList!=null) InterfaceList.accept(visitor);
        if(InterfaceImplemented!=null) InterfaceImplemented.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceList!=null) InterfaceList.traverseTopDown(visitor);
        if(InterfaceImplemented!=null) InterfaceImplemented.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceList!=null) InterfaceList.traverseBottomUp(visitor);
        if(InterfaceImplemented!=null) InterfaceImplemented.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleInterfaces(\n");

        if(InterfaceList!=null)
            buffer.append(InterfaceList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(InterfaceImplemented!=null)
            buffer.append(InterfaceImplemented.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleInterfaces]");
        return buffer.toString();
    }
}
