// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class ClassMethodsDeclarations extends ClassMethodDeclarationsList {

    private ClassMethodDeclarationsList ClassMethodDeclarationsList;
    private ClassMethodDecl ClassMethodDecl;

    public ClassMethodsDeclarations (ClassMethodDeclarationsList ClassMethodDeclarationsList, ClassMethodDecl ClassMethodDecl) {
        this.ClassMethodDeclarationsList=ClassMethodDeclarationsList;
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.setParent(this);
        this.ClassMethodDecl=ClassMethodDecl;
        if(ClassMethodDecl!=null) ClassMethodDecl.setParent(this);
    }

    public ClassMethodDeclarationsList getClassMethodDeclarationsList() {
        return ClassMethodDeclarationsList;
    }

    public void setClassMethodDeclarationsList(ClassMethodDeclarationsList ClassMethodDeclarationsList) {
        this.ClassMethodDeclarationsList=ClassMethodDeclarationsList;
    }

    public ClassMethodDecl getClassMethodDecl() {
        return ClassMethodDecl;
    }

    public void setClassMethodDecl(ClassMethodDecl ClassMethodDecl) {
        this.ClassMethodDecl=ClassMethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.accept(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.traverseTopDown(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.traverseBottomUp(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodsDeclarations(\n");

        if(ClassMethodDeclarationsList!=null)
            buffer.append(ClassMethodDeclarationsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodDecl!=null)
            buffer.append(ClassMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodsDeclarations]");
        return buffer.toString();
    }
}
