// generated with ast extension for cup
// version 0.8
// 13/4/2019 15:44:20


package src.rs.ac.bg.etf.pp1.ast;

public class SingleVarDeclSuccess extends SingleVarDeclSyntaxCheck {

    private String varName;
    private ArrayOption ArrayOption;

    public SingleVarDeclSuccess (String varName, ArrayOption ArrayOption) {
        this.varName=varName;
        this.ArrayOption=ArrayOption;
        if(ArrayOption!=null) ArrayOption.setParent(this);
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName=varName;
    }

    public ArrayOption getArrayOption() {
        return ArrayOption;
    }

    public void setArrayOption(ArrayOption ArrayOption) {
        this.ArrayOption=ArrayOption;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ArrayOption!=null) ArrayOption.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ArrayOption!=null) ArrayOption.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ArrayOption!=null) ArrayOption.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleVarDeclSuccess(\n");

        buffer.append(" "+tab+varName);
        buffer.append("\n");

        if(ArrayOption!=null)
            buffer.append(ArrayOption.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleVarDeclSuccess]");
        return buffer.toString();
    }
}
