// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleEnumElemDeclSuccess extends SingleEnumElemDeclSyntaxCheck {

    private String enumElemName;
    private EnumValueOption EnumValueOption;

    public SingleEnumElemDeclSuccess (String enumElemName, EnumValueOption EnumValueOption) {
        this.enumElemName=enumElemName;
        this.EnumValueOption=EnumValueOption;
        if(EnumValueOption!=null) EnumValueOption.setParent(this);
    }

    public String getEnumElemName() {
        return enumElemName;
    }

    public void setEnumElemName(String enumElemName) {
        this.enumElemName=enumElemName;
    }

    public EnumValueOption getEnumValueOption() {
        return EnumValueOption;
    }

    public void setEnumValueOption(EnumValueOption EnumValueOption) {
        this.EnumValueOption=EnumValueOption;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(EnumValueOption!=null) EnumValueOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(EnumValueOption!=null) EnumValueOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(EnumValueOption!=null) EnumValueOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleEnumElemDeclSuccess(\n");

        buffer.append(" "+tab+enumElemName);
        buffer.append("\n");

        if(EnumValueOption!=null)
            buffer.append(EnumValueOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleEnumElemDeclSuccess]");
        return buffer.toString();
    }
}
