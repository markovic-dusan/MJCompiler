// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ReturnStatement extends MatchedStatement {

    private ReturnExprOption ReturnExprOption;

    public ReturnStatement (ReturnExprOption ReturnExprOption) {
        this.ReturnExprOption=ReturnExprOption;
        if(ReturnExprOption!=null) ReturnExprOption.setParent(this);
    }

    public ReturnExprOption getReturnExprOption() {
        return ReturnExprOption;
    }

    public void setReturnExprOption(ReturnExprOption ReturnExprOption) {
        this.ReturnExprOption=ReturnExprOption;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ReturnExprOption!=null) ReturnExprOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnExprOption!=null) ReturnExprOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnExprOption!=null) ReturnExprOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ReturnStatement(\n");

        if(ReturnExprOption!=null)
            buffer.append(ReturnExprOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ReturnStatement]");
        return buffer.toString();
    }
}
