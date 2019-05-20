// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ClassVarDeclarationsSuccess extends ClassVarDeclSyntaxCheck {

    private ClassVarDeclCheck ClassVarDeclCheck;

    public ClassVarDeclarationsSuccess (ClassVarDeclCheck ClassVarDeclCheck) {
        this.ClassVarDeclCheck=ClassVarDeclCheck;
        if(ClassVarDeclCheck!=null) ClassVarDeclCheck.setParent(this);
    }

    public ClassVarDeclCheck getClassVarDeclCheck() {
        return ClassVarDeclCheck;
    }

    public void setClassVarDeclCheck(ClassVarDeclCheck ClassVarDeclCheck) {
        this.ClassVarDeclCheck=ClassVarDeclCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassVarDeclCheck!=null) ClassVarDeclCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassVarDeclCheck!=null) ClassVarDeclCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassVarDeclCheck!=null) ClassVarDeclCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassVarDeclarationsSuccess(\n");

        if(ClassVarDeclCheck!=null)
            buffer.append(ClassVarDeclCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassVarDeclarationsSuccess]");
        return buffer.toString();
    }
}
