// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MultipleEnumElemDeclaration extends MultipleEnumElemDecl {

    private MultipleEnumElemDecl MultipleEnumElemDecl;
    private SingleEnumElemDecl SingleEnumElemDecl;

    public MultipleEnumElemDeclaration (MultipleEnumElemDecl MultipleEnumElemDecl, SingleEnumElemDecl SingleEnumElemDecl) {
        this.MultipleEnumElemDecl=MultipleEnumElemDecl;
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.setParent(this);
        this.SingleEnumElemDecl=SingleEnumElemDecl;
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.setParent(this);
    }

    public MultipleEnumElemDecl getMultipleEnumElemDecl() {
        return MultipleEnumElemDecl;
    }

    public void setMultipleEnumElemDecl(MultipleEnumElemDecl MultipleEnumElemDecl) {
        this.MultipleEnumElemDecl=MultipleEnumElemDecl;
    }

    public SingleEnumElemDecl getSingleEnumElemDecl() {
        return SingleEnumElemDecl;
    }

    public void setSingleEnumElemDecl(SingleEnumElemDecl SingleEnumElemDecl) {
        this.SingleEnumElemDecl=SingleEnumElemDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.accept(visitor);
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.traverseTopDown(visitor);
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.traverseBottomUp(visitor);
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleEnumElemDeclaration(\n");

        if(MultipleEnumElemDecl!=null)
            buffer.append(MultipleEnumElemDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SingleEnumElemDecl!=null)
            buffer.append(SingleEnumElemDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleEnumElemDeclaration]");
        return buffer.toString();
    }
}
