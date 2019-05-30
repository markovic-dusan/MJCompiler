// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceMethodName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String interfaceMethodName;

    public InterfaceMethodName (String interfaceMethodName) {
        this.interfaceMethodName=interfaceMethodName;
    }

    public String getInterfaceMethodName() {
        return interfaceMethodName;
    }

    public void setInterfaceMethodName(String interfaceMethodName) {
        this.interfaceMethodName=interfaceMethodName;
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
        buffer.append("InterfaceMethodName(\n");

        buffer.append(" "+tab+interfaceMethodName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceMethodName]");
        return buffer.toString();
    }
}
