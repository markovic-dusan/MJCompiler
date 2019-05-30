// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class InterfaceDeclSuccess extends InterfaceSyntaxCheck {

    private InterfaceName InterfaceName;
    private InterfaceMethodDeclarationList InterfaceMethodDeclarationList;

    public InterfaceDeclSuccess (InterfaceName InterfaceName, InterfaceMethodDeclarationList InterfaceMethodDeclarationList) {
        this.InterfaceName=InterfaceName;
        if(InterfaceName!=null) InterfaceName.setParent(this);
        this.InterfaceMethodDeclarationList=InterfaceMethodDeclarationList;
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.setParent(this);
    }

    public InterfaceName getInterfaceName() {
        return InterfaceName;
    }

    public void setInterfaceName(InterfaceName InterfaceName) {
        this.InterfaceName=InterfaceName;
    }

    public InterfaceMethodDeclarationList getInterfaceMethodDeclarationList() {
        return InterfaceMethodDeclarationList;
    }

    public void setInterfaceMethodDeclarationList(InterfaceMethodDeclarationList InterfaceMethodDeclarationList) {
        this.InterfaceMethodDeclarationList=InterfaceMethodDeclarationList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(InterfaceName!=null) InterfaceName.accept(visitor);
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceName!=null) InterfaceName.traverseTopDown(visitor);
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceName!=null) InterfaceName.traverseBottomUp(visitor);
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceDeclSuccess(\n");

        if(InterfaceName!=null)
            buffer.append(InterfaceName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(InterfaceMethodDeclarationList!=null)
            buffer.append(InterfaceMethodDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [InterfaceDeclSuccess]");
        return buffer.toString();
    }
}
