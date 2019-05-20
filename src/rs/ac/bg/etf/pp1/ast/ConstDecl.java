// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ConstDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ConstSyntaxCheck ConstSyntaxCheck;

    public ConstDecl (ConstSyntaxCheck ConstSyntaxCheck) {
        this.ConstSyntaxCheck=ConstSyntaxCheck;
        if(ConstSyntaxCheck!=null) ConstSyntaxCheck.setParent(this);
    }

    public ConstSyntaxCheck getConstSyntaxCheck() {
        return ConstSyntaxCheck;
    }

    public void setConstSyntaxCheck(ConstSyntaxCheck ConstSyntaxCheck) {
        this.ConstSyntaxCheck=ConstSyntaxCheck;
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
        if(ConstSyntaxCheck!=null) ConstSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstSyntaxCheck!=null) ConstSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstSyntaxCheck!=null) ConstSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDecl(\n");

        if(ConstSyntaxCheck!=null)
            buffer.append(ConstSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDecl]");
        return buffer.toString();
    }
}
