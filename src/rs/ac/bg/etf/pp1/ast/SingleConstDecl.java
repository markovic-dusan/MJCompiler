// generated with ast extension for cup
// version 0.8
// 7/4/2019 18:35:49


package rs.ac.bg.etf.pp1.ast;

public class SingleConstDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private SingleConstDeclSyntaxCheck SingleConstDeclSyntaxCheck;

    public SingleConstDecl (SingleConstDeclSyntaxCheck SingleConstDeclSyntaxCheck) {
        this.SingleConstDeclSyntaxCheck=SingleConstDeclSyntaxCheck;
        if(SingleConstDeclSyntaxCheck!=null) SingleConstDeclSyntaxCheck.setParent(this);
    }

    public SingleConstDeclSyntaxCheck getSingleConstDeclSyntaxCheck() {
        return SingleConstDeclSyntaxCheck;
    }

    public void setSingleConstDeclSyntaxCheck(SingleConstDeclSyntaxCheck SingleConstDeclSyntaxCheck) {
        this.SingleConstDeclSyntaxCheck=SingleConstDeclSyntaxCheck;
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
        if(SingleConstDeclSyntaxCheck!=null) SingleConstDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleConstDeclSyntaxCheck!=null) SingleConstDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleConstDeclSyntaxCheck!=null) SingleConstDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleConstDecl(\n");

        if(SingleConstDeclSyntaxCheck!=null)
            buffer.append(SingleConstDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleConstDecl]");
        return buffer.toString();
    }
}
