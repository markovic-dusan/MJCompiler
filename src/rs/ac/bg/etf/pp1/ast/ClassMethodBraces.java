// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class ClassMethodBraces extends ClassMethodsOption {

    private ClassMethodDeclarationsList ClassMethodDeclarationsList;

    public ClassMethodBraces (ClassMethodDeclarationsList ClassMethodDeclarationsList) {
        this.ClassMethodDeclarationsList=ClassMethodDeclarationsList;
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.setParent(this);
    }

    public ClassMethodDeclarationsList getClassMethodDeclarationsList() {
        return ClassMethodDeclarationsList;
    }

    public void setClassMethodDeclarationsList(ClassMethodDeclarationsList ClassMethodDeclarationsList) {
        this.ClassMethodDeclarationsList=ClassMethodDeclarationsList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassMethodDeclarationsList!=null) ClassMethodDeclarationsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodBraces(\n");

        if(ClassMethodDeclarationsList!=null)
            buffer.append(ClassMethodDeclarationsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodBraces]");
        return buffer.toString();
    }
}
