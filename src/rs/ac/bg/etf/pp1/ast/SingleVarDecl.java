// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class SingleVarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private SingleVarDeclSyntaxCheck SingleVarDeclSyntaxCheck;

    public SingleVarDecl (SingleVarDeclSyntaxCheck SingleVarDeclSyntaxCheck) {
        this.SingleVarDeclSyntaxCheck=SingleVarDeclSyntaxCheck;
        if(SingleVarDeclSyntaxCheck!=null) SingleVarDeclSyntaxCheck.setParent(this);
    }

    public SingleVarDeclSyntaxCheck getSingleVarDeclSyntaxCheck() {
        return SingleVarDeclSyntaxCheck;
    }

    public void setSingleVarDeclSyntaxCheck(SingleVarDeclSyntaxCheck SingleVarDeclSyntaxCheck) {
        this.SingleVarDeclSyntaxCheck=SingleVarDeclSyntaxCheck;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SingleVarDeclSyntaxCheck!=null) SingleVarDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleVarDeclSyntaxCheck!=null) SingleVarDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleVarDeclSyntaxCheck!=null) SingleVarDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleVarDecl(\n");

        if(SingleVarDeclSyntaxCheck!=null)
            buffer.append(SingleVarDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleVarDecl]");
        return buffer.toString();
    }
}
