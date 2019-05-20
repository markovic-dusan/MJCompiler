// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MethodVarDeclarations extends MethodVarDeclList {

    private MethodVarDeclList MethodVarDeclList;
    private MethodVarDeclSyntaxCheck MethodVarDeclSyntaxCheck;

    public MethodVarDeclarations (MethodVarDeclList MethodVarDeclList, MethodVarDeclSyntaxCheck MethodVarDeclSyntaxCheck) {
        this.MethodVarDeclList=MethodVarDeclList;
        if(MethodVarDeclList!=null) MethodVarDeclList.setParent(this);
        this.MethodVarDeclSyntaxCheck=MethodVarDeclSyntaxCheck;
        if(MethodVarDeclSyntaxCheck!=null) MethodVarDeclSyntaxCheck.setParent(this);
    }

    public MethodVarDeclList getMethodVarDeclList() {
        return MethodVarDeclList;
    }

    public void setMethodVarDeclList(MethodVarDeclList MethodVarDeclList) {
        this.MethodVarDeclList=MethodVarDeclList;
    }

    public MethodVarDeclSyntaxCheck getMethodVarDeclSyntaxCheck() {
        return MethodVarDeclSyntaxCheck;
    }

    public void setMethodVarDeclSyntaxCheck(MethodVarDeclSyntaxCheck MethodVarDeclSyntaxCheck) {
        this.MethodVarDeclSyntaxCheck=MethodVarDeclSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodVarDeclList!=null) MethodVarDeclList.accept(visitor);
        if(MethodVarDeclSyntaxCheck!=null) MethodVarDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodVarDeclList!=null) MethodVarDeclList.traverseTopDown(visitor);
        if(MethodVarDeclSyntaxCheck!=null) MethodVarDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodVarDeclList!=null) MethodVarDeclList.traverseBottomUp(visitor);
        if(MethodVarDeclSyntaxCheck!=null) MethodVarDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodVarDeclarations(\n");

        if(MethodVarDeclList!=null)
            buffer.append(MethodVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodVarDeclSyntaxCheck!=null)
            buffer.append(MethodVarDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodVarDeclarations]");
        return buffer.toString();
    }
}
