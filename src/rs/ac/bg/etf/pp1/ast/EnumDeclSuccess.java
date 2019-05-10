// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class EnumDeclSuccess extends EnumSyntaxCheck {

    private EnumName EnumName;
    private MultipleEnumElemDecl MultipleEnumElemDecl;

    public EnumDeclSuccess (EnumName EnumName, MultipleEnumElemDecl MultipleEnumElemDecl) {
        this.EnumName=EnumName;
        if(EnumName!=null) EnumName.setParent(this);
        this.MultipleEnumElemDecl=MultipleEnumElemDecl;
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.setParent(this);
    }

    public EnumName getEnumName() {
        return EnumName;
    }

    public void setEnumName(EnumName EnumName) {
        this.EnumName=EnumName;
    }

    public MultipleEnumElemDecl getMultipleEnumElemDecl() {
        return MultipleEnumElemDecl;
    }

    public void setMultipleEnumElemDecl(MultipleEnumElemDecl MultipleEnumElemDecl) {
        this.MultipleEnumElemDecl=MultipleEnumElemDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(EnumName!=null) EnumName.accept(visitor);
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumName!=null) EnumName.traverseTopDown(visitor);
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumName!=null) EnumName.traverseBottomUp(visitor);
        if(MultipleEnumElemDecl!=null) MultipleEnumElemDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EnumDeclSuccess(\n");

        if(EnumName!=null)
            buffer.append(EnumName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleEnumElemDecl!=null)
            buffer.append(MultipleEnumElemDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EnumDeclSuccess]");
        return buffer.toString();
    }
}
