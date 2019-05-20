// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleClassVarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String classVarName;
    private ClassVarArrayOption ClassVarArrayOption;

    public SingleClassVarDecl (String classVarName, ClassVarArrayOption ClassVarArrayOption) {
        this.classVarName=classVarName;
        this.ClassVarArrayOption=ClassVarArrayOption;
        if(ClassVarArrayOption!=null) ClassVarArrayOption.setParent(this);
    }

    public String getClassVarName() {
        return classVarName;
    }

    public void setClassVarName(String classVarName) {
        this.classVarName=classVarName;
    }

    public ClassVarArrayOption getClassVarArrayOption() {
        return ClassVarArrayOption;
    }

    public void setClassVarArrayOption(ClassVarArrayOption ClassVarArrayOption) {
        this.ClassVarArrayOption=ClassVarArrayOption;
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
        if(ClassVarArrayOption!=null) ClassVarArrayOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassVarArrayOption!=null) ClassVarArrayOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassVarArrayOption!=null) ClassVarArrayOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleClassVarDecl(\n");

        buffer.append(" "+tab+classVarName);
        buffer.append("\n");

        if(ClassVarArrayOption!=null)
            buffer.append(ClassVarArrayOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleClassVarDecl]");
        return buffer.toString();
    }
}
