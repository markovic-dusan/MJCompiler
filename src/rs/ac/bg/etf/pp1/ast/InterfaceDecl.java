// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private InterfaceSyntaxCheck InterfaceSyntaxCheck;

    public InterfaceDecl (InterfaceSyntaxCheck InterfaceSyntaxCheck) {
        this.InterfaceSyntaxCheck=InterfaceSyntaxCheck;
        if(InterfaceSyntaxCheck!=null) InterfaceSyntaxCheck.setParent(this);
    }

    public InterfaceSyntaxCheck getInterfaceSyntaxCheck() {
        return InterfaceSyntaxCheck;
    }

    public void setInterfaceSyntaxCheck(InterfaceSyntaxCheck InterfaceSyntaxCheck) {
        this.InterfaceSyntaxCheck=InterfaceSyntaxCheck;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(InterfaceSyntaxCheck!=null) InterfaceSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceSyntaxCheck!=null) InterfaceSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceSyntaxCheck!=null) InterfaceSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceDecl(\n");

        if(InterfaceSyntaxCheck!=null)
            buffer.append(InterfaceSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceDecl]");
        return buffer.toString();
    }
}
