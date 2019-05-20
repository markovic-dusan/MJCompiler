// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ClassMethodVarDeclSuccess extends ClassMethodVarDeclCheck {

    private Type Type;
    private MultipleClassMethodVarDecl MultipleClassMethodVarDecl;

    public ClassMethodVarDeclSuccess (Type Type, MultipleClassMethodVarDecl MultipleClassMethodVarDecl) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.MultipleClassMethodVarDecl=MultipleClassMethodVarDecl;
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public MultipleClassMethodVarDecl getMultipleClassMethodVarDecl() {
        return MultipleClassMethodVarDecl;
    }

    public void setMultipleClassMethodVarDecl(MultipleClassMethodVarDecl MultipleClassMethodVarDecl) {
        this.MultipleClassMethodVarDecl=MultipleClassMethodVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(MultipleClassMethodVarDecl!=null) MultipleClassMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodVarDeclSuccess(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleClassMethodVarDecl!=null)
            buffer.append(MultipleClassMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodVarDeclSuccess]");
        return buffer.toString();
    }
}
