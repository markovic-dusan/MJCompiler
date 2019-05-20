// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class ClassOrEnumDesignator extends Designator {

    private Designator Designator;
    private String classOrEnumFieldName;

    public ClassOrEnumDesignator (Designator Designator, String classOrEnumFieldName) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.classOrEnumFieldName=classOrEnumFieldName;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public String getClassOrEnumFieldName() {
        return classOrEnumFieldName;
    }

    public void setClassOrEnumFieldName(String classOrEnumFieldName) {
        this.classOrEnumFieldName=classOrEnumFieldName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassOrEnumDesignator(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+classOrEnumFieldName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassOrEnumDesignator]");
        return buffer.toString();
    }
}
