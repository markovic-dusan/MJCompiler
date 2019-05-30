// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class MethodVarDeclSuccess extends MethodVarDeclCheck {

    private Type Type;
    private MultipleMethodVarDecl MultipleMethodVarDecl;

    public MethodVarDeclSuccess (Type Type, MultipleMethodVarDecl MultipleMethodVarDecl) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.MultipleMethodVarDecl=MultipleMethodVarDecl;
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public MultipleMethodVarDecl getMultipleMethodVarDecl() {
        return MultipleMethodVarDecl;
    }

    public void setMultipleMethodVarDecl(MultipleMethodVarDecl MultipleMethodVarDecl) {
        this.MultipleMethodVarDecl=MultipleMethodVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(MultipleMethodVarDecl!=null) MultipleMethodVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodVarDeclSuccess(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultipleMethodVarDecl!=null)
            buffer.append(MultipleMethodVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodVarDeclSuccess]");
        return buffer.toString();
    }
}
