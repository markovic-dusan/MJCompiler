// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class VarDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private VarSyntaxCheck VarSyntaxCheck;

    public VarDecl (VarSyntaxCheck VarSyntaxCheck) {
        this.VarSyntaxCheck=VarSyntaxCheck;
        if(VarSyntaxCheck!=null) VarSyntaxCheck.setParent(this);
    }

    public VarSyntaxCheck getVarSyntaxCheck() {
        return VarSyntaxCheck;
    }

    public void setVarSyntaxCheck(VarSyntaxCheck VarSyntaxCheck) {
        this.VarSyntaxCheck=VarSyntaxCheck;
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
        if(VarSyntaxCheck!=null) VarSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarSyntaxCheck!=null) VarSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarSyntaxCheck!=null) VarSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDecl(\n");

        if(VarSyntaxCheck!=null)
            buffer.append(VarSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDecl]");
        return buffer.toString();
    }
}
