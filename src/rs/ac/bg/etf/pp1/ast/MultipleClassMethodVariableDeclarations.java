// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class MultipleClassMethodVariableDeclarations extends MultipleClassMethodVarDecl {

    private MultipleClassMethodVarDecl MultipleClassMethodVarDecl;
    private SingleClassMethodVarDecl SingleClassMethodVarDecl;

    public MultipleClassMethodVariableDeclarations (MultipleClassMethodVarDecl MultipleClassMethodVarDecl, SingleClassMethodVarDecl SingleClassMethodVarDecl) {
        this.MultipleClassMethodVarDecl=MultipleClassMethodVarDecl;
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.setParent(this);
        this.SingleClassMethodVarDecl=SingleClassMethodVarDecl;
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.setParent(this);
    }

    public MultipleClassMethodVarDecl getMultipleClassMethodVarDecl() {
        return MultipleClassMethodVarDecl;
    }

    public void setMultipleClassMethodVarDecl(MultipleClassMethodVarDecl MultipleClassMethodVarDecl) {
        this.MultipleClassMethodVarDecl=MultipleClassMethodVarDecl;
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
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.accept(visitor);
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.traverseTopDown(visitor);
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.traverseBottomUp(visitor);
        if(SingleClassMethodVarDecl!=null) SingleClassMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleClassMethodVariableDeclarations(\n");

        if(MultipleClassMethodVarDecl!=null)
            buffer.append(MultipleClassMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SingleClassMethodVarDecl!=null)
            buffer.append(SingleClassMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleClassMethodVariableDeclarations]");
        return buffer.toString();
    }
}
