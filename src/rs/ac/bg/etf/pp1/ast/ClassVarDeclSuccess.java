// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class ClassVarDeclSuccess extends ClassVarDeclCheck {

    private Type Type;
    private MultipleClassVarDecl MultipleClassVarDecl;

    public ClassVarDeclSuccess (Type Type, MultipleClassVarDecl MultipleClassVarDecl) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.MultipleClassVarDecl=MultipleClassVarDecl;
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public MultipleClassVarDecl getMultipleClassVarDecl() {
        return MultipleClassVarDecl;
    }

    public void setMultipleClassVarDecl(MultipleClassVarDecl MultipleClassVarDecl) {
        this.MultipleClassVarDecl=MultipleClassVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(MultipleClassVarDecl!=null) MultipleClassVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassVarDeclSuccess(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleClassVarDecl!=null)
            buffer.append(MultipleClassVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassVarDeclSuccess]");
        return buffer.toString();
    }
}
