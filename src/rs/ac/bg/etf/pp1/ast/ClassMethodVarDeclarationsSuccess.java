// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ClassMethodVarDeclarationsSuccess extends ClassMethodVarDeclSyntaxCheck {

    private ClassMethodVarDeclCheck ClassMethodVarDeclCheck;

    public ClassMethodVarDeclarationsSuccess (ClassMethodVarDeclCheck ClassMethodVarDeclCheck) {
        this.ClassMethodVarDeclCheck=ClassMethodVarDeclCheck;
        if(ClassMethodVarDeclCheck!=null) ClassMethodVarDeclCheck.setParent(this);
    }

    public ClassMethodVarDeclCheck getClassMethodVarDeclCheck() {
        return ClassMethodVarDeclCheck;
    }

    public void setClassMethodVarDeclCheck(ClassMethodVarDeclCheck ClassMethodVarDeclCheck) {
        this.ClassMethodVarDeclCheck=ClassMethodVarDeclCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassMethodVarDeclCheck!=null) ClassMethodVarDeclCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassMethodVarDeclCheck!=null) ClassMethodVarDeclCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassMethodVarDeclCheck!=null) ClassMethodVarDeclCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassMethodVarDeclarationsSuccess(\n");

        if(ClassMethodVarDeclCheck!=null)
            buffer.append(ClassMethodVarDeclCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassMethodVarDeclarationsSuccess]");
        return buffer.toString();
    }
}
