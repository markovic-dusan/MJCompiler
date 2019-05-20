// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ClassInheritance extends ExtendsOption {

    private ExtendsSyntaxCheck ExtendsSyntaxCheck;

    public ClassInheritance (ExtendsSyntaxCheck ExtendsSyntaxCheck) {
        this.ExtendsSyntaxCheck=ExtendsSyntaxCheck;
        if(ExtendsSyntaxCheck!=null) ExtendsSyntaxCheck.setParent(this);
    }

    public ExtendsSyntaxCheck getExtendsSyntaxCheck() {
        return ExtendsSyntaxCheck;
    }

    public void setExtendsSyntaxCheck(ExtendsSyntaxCheck ExtendsSyntaxCheck) {
        this.ExtendsSyntaxCheck=ExtendsSyntaxCheck;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExtendsSyntaxCheck!=null) ExtendsSyntaxCheck.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExtendsSyntaxCheck!=null) ExtendsSyntaxCheck.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExtendsSyntaxCheck!=null) ExtendsSyntaxCheck.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassInheritance(\n");

        if(ExtendsSyntaxCheck!=null)
            buffer.append(ExtendsSyntaxCheck.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassInheritance]");
        return buffer.toString();
    }
}
