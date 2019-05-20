// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleClassMethodVariableDeclaration extends MultipleClassMethodVarDecl {

    private SingleClassMethodVarDecl SingleClassMethodVarDecl;

    public SingleClassMethodVariableDeclaration (SingleClassMethodVarDecl SingleClassMethodVarDecl) {
        this.SingleClassMethodVarDecl=SingleClassMethodVarDecl;
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.setParent(this);
    }

    public SingleClassMethodVarDecl getSingleClassMethodVarDecl() {
        return SingleClassMethodVarDecl;
    }

    public void setSingleClassMethodVarDecl(SingleClassMethodVarDecl SingleClassMethodVarDecl) {
        this.SingleClassMethodVarDecl=SingleClassMethodVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleClassMethodVariableDeclaration(\n");

        if(SingleClassMethodVarDecl!=null)
            buffer.append(SingleClassMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleClassMethodVariableDeclaration]");
        return buffer.toString();
    }
}
