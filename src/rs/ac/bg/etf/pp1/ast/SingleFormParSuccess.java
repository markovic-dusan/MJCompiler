// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleFormParSuccess extends SingleFormPar {

    private Type Type;
    private String formParName;
    private FormParArrayOption FormParArrayOption;

    public SingleFormParSuccess (Type Type, String formParName, FormParArrayOption FormParArrayOption) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.formParName=formParName;
        this.FormParArrayOption=FormParArrayOption;
        if(FormParArrayOption!=null) FormParArrayOption.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getFormParName() {
        return formParName;
    }

    public void setFormParName(String formParName) {
        this.formParName=formParName;
    }

    public FormParArrayOption getFormParArrayOption() {
        return FormParArrayOption;
    }

    public void setFormParArrayOption(FormParArrayOption FormParArrayOption) {
        this.FormParArrayOption=FormParArrayOption;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(FormParArrayOption!=null) FormParArrayOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(FormParArrayOption!=null) FormParArrayOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(FormParArrayOption!=null) FormParArrayOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleFormParSuccess(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+formParName);
        buffer.append("\n");

        if(FormParArrayOption!=null)
            buffer.append(FormParArrayOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleFormParSuccess]");
        return buffer.toString();
    }
}
