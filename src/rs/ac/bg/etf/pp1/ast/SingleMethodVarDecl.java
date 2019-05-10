// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class SingleMethodVarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String methodVarName;
    private MethodVarArrayOption MethodVarArrayOption;

    public SingleMethodVarDecl (String methodVarName, MethodVarArrayOption MethodVarArrayOption) {
        this.methodVarName=methodVarName;
        this.MethodVarArrayOption=MethodVarArrayOption;
        if(MethodVarArrayOption!=null) MethodVarArrayOption.setParent(this);
    }

    public String getMethodVarName() {
        return methodVarName;
    }

    public void setMethodVarName(String methodVarName) {
        this.methodVarName=methodVarName;
    }

    public MethodVarArrayOption getMethodVarArrayOption() {
        return MethodVarArrayOption;
    }

    public void setMethodVarArrayOption(MethodVarArrayOption MethodVarArrayOption) {
        this.MethodVarArrayOption=MethodVarArrayOption;
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
        if(MethodVarArrayOption!=null) MethodVarArrayOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodVarArrayOption!=null) MethodVarArrayOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodVarArrayOption!=null) MethodVarArrayOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleMethodVarDecl(\n");

        buffer.append(" "+tab+methodVarName);
        buffer.append("\n");

        if(MethodVarArrayOption!=null)
            buffer.append(MethodVarArrayOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleMethodVarDecl]");
        return buffer.toString();
    }
}
