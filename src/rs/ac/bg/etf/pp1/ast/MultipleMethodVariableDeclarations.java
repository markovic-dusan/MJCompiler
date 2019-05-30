// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class MultipleMethodVariableDeclarations extends MultipleMethodVarDecl {

    private MultipleMethodVarDecl MultipleMethodVarDecl;
    private SingleMethodVarDecl SingleMethodVarDecl;

    public MultipleMethodVariableDeclarations (MultipleMethodVarDecl MultipleMethodVarDecl, SingleMethodVarDecl SingleMethodVarDecl) {
        this.MultipleMethodVarDecl=MultipleMethodVarDecl;
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.setParent(this);
        this.SingleMethodVarDecl=SingleMethodVarDecl;
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.setParent(this);
    }

    public MultipleMethodVarDecl getMultipleMethodVarDecl() {
        return MultipleMethodVarDecl;
    }

    public void setMultipleMethodVarDecl(MultipleMethodVarDecl MultipleMethodVarDecl) {
        this.MultipleMethodVarDecl=MultipleMethodVarDecl;
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
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.accept(visitor);
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.traverseTopDown(visitor);
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.traverseBottomUp(visitor);
        if(SingleMethodVarDecl!=null) SingleMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleMethodVariableDeclarations(\n");

        if(MultipleMethodVarDecl!=null)
            buffer.append(MultipleMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SingleMethodVarDecl!=null)
            buffer.append(SingleMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleMethodVariableDeclarations]");
        return buffer.toString();
    }
}
