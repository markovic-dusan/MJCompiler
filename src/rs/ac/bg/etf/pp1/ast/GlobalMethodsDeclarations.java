// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class GlobalMethodsDeclarations extends MethodDeclarationsList {

    private MethodDeclarationsList MethodDeclarationsList;
    private MethodDecl MethodDecl;

    public GlobalMethodsDeclarations (MethodDeclarationsList MethodDeclarationsList, MethodDecl MethodDecl) {
        this.MethodDeclarationsList=MethodDeclarationsList;
        if(MethodDeclarationsList!=null) MethodDeclarationsList.setParent(this);
        this.MethodDecl=MethodDecl;
        if(MethodDecl!=null) MethodDecl.setParent(this);
    }

    public MethodDeclarationsList getMethodDeclarationsList() {
        return MethodDeclarationsList;
    }

    public void setMethodDeclarationsList(MethodDeclarationsList MethodDeclarationsList) {
        this.MethodDeclarationsList=MethodDeclarationsList;
    }

    public MethodDecl getMethodDecl() {
        return MethodDecl;
    }

    public void setMethodDecl(MethodDecl MethodDecl) {
        this.MethodDecl=MethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodDeclarationsList!=null) MethodDeclarationsList.accept(visitor);
        if(MethodDecl!=null) MethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDeclarationsList!=null) MethodDeclarationsList.traverseTopDown(visitor);
        if(MethodDecl!=null) MethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDeclarationsList!=null) MethodDeclarationsList.traverseBottomUp(visitor);
        if(MethodDecl!=null) MethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalMethodsDeclarations(\n");

        if(MethodDeclarationsList!=null)
            buffer.append(MethodDeclarationsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDecl!=null)
            buffer.append(MethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalMethodsDeclarations]");
        return buffer.toString();
    }
}
