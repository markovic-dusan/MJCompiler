// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleClassVariableDeclaration extends MultipleClassVarDecl {

    private SingleClassVarDecl SingleClassVarDecl;

    public SingleClassVariableDeclaration (SingleClassVarDecl SingleClassVarDecl) {
        this.SingleClassVarDecl=SingleClassVarDecl;
        if(SingleClassVarDecl!=null) SingleClassVarDecl.setParent(this);
    }

    public SingleClassVarDecl getSingleClassVarDecl() {
        return SingleClassVarDecl;
    }

    public void setSingleClassVarDecl(SingleClassVarDecl SingleClassVarDecl) {
        this.SingleClassVarDecl=SingleClassVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SingleClassVarDecl!=null) SingleClassVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleClassVarDecl!=null) SingleClassVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleClassVarDecl!=null) SingleClassVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleClassVariableDeclaration(\n");

        if(SingleClassVarDecl!=null)
            buffer.append(SingleClassVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleClassVariableDeclaration]");
        return buffer.toString();
    }
}
