// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassMethodName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String classMethodName;

    public ClassMethodName (String classMethodName) {
        this.classMethodName=classMethodName;
    }

    public String getClassMethodName() {
        return classMethodName;
    }

    public void setClassMethodName(String classMethodName) {
        this.classMethodName=classMethodName;
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
        buffer.append("ClassMethodName(\n");

        buffer.append(" "+tab+classMethodName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodName]");
        return buffer.toString();
    }
}
