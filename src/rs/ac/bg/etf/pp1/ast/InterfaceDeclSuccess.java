// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class InterfaceDeclSuccess extends InterfaceSyntaxCheck {

    private String interfaceName;
    private InterfaceMethodDeclarationList InterfaceMethodDeclarationList;

    public InterfaceDeclSuccess (String interfaceName, InterfaceMethodDeclarationList InterfaceMethodDeclarationList) {
        this.interfaceName=interfaceName;
        this.InterfaceMethodDeclarationList=InterfaceMethodDeclarationList;
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.setParent(this);
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName=interfaceName;
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
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(InterfaceMethodDeclarationList!=null) InterfaceMethodDeclarationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("InterfaceDeclSuccess(\n");

        buffer.append(" "+tab+interfaceName);
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
