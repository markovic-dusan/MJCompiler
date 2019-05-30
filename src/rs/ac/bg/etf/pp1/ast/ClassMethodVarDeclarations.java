// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassMethodVarDeclarations extends ClassMethodVarDeclList {

    private ClassMethodVarDeclList ClassMethodVarDeclList;
    private ClassMethodVarDeclSyntaxCheck ClassMethodVarDeclSyntaxCheck;

    public ClassMethodVarDeclarations (ClassMethodVarDeclList ClassMethodVarDeclList, ClassMethodVarDeclSyntaxCheck ClassMethodVarDeclSyntaxCheck) {
        this.ClassMethodVarDeclList=ClassMethodVarDeclList;
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.setParent(this);
        this.ClassMethodVarDeclSyntaxCheck=ClassMethodVarDeclSyntaxCheck;
        if(ClassMethodVarDeclSyntaxCheck!=null) ClassMethodVarDeclSyntaxCheck.setParent(this);
    }

    public ClassMethodVarDeclList getClassMethodVarDeclList() {
        return ClassMethodVarDeclList;
    }

    public void setClassMethodVarDeclList(ClassMethodVarDeclList ClassMethodVarDeclList) {
        this.ClassMethodVarDeclList=ClassMethodVarDeclList;
    }

    public ClassMethodVarDeclSyntaxCheck getClassMethodVarDeclSyntaxCheck() {
        return ClassMethodVarDeclSyntaxCheck;
    }

    public void setClassMethodVarDeclSyntaxCheck(ClassMethodVarDeclSyntaxCheck ClassMethodVarDeclSyntaxCheck) {
        this.ClassMethodVarDeclSyntaxCheck=ClassMethodVarDeclSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.accept(visitor);
        if(ClassMethodVarDeclSyntaxCheck!=null) ClassMethodVarDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.traverseTopDown(visitor);
        if(ClassMethodVarDeclSyntaxCheck!=null) ClassMethodVarDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassMethodVarDeclList!=null) ClassMethodVarDeclList.traverseBottomUp(visitor);
        if(ClassMethodVarDeclSyntaxCheck!=null) ClassMethodVarDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodVarDeclarations(\n");

        if(ClassMethodVarDeclList!=null)
            buffer.append(ClassMethodVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodVarDeclSyntaxCheck!=null)
            buffer.append(ClassMethodVarDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodVarDeclarations]");
        return buffer.toString();
    }
}
