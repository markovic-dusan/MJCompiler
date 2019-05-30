// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceMethods extends InterfaceMethodDeclarationList {

    private InterfaceMethodDeclarationList InterfaceMethodDeclarationList;
    private InterfaceMethodDecl InterfaceMethodDecl;

    public InterfaceMethods (InterfaceMethodDeclarationList InterfaceMethodDeclarationList, InterfaceMethodDecl InterfaceMethodDecl) {
        this.InterfaceMethodDeclarationList=InterfaceMethodDeclarationList;
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.setParent(this);
        this.InterfaceMethodDecl=InterfaceMethodDecl;
        if(InterfaceMethodDecl!=null) InterfaceMethodDecl.setParent(this);
    }

    public InterfaceMethodDeclarationList getInterfaceMethodDeclarationList() {
        return InterfaceMethodDeclarationList;
    }

    public void setInterfaceMethodDeclarationList(InterfaceMethodDeclarationList InterfaceMethodDeclarationList) {
        this.InterfaceMethodDeclarationList=InterfaceMethodDeclarationList;
    }

    public InterfaceMethodDecl getInterfaceMethodDecl() {
        return InterfaceMethodDecl;
    }

    public void setInterfaceMethodDecl(InterfaceMethodDecl InterfaceMethodDecl) {
        this.InterfaceMethodDecl=InterfaceMethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.accept(visitor);
        if(InterfaceMethodDecl!=null) InterfaceMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseTopDown(visitor);
        if(InterfaceMethodDecl!=null) InterfaceMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseBottomUp(visitor);
        if(InterfaceMethodDecl!=null) InterfaceMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceMethods(\n");

        if(InterfaceMethodDeclarationList!=null)
            buffer.append(InterfaceMethodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(InterfaceMethodDecl!=null)
            buffer.append(InterfaceMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceMethods]");
        return buffer.toString();
    }
}
