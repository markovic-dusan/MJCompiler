// generated with ast extension for cup
// version 0.8
// 7/4/2019 18:35:49


package rs.ac.bg.etf.pp1.ast;

public class NoGlobalMethodsDeclarations extends MethodDeclarationsList {

    public NoGlobalMethodsDeclarations () {
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
        buffer.append("NoGlobalMethodsDeclarations(\n");

        buffer.append(tab);
        buffer.append(") [NoGlobalMethodsDeclarations]");
        return buffer.toString();
    }
}
