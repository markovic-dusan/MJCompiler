// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ClassName ClassName;
    private ExtendsOption ExtendsOption;
    private ImplementsOption ImplementsOption;
    private ClassVarDeclList ClassVarDeclList;
    private ClassMethodsOption ClassMethodsOption;

    public ClassDecl (ClassName ClassName, ExtendsOption ExtendsOption, ImplementsOption ImplementsOption, ClassVarDeclList ClassVarDeclList, ClassMethodsOption ClassMethodsOption) {
        this.ClassName=ClassName;
        if(ClassName!=null) ClassName.setParent(this);
        this.ExtendsOption=ExtendsOption;
        if(ExtendsOption!=null) ExtendsOption.setParent(this);
        this.ImplementsOption=ImplementsOption;
        if(ImplementsOption!=null) ImplementsOption.setParent(this);
        this.ClassVarDeclList=ClassVarDeclList;
        if(ClassVarDeclList!=null) ClassVarDeclList.setParent(this);
        this.ClassMethodsOption=ClassMethodsOption;
        if(ClassMethodsOption!=null) ClassMethodsOption.setParent(this);
    }

    public ClassName getClassName() {
        return ClassName;
    }

    public void setClassName(ClassName ClassName) {
        this.ClassName=ClassName;
    }

    public ExtendsOption getExtendsOption() {
        return ExtendsOption;
    }

    public void setExtendsOption(ExtendsOption ExtendsOption) {
        this.ExtendsOption=ExtendsOption;
    }

    public ImplementsOption getImplementsOption() {
        return ImplementsOption;
    }

    public void setImplementsOption(ImplementsOption ImplementsOption) {
        this.ImplementsOption=ImplementsOption;
    }

    public ClassVarDeclList getClassVarDeclList() {
        return ClassVarDeclList;
    }

    public void setClassVarDeclList(ClassVarDeclList ClassVarDeclList) {
        this.ClassVarDeclList=ClassVarDeclList;
    }

    public ClassMethodsOption getClassMethodsOption() {
        return ClassMethodsOption;
    }

    public void setClassMethodsOption(ClassMethodsOption ClassMethodsOption) {
        this.ClassMethodsOption=ClassMethodsOption;
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
        if(ClassName!=null) ClassName.accept(visitor);
        if(ExtendsOption!=null) ExtendsOption.accept(visitor);
        if(ImplementsOption!=null) ImplementsOption.accept(visitor);
        if(ClassVarDeclList!=null) ClassVarDeclList.accept(visitor);
        if(ClassMethodsOption!=null) ClassMethodsOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassName!=null) ClassName.traverseTopDown(visitor);
        if(ExtendsOption!=null) ExtendsOption.traverseTopDown(visitor);
        if(ImplementsOption!=null) ImplementsOption.traverseTopDown(visitor);
        if(ClassVarDeclList!=null) ClassVarDeclList.traverseTopDown(visitor);
        if(ClassMethodsOption!=null) ClassMethodsOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassName!=null) ClassName.traverseBottomUp(visitor);
        if(ExtendsOption!=null) ExtendsOption.traverseBottomUp(visitor);
        if(ImplementsOption!=null) ImplementsOption.traverseBottomUp(visitor);
        if(ClassVarDeclList!=null) ClassVarDeclList.traverseBottomUp(visitor);
        if(ClassMethodsOption!=null) ClassMethodsOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl(\n");

        if(ClassName!=null)
            buffer.append(ClassName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExtendsOption!=null)
            buffer.append(ExtendsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ImplementsOption!=null)
            buffer.append(ImplementsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassVarDeclList!=null)
            buffer.append(ClassVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodsOption!=null)
            buffer.append(ClassMethodsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl]");
        return buffer.toString();
    }
}
