// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MethodVarDeclarationsSuccess extends MethodVarDeclSyntaxCheck {

    private MethodVarDeclCheck MethodVarDeclCheck;

    public MethodVarDeclarationsSuccess (MethodVarDeclCheck MethodVarDeclCheck) {
        this.MethodVarDeclCheck=MethodVarDeclCheck;
        if(MethodVarDeclCheck!=null) MethodVarDeclCheck.setParent(this);
    }

    public MethodVarDeclCheck getMethodVarDeclCheck() {
        return MethodVarDeclCheck;
    }

    public void setMethodVarDeclCheck(MethodVarDeclCheck MethodVarDeclCheck) {
        this.MethodVarDeclCheck=MethodVarDeclCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodVarDeclCheck!=null) MethodVarDeclCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodVarDeclCheck!=null) MethodVarDeclCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodVarDeclCheck!=null) MethodVarDeclCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodVarDeclarationsSuccess(\n");

        if(MethodVarDeclCheck!=null)
            buffer.append(MethodVarDeclCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodVarDeclarationsSuccess]");
        return buffer.toString();
    }
}
