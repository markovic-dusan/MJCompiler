// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public class EnumDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private EnumSyntaxCheck EnumSyntaxCheck;

    public EnumDecl (EnumSyntaxCheck EnumSyntaxCheck) {
        this.EnumSyntaxCheck=EnumSyntaxCheck;
        if(EnumSyntaxCheck!=null) EnumSyntaxCheck.setParent(this);
    }

    public EnumSyntaxCheck getEnumSyntaxCheck() {
        return EnumSyntaxCheck;
    }

    public void setEnumSyntaxCheck(EnumSyntaxCheck EnumSyntaxCheck) {
        this.EnumSyntaxCheck=EnumSyntaxCheck;
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
        if(EnumSyntaxCheck!=null) EnumSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumSyntaxCheck!=null) EnumSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumSyntaxCheck!=null) EnumSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EnumDecl(\n");

        if(EnumSyntaxCheck!=null)
            buffer.append(EnumSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EnumDecl]");
        return buffer.toString();
    }
}
