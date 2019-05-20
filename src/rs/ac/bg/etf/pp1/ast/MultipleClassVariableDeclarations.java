// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MultipleClassVariableDeclarations extends MultipleClassVarDecl {

    private MultipleClassVarDecl MultipleClassVarDecl;
    private SingleClassVarDecl SingleClassVarDecl;

    public MultipleClassVariableDeclarations (MultipleClassVarDecl MultipleClassVarDecl, SingleClassVarDecl SingleClassVarDecl) {
        this.MultipleClassVarDecl=MultipleClassVarDecl;
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.setParent(this);
        this.SingleClassVarDecl=SingleClassVarDecl;
        if(SingleClassVarDecl!=null) SingleClassVarDecl.setParent(this);
    }

    public MultipleClassVarDecl getMultipleClassVarDecl() {
        return MultipleClassVarDecl;
    }

    public void setMultipleClassVarDecl(MultipleClassVarDecl MultipleClassVarDecl) {
        this.MultipleClassVarDecl=MultipleClassVarDecl;
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
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.accept(visitor);
        if(SingleClassVarDecl!=null) SingleClassVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.traverseTopDown(visitor);
        if(SingleClassVarDecl!=null) SingleClassVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.traverseBottomUp(visitor);
        if(SingleClassVarDecl!=null) SingleClassVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleClassVariableDeclarations(\n");

        if(MultipleClassVarDecl!=null)
            buffer.append(MultipleClassVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SingleClassVarDecl!=null)
            buffer.append(SingleClassVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleClassVariableDeclarations]");
        return buffer.toString();
    }
}
