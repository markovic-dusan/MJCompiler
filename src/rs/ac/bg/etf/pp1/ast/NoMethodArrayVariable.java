// generated with ast extension for cup
// version 0.8
// 10/4/2019 17:32:57


package rs.ac.bg.etf.pp1.ast;

public class NoMethodArrayVariable extends MethodVarArrayOption {

    public NoMethodArrayVariable () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoMethodArrayVariable(\n");

        buffer.append(tab);
        buffer.append(") [NoMethodArrayVariable]");
        return buffer.toString();
    }
}