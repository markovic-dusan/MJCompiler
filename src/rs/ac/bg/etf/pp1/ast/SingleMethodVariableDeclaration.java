// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleMethodVariableDeclaration extends MultipleMethodVarDecl {

    private SingleMethodVarDecl SingleMethodVarDecl;

    public SingleMethodVariableDeclaration (SingleMethodVarDecl SingleMethodVarDecl) {
        this.SingleMethodVarDecl=SingleMethodVarDecl;
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.setParent(this);
    }

    public SingleMethodVarDecl getSingleMethodVarDecl() {
        return SingleMethodVarDecl;
    }

    public void setSingleMethodVarDecl(SingleMethodVarDecl SingleMethodVarDecl) {
        this.SingleMethodVarDecl=SingleMethodVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleMethodVariableDeclaration(\n");

        if(SingleMethodVarDecl!=null)
            buffer.append(SingleMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleMethodVariableDeclaration]");
        return buffer.toString();
    }
}
