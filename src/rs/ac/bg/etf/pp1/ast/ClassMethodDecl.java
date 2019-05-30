// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassMethodDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ReturnType ReturnType;
    private ClassMethodName ClassMethodName;
    private FormParsOption FormParsOption;
    private ClassMethodVarDeclList ClassMethodVarDeclList;
    private StatementList StatementList;

    public ClassMethodDecl (ReturnType ReturnType, ClassMethodName ClassMethodName, FormParsOption FormParsOption, ClassMethodVarDeclList ClassMethodVarDeclList, StatementList StatementList) {
        this.ReturnType=ReturnType;
        if(ReturnType!=null) ReturnType.setParent(this);
        this.ClassMethodName=ClassMethodName;
        if(ClassMethodName!=null) ClassMethodName.setParent(this);
        this.FormParsOption=FormParsOption;
        if(FormParsOption!=null) FormParsOption.setParent(this);
        this.ClassMethodVarDeclList=ClassMethodVarDeclList;
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
    }

    public ReturnType getReturnType() {
        return ReturnType;
    }

    public void setReturnType(ReturnType ReturnType) {
        this.ReturnType=ReturnType;
    }

    public ClassMethodName getClassMethodName() {
        return ClassMethodName;
    }

    public void setClassMethodName(ClassMethodName ClassMethodName) {
        this.ClassMethodName=ClassMethodName;
    }

    public FormParsOption getFormParsOption() {
        return FormParsOption;
    }

    public void setFormParsOption(FormParsOption FormParsOption) {
        this.FormParsOption=FormParsOption;
    }

    public ClassMethodVarDeclList getClassMethodVarDeclList() {
        return ClassMethodVarDeclList;
    }

    public void setClassMethodVarDeclList(ClassMethodVarDeclList ClassMethodVarDeclList) {
        this.ClassMethodVarDeclList=ClassMethodVarDeclList;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
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
        if(ClassMethodName!=null) ClassMethodName.accept(visitor);
        if(FormParsOption!=null) FormParsOption.accept(visitor);
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnType!=null) ReturnType.traverseTopDown(visitor);
        if(ClassMethodName!=null) ClassMethodName.traverseTopDown(visitor);
        if(FormParsOption!=null) FormParsOption.traverseTopDown(visitor);
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnType!=null) ReturnType.traverseBottomUp(visitor);
        if(ClassMethodName!=null) ClassMethodName.traverseBottomUp(visitor);
        if(FormParsOption!=null) FormParsOption.traverseBottomUp(visitor);
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodDecl(\n");

        if(ReturnType!=null)
            buffer.append(ReturnType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodName!=null)
            buffer.append(ClassMethodName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParsOption!=null)
            buffer.append(FormParsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodVarDeclList!=null)
            buffer.append(ClassMethodVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodDecl]");
        return buffer.toString();
    }
}
