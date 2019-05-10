// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class SingleEnumElemDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private SingleEnumElemDeclSyntaxCheck SingleEnumElemDeclSyntaxCheck;

    public SingleEnumElemDecl (SingleEnumElemDeclSyntaxCheck SingleEnumElemDeclSyntaxCheck) {
        this.SingleEnumElemDeclSyntaxCheck=SingleEnumElemDeclSyntaxCheck;
        if(SingleEnumElemDeclSyntaxCheck!=null) SingleEnumElemDeclSyntaxCheck.setParent(this);
    }

    public SingleEnumElemDeclSyntaxCheck getSingleEnumElemDeclSyntaxCheck() {
        return SingleEnumElemDeclSyntaxCheck;
    }

    public void setSingleEnumElemDeclSyntaxCheck(SingleEnumElemDeclSyntaxCheck SingleEnumElemDeclSyntaxCheck) {
        this.SingleEnumElemDeclSyntaxCheck=SingleEnumElemDeclSyntaxCheck;
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
        if(SingleEnumElemDeclSyntaxCheck!=null) SingleEnumElemDeclSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SingleEnumElemDeclSyntaxCheck!=null) SingleEnumElemDeclSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SingleEnumElemDeclSyntaxCheck!=null) SingleEnumElemDeclSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleEnumElemDecl(\n");

        if(SingleEnumElemDeclSyntaxCheck!=null)
            buffer.append(SingleEnumElemDeclSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleEnumElemDecl]");
        return buffer.toString();
    }
}
