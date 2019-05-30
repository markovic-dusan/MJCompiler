// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceMethodDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ReturnType ReturnType;
    private InterfaceMethodName InterfaceMethodName;
    private FormParsOption FormParsOption;

    public InterfaceMethodDecl (ReturnType ReturnType, InterfaceMethodName InterfaceMethodName, FormParsOption FormParsOption) {
        this.ReturnType=ReturnType;
        if(ReturnType!=null) ReturnType.setParent(this);
        this.InterfaceMethodName=InterfaceMethodName;
        if(InterfaceMethodName!=null) InterfaceMethodName.setParent(this);
        this.FormParsOption=FormParsOption;
        if(FormParsOption!=null) FormParsOption.setParent(this);
    }

    public ReturnType getReturnType() {
        return ReturnType;
    }

    public void setReturnType(ReturnType ReturnType) {
        this.ReturnType=ReturnType;
    }

    public InterfaceMethodName getInterfaceMethodName() {
        return InterfaceMethodName;
    }

    public void setInterfaceMethodName(InterfaceMethodName InterfaceMethodName) {
        this.InterfaceMethodName=InterfaceMethodName;
    }

    public FormParsOption getFormParsOption() {
        return FormParsOption;
    }

    public void setFormParsOption(FormParsOption FormParsOption) {
        this.FormParsOption=FormParsOption;
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
        if(ReturnType!=null) ReturnType.accept(visitor);
        if(InterfaceMethodName!=null) InterfaceMethodName.accept(visitor);
        if(FormParsOption!=null) FormParsOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnType!=null) ReturnType.traverseTopDown(visitor);
        if(InterfaceMethodName!=null) InterfaceMethodName.traverseTopDown(visitor);
        if(FormParsOption!=null) FormParsOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnType!=null) ReturnType.traverseBottomUp(visitor);
        if(InterfaceMethodName!=null) InterfaceMethodName.traverseBottomUp(visitor);
        if(FormParsOption!=null) FormParsOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceMethodDecl(\n");

        if(ReturnType!=null)
            buffer.append(ReturnType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(InterfaceMethodName!=null)
            buffer.append(InterfaceMethodName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParsOption!=null)
            buffer.append(FormParsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceMethodDecl]");
        return buffer.toString();
    }
}
