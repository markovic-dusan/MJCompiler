// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceImplementation extends ImplementsOption {

    private ImplementsSyntaxCheck ImplementsSyntaxCheck;

    public InterfaceImplementation (ImplementsSyntaxCheck ImplementsSyntaxCheck) {
        this.ImplementsSyntaxCheck=ImplementsSyntaxCheck;
        if(ImplementsSyntaxCheck!=null) ImplementsSyntaxCheck.setParent(this);
    }

    public ImplementsSyntaxCheck getImplementsSyntaxCheck() {
        return ImplementsSyntaxCheck;
    }

    public void setImplementsSyntaxCheck(ImplementsSyntaxCheck ImplementsSyntaxCheck) {
        this.ImplementsSyntaxCheck=ImplementsSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ImplementsSyntaxCheck!=null) ImplementsSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ImplementsSyntaxCheck!=null) ImplementsSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ImplementsSyntaxCheck!=null) ImplementsSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceImplementation(\n");

        if(ImplementsSyntaxCheck!=null)
            buffer.append(ImplementsSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceImplementation]");
        return buffer.toString();
    }
}
