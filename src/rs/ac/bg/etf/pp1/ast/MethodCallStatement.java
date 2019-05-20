// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class MethodCallStatement extends DesignatorStatement {

    private Designator Designator;
    private ActParamsOption ActParamsOption;

    public MethodCallStatement (Designator Designator, ActParamsOption ActParamsOption) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ActParamsOption=ActParamsOption;
        if(ActParamsOption!=null) ActParamsOption.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ActParamsOption getActParamsOption() {
        return ActParamsOption;
    }

    public void setActParamsOption(ActParamsOption ActParamsOption) {
        this.ActParamsOption=ActParamsOption;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ActParamsOption!=null) ActParamsOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ActParamsOption!=null) ActParamsOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ActParamsOption!=null) ActParamsOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodCallStatement(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ActParamsOption!=null)
            buffer.append(ActParamsOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodCallStatement]");
        return buffer.toString();
    }
}
