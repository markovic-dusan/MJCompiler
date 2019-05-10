// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class SingleClassMethodVarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String classMethodVarName;
    private ClassMethodVarArrayOption ClassMethodVarArrayOption;

    public SingleClassMethodVarDecl (String classMethodVarName, ClassMethodVarArrayOption ClassMethodVarArrayOption) {
        this.classMethodVarName=classMethodVarName;
        this.ClassMethodVarArrayOption=ClassMethodVarArrayOption;
        if(ClassMethodVarArrayOption!=null) ClassMethodVarArrayOption.setParent(this);
    }

    public String getClassMethodVarName() {
        return classMethodVarName;
    }

    public void setClassMethodVarName(String classMethodVarName) {
        this.classMethodVarName=classMethodVarName;
    }

    public ClassMethodVarArrayOption getClassMethodVarArrayOption() {
        return ClassMethodVarArrayOption;
    }

    public void setClassMethodVarArrayOption(ClassMethodVarArrayOption ClassMethodVarArrayOption) {
        this.ClassMethodVarArrayOption=ClassMethodVarArrayOption;
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
        if(ClassMethodVarArrayOption!=null) ClassMethodVarArrayOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassMethodVarArrayOption!=null) ClassMethodVarArrayOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassMethodVarArrayOption!=null) ClassMethodVarArrayOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleClassMethodVarDecl(\n");

        buffer.append(" "+tab+classMethodVarName);
        buffer.append("\n");

        if(ClassMethodVarArrayOption!=null)
            buffer.append(ClassMethodVarArrayOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleClassMethodVarDecl]");
        return buffer.toString();
    }
}
