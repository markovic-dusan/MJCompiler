// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleEnumElemDeclaration extends MultipleEnumElemDecl {

    private SingleEnumElemDecl SingleEnumElemDecl;

    public SingleEnumElemDeclaration (SingleEnumElemDecl SingleEnumElemDecl) {
        this.SingleEnumElemDecl=SingleEnumElemDecl;
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.setParent(this);
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
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleEnumElemDecl!=null) SingleEnumElemDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleEnumElemDeclaration(\n");

        if(SingleEnumElemDecl!=null)
            buffer.append(SingleEnumElemDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleEnumElemDeclaration]");
        return buffer.toString();
    }
}
