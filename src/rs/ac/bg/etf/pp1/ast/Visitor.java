// generated with ast extension for cup
// version 0.8
// 30/4/2019 19:15:39


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(FormPars FormPars);
    public void visit(EnumValueOption EnumValueOption);
    public void visit(MultipleConstDecl MultipleConstDecl);
    public void visit(Factor Factor);
    public void visit(MultipleMethodVarDecl MultipleMethodVarDecl);
    public void visit(Statement Statement);
    public void visit(InterfaceSyntaxCheck InterfaceSyntaxCheck);
    public void visit(PrintOption PrintOption);
    public void visit(MethodVarDeclCheck MethodVarDeclCheck);
    public void visit(MethodDeclarationsList MethodDeclarationsList);
    public void visit(MethodVarDeclSyntaxCheck MethodVarDeclSyntaxCheck);
    public void visit(Relop Relop);
    public void visit(ClassMethodVarDeclList ClassMethodVarDeclList);
    public void visit(ClassVarArrayOption ClassVarArrayOption);
    public void visit(Expr Expr);
    public void visit(VarSyntaxCheck VarSyntaxCheck);
    public void visit(InterfaceList InterfaceList);
    public void visit(UnmatchedStatement UnmatchedStatement);
    public void visit(DeclarationsList DeclarationsList);
    public void visit(SingleFormPar SingleFormPar);
    public void visit(ArrayOption ArrayOption);
    public void visit(EnumSyntaxCheck EnumSyntaxCheck);
    public void visit(ClassVarDeclSyntaxCheck ClassVarDeclSyntaxCheck);
    public void visit(ConditionSyntaxCheck ConditionSyntaxCheck);
    public void visit(InterfaceMethodDeclarationList InterfaceMethodDeclarationList);
    public void visit(ConstSyntaxCheck ConstSyntaxCheck);
    public void visit(ActParamsOption ActParamsOption);
    public void visit(MultipleClassMethodVarDecl MultipleClassMethodVarDecl);
    public void visit(Condition Condition);
    public void visit(ExtendsOption ExtendsOption);
    public void visit(Mulop Mulop);
    public void visit(ReturnExprOption ReturnExprOption);
    public void visit(ImplementsOption ImplementsOption);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(ExtendsSyntaxCheck ExtendsSyntaxCheck);
    public void visit(FormParsOption FormParsOption);
    public void visit(Addop Addop);
    public void visit(StatementList StatementList);
    public void visit(Assignop Assignop);
    public void visit(MultipleClassVarDecl MultipleClassVarDecl);
    public void visit(ClassMethodVarDeclSyntaxCheck ClassMethodVarDeclSyntaxCheck);
    public void visit(SingleConstDeclSyntaxCheck SingleConstDeclSyntaxCheck);
    public void visit(ReturnType ReturnType);
    public void visit(FormParArrayOption FormParArrayOption);
    public void visit(CondTerm CondTerm);
    public void visit(MultipleVarDecl MultipleVarDecl);
    public void visit(SingleEnumElemDeclSyntaxCheck SingleEnumElemDeclSyntaxCheck);
    public void visit(MethodVarDeclList MethodVarDeclList);
    public void visit(SingleVarDeclSyntaxCheck SingleVarDeclSyntaxCheck);
    public void visit(MatchedStatement MatchedStatement);
    public void visit(Expression Expression);
    public void visit(MultipleEnumElemDecl MultipleEnumElemDecl);
    public void visit(ConstValue ConstValue);
    public void visit(ClassMethodVarDeclCheck ClassMethodVarDeclCheck);
    public void visit(ClassMethodVarArrayOption ClassMethodVarArrayOption);
    public void visit(ClassVarDeclList ClassVarDeclList);
    public void visit(MethodVarArrayOption MethodVarArrayOption);
    public void visit(ForConditionOption ForConditionOption);
    public void visit(ActPars ActPars);
    public void visit(FirstForDesignatorOption FirstForDesignatorOption);
    public void visit(Designator Designator);
    public void visit(CondFact CondFact);
    public void visit(ImplementsSyntaxCheck ImplementsSyntaxCheck);
    public void visit(Term Term);
    public void visit(ClassVarDeclCheck ClassVarDeclCheck);
    public void visit(Decl Decl);
    public void visit(SecondForDesignatorOption SecondForDesignatorOption);
    public void visit(MatchedDesignatorStatement MatchedDesignatorStatement);
    public void visit(MinusOption MinusOption);
    public void visit(ClassMethodsOption ClassMethodsOption);
    public void visit(ClassMethodDeclarationsList ClassMethodDeclarationsList);
    public void visit(Mod Mod);
    public void visit(Div Div);
    public void visit(Mul Mul);
    public void visit(Minus Minus);
    public void visit(Plus Plus);
    public void visit(LessThanEquals LessThanEquals);
    public void visit(LessThan LessThan);
    public void visit(GreaterThanEquals GreaterThanEquals);
    public void visit(GreaterThan GreaterThan);
    public void visit(NotEquals NotEquals);
    public void visit(Equals Equals);
    public void visit(Assign Assign);
    public void visit(ArrayDesignator ArrayDesignator);
    public void visit(ClassOrEnumDesignator ClassOrEnumDesignator);
    public void visit(SimpleDesignator SimpleDesignator);
    public void visit(CompositeFactor CompositeFactor);
    public void visit(NewArrayFactor NewArrayFactor);
    public void visit(NewFactor NewFactor);
    public void visit(ConstFactor ConstFactor);
    public void visit(MethodDesignator MethodDesignator);
    public void visit(DeclDesignator DeclDesignator);
    public void visit(SingleFactorTerm SingleFactorTerm);
    public void visit(MultipleFactorTerm MultipleFactorTerm);
    public void visit(MinusSingleTermExpr MinusSingleTermExpr);
    public void visit(SingleTermExpr SingleTermExpr);
    public void visit(MultipleTermExpr MultipleTermExpr);
    public void visit(SingleExprFact SingleExprFact);
    public void visit(MultipleExprFact MultipleExprFact);
    public void visit(SingleFactTerm SingleFactTerm);
    public void visit(MultipleFactTerm MultipleFactTerm);
    public void visit(SingleTermCondition SingleTermCondition);
    public void visit(MultipleTermCondition MultipleTermCondition);
    public void visit(SingleActualParameters SingleActualParameters);
    public void visit(MultipleActualParameters MultipleActualParameters);
    public void visit(NoActualParameters NoActualParameters);
    public void visit(ActualParameters ActualParameters);
    public void visit(DecrementStatement DecrementStatement);
    public void visit(IncrementStatement IncrementStatement);
    public void visit(MethodCallStatement MethodCallStatement);
    public void visit(AssignStatementError AssignStatementError);
    public void visit(AssignStatementSuccess AssignStatementSuccess);
    public void visit(MatchedDesignatorStatementError MatchedDesignatorStatementError);
    public void visit(MatchedDesignatorStatementSuccess MatchedDesignatorStatementSuccess);
    public void visit(NoPrintArg NoPrintArg);
    public void visit(PrintArg PrintArg);
    public void visit(NoReturnExpr NoReturnExpr);
    public void visit(ReturnExpr ReturnExpr);
    public void visit(NoSecondForDesignatorStatement NoSecondForDesignatorStatement);
    public void visit(SecondForDesignatorStatement SecondForDesignatorStatement);
    public void visit(NoForCondition NoForCondition);
    public void visit(ForCondition ForCondition);
    public void visit(NoFirstForDesignatorStatement NoFirstForDesignatorStatement);
    public void visit(FirstForDesignatorStatement FirstForDesignatorStatement);
    public void visit(ConditionError ConditionError);
    public void visit(ConditionSuccess ConditionSuccess);
    public void visit(UnmatchedForStatement UnmatchedForStatement);
    public void visit(UnmatchedElseStatement UnmatchedElseStatement);
    public void visit(UnmatchedIfStatement UnmatchedIfStatement);
    public void visit(MultipleStatements MultipleStatements);
    public void visit(PrintStatement PrintStatement);
    public void visit(ReadStatement ReadStatement);
    public void visit(ReturnStatement ReturnStatement);
    public void visit(ContinueStatement ContinueStatement);
    public void visit(BreakStatement BreakStatement);
    public void visit(MatchedForStatement MatchedForStatement);
    public void visit(MatchedIfStatement MatchedIfStatement);
    public void visit(MatchedDesignatorStmt MatchedDesignatorStmt);
    public void visit(UnmatchedStmt UnmatchedStmt);
    public void visit(MatchedStmt MatchedStmt);
    public void visit(Type Type);
    public void visit(FormParNoArray FormParNoArray);
    public void visit(FormParArray FormParArray);
    public void visit(SingleFormParError SingleFormParError);
    public void visit(SingleFormParSuccess SingleFormParSuccess);
    public void visit(SingleFormalParameters SingleFormalParameters);
    public void visit(MultipleFormalParameters MultipleFormalParameters);
    public void visit(NoStatements NoStatements);
    public void visit(Statements Statements);
    public void visit(NoFormalParameters NoFormalParameters);
    public void visit(FormalParameters FormalParameters);
    public void visit(VoidReturn VoidReturn);
    public void visit(NoVoidReturn NoVoidReturn);
    public void visit(ClassMethodNoArrayVariable ClassMethodNoArrayVariable);
    public void visit(ClassMethodArrayVariable ClassMethodArrayVariable);
    public void visit(ClassMethodVarName ClassMethodVarName);
    public void visit(SingleClassMethodVarDecl SingleClassMethodVarDecl);
    public void visit(SingleClassMethodVariableDeclaration SingleClassMethodVariableDeclaration);
    public void visit(MultipleClassMethodVariableDeclarations MultipleClassMethodVariableDeclarations);
    public void visit(ClassMethodVarDeclError ClassMethodVarDeclError);
    public void visit(ClassMethodVarDeclSuccess ClassMethodVarDeclSuccess);
    public void visit(ClassMethodVarDeclarationsError ClassMethodVarDeclarationsError);
    public void visit(ClassMethodVarDeclarationsSuccess ClassMethodVarDeclarationsSuccess);
    public void visit(NoClassMethodVarDeclarations NoClassMethodVarDeclarations);
    public void visit(ClassMethodVarDeclarations ClassMethodVarDeclarations);
    public void visit(NoMethodArrayVariable NoMethodArrayVariable);
    public void visit(MethodArrayVariable MethodArrayVariable);
    public void visit(SingleMethodVarDecl SingleMethodVarDecl);
    public void visit(SingleMethodVariableDeclaration SingleMethodVariableDeclaration);
    public void visit(MultipleMethodVariableDeclarations MultipleMethodVariableDeclarations);
    public void visit(MethodVarDeclError MethodVarDeclError);
    public void visit(MethodVarDeclSuccess MethodVarDeclSuccess);
    public void visit(MethodVarDeclarationsError MethodVarDeclarationsError);
    public void visit(MethodVarDeclarationsSuccess MethodVarDeclarationsSuccess);
    public void visit(NoMethodVarDeclarations NoMethodVarDeclarations);
    public void visit(MethodVarDeclarations MethodVarDeclarations);
    public void visit(ClassMethodName ClassMethodName);
    public void visit(ClassMethodDecl ClassMethodDecl);
    public void visit(MethodName MethodName);
    public void visit(MethodDecl MethodDecl);
    public void visit(InterfaceMethodName InterfaceMethodName);
    public void visit(InterfaceMethodDecl InterfaceMethodDecl);
    public void visit(NoInterfaceMethods NoInterfaceMethods);
    public void visit(InterfaceMethods InterfaceMethods);
    public void visit(InterfaceName InterfaceName);
    public void visit(InterfaceDeclError InterfaceDeclError);
    public void visit(InterfaceDeclSuccess InterfaceDeclSuccess);
    public void visit(InterfaceDecl InterfaceDecl);
    public void visit(NoClassMethodsDeclarations NoClassMethodsDeclarations);
    public void visit(ClassMethodsDeclarations ClassMethodsDeclarations);
    public void visit(NoClassMethodBraces NoClassMethodBraces);
    public void visit(ClassMethodBraces ClassMethodBraces);
    public void visit(NoClassArrayVariable NoClassArrayVariable);
    public void visit(ClassArrayVariable ClassArrayVariable);
    public void visit(SingleClassVarDecl SingleClassVarDecl);
    public void visit(SingleClassVariableDeclaration SingleClassVariableDeclaration);
    public void visit(MultipleClassVariableDeclarations MultipleClassVariableDeclarations);
    public void visit(ClassVarDeclError ClassVarDeclError);
    public void visit(ClassVarDeclSuccess ClassVarDeclSuccess);
    public void visit(ClassVarDeclarationsError ClassVarDeclarationsError);
    public void visit(ClassVarDeclarationsSuccess ClassVarDeclarationsSuccess);
    public void visit(NoClassVarDeclarations NoClassVarDeclarations);
    public void visit(ClassVarDeclarations ClassVarDeclarations);
    public void visit(InterfaceImplemented InterfaceImplemented);
    public void visit(SingleInterface SingleInterface);
    public void visit(MultipleInterfaces MultipleInterfaces);
    public void visit(InterfaceImplementationError InterfaceImplementationError);
    public void visit(InterfaceImplementationSuccess InterfaceImplementationSuccess);
    public void visit(NoInterfaceImplementation NoInterfaceImplementation);
    public void visit(InterfaceImplementation InterfaceImplementation);
    public void visit(ClassInheritanceError ClassInheritanceError);
    public void visit(ClassInheritanceSuccess ClassInheritanceSuccess);
    public void visit(NoClassInheritance NoClassInheritance);
    public void visit(ClassInheritance ClassInheritance);
    public void visit(ClassName ClassName);
    public void visit(ClassDecl ClassDecl);
    public void visit(NoArrayVariable NoArrayVariable);
    public void visit(ArrayVariable ArrayVariable);
    public void visit(SingleVarDeclError SingleVarDeclError);
    public void visit(SingleVarDeclSuccess SingleVarDeclSuccess);
    public void visit(SingleVarDecl SingleVarDecl);
    public void visit(SingleVarDeclaration SingleVarDeclaration);
    public void visit(MultipleVarDeclaration MultipleVarDeclaration);
    public void visit(VarDeclError VarDeclError);
    public void visit(VarDeclSuccess VarDeclSuccess);
    public void visit(VarDecl VarDecl);
    public void visit(NoEnumElemValue NoEnumElemValue);
    public void visit(EnumElemValue EnumElemValue);
    public void visit(SingleEnumElemDeclError SingleEnumElemDeclError);
    public void visit(SingleEnumElemDeclSuccess SingleEnumElemDeclSuccess);
    public void visit(SingleEnumElemDecl SingleEnumElemDecl);
    public void visit(SingleEnumElemDeclaration SingleEnumElemDeclaration);
    public void visit(MultipleEnumElemDeclaration MultipleEnumElemDeclaration);
    public void visit(EnumName EnumName);
    public void visit(EnumDeclError EnumDeclError);
    public void visit(EnumDeclSuccess EnumDeclSuccess);
    public void visit(EnumDecl EnumDecl);
    public void visit(BoolConst BoolConst);
    public void visit(CharConst CharConst);
    public void visit(NumConst NumConst);
    public void visit(ConstName ConstName);
    public void visit(SingleConstDeclError SingleConstDeclError);
    public void visit(SingleConstDeclSuccess SingleConstDeclSuccess);
    public void visit(SingleConstDecl SingleConstDecl);
    public void visit(SingleConstDeclaration SingleConstDeclaration);
    public void visit(MultipleConstDeclaration MultipleConstDeclaration);
    public void visit(ConstDeclError ConstDeclError);
    public void visit(ConstDeclSuccess ConstDeclSuccess);
    public void visit(ConstDecl ConstDecl);
    public void visit(NoGlobalMethodsDeclarations NoGlobalMethodsDeclarations);
    public void visit(GlobalMethodsDeclarations GlobalMethodsDeclarations);
    public void visit(InterfaceDeclaration InterfaceDeclaration);
    public void visit(EnumDeclaration EnumDeclaration);
    public void visit(ClassDeclaration ClassDeclaration);
    public void visit(GlobalVariableDeclaration GlobalVariableDeclaration);
    public void visit(ConstDeclaration ConstDeclaration);
    public void visit(NoGlobalDeclarations NoGlobalDeclarations);
    public void visit(GlobalDeclarations GlobalDeclarations);
    public void visit(ProgramName ProgramName);
    public void visit(Program Program);

}
