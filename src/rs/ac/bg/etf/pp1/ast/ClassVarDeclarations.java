// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassVarDeclarations extends ClassVarDeclList {

    private ClassVarDeclList ClassVarDeclList;
    private ClassVarDeclSyntaxCheck ClassVarDeclSyntaxCheck;

    public ClassVarDeclarations (ClassVarDeclList ClassVarDeclList, ClassVarDeclSyntaxCheck ClassVarDeclSyntaxCheck) {
        this.ClassVarDeclList=ClassVarDeclList;
        if(ClassVarDeclList!=null) ClassVarDeclList.setParent(this);
        this.ClassVarDeclSyntaxCheck=ClassVarDeclSyntaxCheck;
        if(ClassVarDeclSyntaxCheck!=null) ClassVarDeclSyntaxCheck.setParent(this);
    }

    public ClassVarDeclList getClassVarDeclList() {
        return ClassVarDeclList;
    }

    public void setClassVarDeclList(ClassVarDeclList ClassVarDeclList) {
        this.ClassVarDeclList=ClassVarDeclList;
    }

    public ClassVarDeclSyntaxCheck getClassVarDeclSyntaxCheck() {
        return ClassVarDeclSyntaxCheck;
    }

    public void setClassVarDeclSyntaxCheck(ClassVarDeclSyntaxCheck ClassVarDeclSyntaxCheck) {
        this.ClassVarDeclSyntaxCheck=ClassVarDeclSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassVarDeclList!=null) ClassVarDeclList.accept(visitor);
        if(ClassVarDeclSyntaxCheck!=null) ClassVarDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassVarDeclList!=null) ClassVarDeclList.traverseTopDown(visitor);
        if(ClassVarDeclSyntaxCheck!=null) ClassVarDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassVarDeclList!=null) ClassVarDeclList.traverseBottomUp(visitor);
        if(ClassVarDeclSyntaxCheck!=null) ClassVarDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassVarDeclarations(\n");

        if(ClassVarDeclList!=null)
            buffer.append(ClassVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassVarDeclSyntaxCheck!=null)
            buffer.append(ClassVarDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassVarDeclarations]");
        return buffer.toString();
    }
}
