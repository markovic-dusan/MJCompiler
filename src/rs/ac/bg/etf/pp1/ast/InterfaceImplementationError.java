// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class InterfaceImplementationError extends ImplementsSyntaxCheck {

    public InterfaceImplementationError () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceImplementationError(\n");

        buffer.append(tab);
        buffer.append(") [InterfaceImplementationError]");
        return buffer.toString();
    }
}