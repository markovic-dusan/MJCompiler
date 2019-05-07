// generated with ast extension for cup
// version 0.8
// 7/4/2019 18:35:49


package rs.ac.bg.etf.pp1.ast;

public class Program implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String programName;
    private DeclarationsList DeclarationsList;
    private MethodDeclarationsList MethodDeclarationsList;

    public Program (String programName, DeclarationsList DeclarationsList, MethodDeclarationsList MethodDeclarationsList) {
        this.programName=programName;
        this.DeclarationsList=DeclarationsList;
        if(DeclarationsList!=null) DeclarationsList.setParent(this);
        this.MethodDeclarationsList=MethodDeclarationsList;
        if(MethodDeclarationsList!=null) MethodDeclarationsList.setParent(this);
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName=programName;
    }

    public DeclarationsList getDeclarationsList() {
        return DeclarationsList;
    }

    public void setDeclarationsList(DeclarationsList DeclarationsList) {
        this.DeclarationsList=DeclarationsList;
    }

    public MethodDeclarationsList getMethodDeclarationsList() {
        return MethodDeclarationsList;
    }

    public void setMethodDeclarationsList(MethodDeclarationsList MethodDeclarationsList) {
        this.MethodDeclarationsList=MethodDeclarationsList;
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
        if(DeclarationsList!=null) DeclarationsList.accept(visitor);
        if(MethodDeclarationsList!=null) MethodDeclarationsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DeclarationsList!=null) DeclarationsList.traverseTopDown(visitor);
        if(MethodDeclarationsList!=null) MethodDeclarationsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DeclarationsList!=null) DeclarationsList.traverseBottomUp(visitor);
        if(MethodDeclarationsList!=null) MethodDeclarationsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Program(\n");

        buffer.append(" "+tab+programName);
        buffer.append("\n");

        if(DeclarationsList!=null)
            buffer.append(DeclarationsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclarationsList!=null)
            buffer.append(MethodDeclarationsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Program]");
        return buffer.toString();
    }
}
