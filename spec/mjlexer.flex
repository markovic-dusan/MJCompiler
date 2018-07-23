package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;

%%

// cup compatible, includes info about lines and columns

%cup
%line
%column

// specific state for processing comments

%xstate COMMENT

// end-of-file method

%eofval{
	return new_symbol(sym.EOF);
%eofval}

%{

	// utility method for token creatuion
	// args : type - sym.java constant
	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	// utility method for token creatuion
	// args : type - sym.java constant
	//	      value - Object connected with token (types: Integer for number, Character for char, Boolean for bool, String for keywords, identficators and operators)
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}

%}

%%

" " 	{ }
"\b" 	{ }
"\t" 	{ }
"\r\n" 	{ }
"\f" 	{ }

// keywords

"program"   { return new_symbol(sym.PROGRAM, yytext());  }
"break"     { return new_symbol(sym.BREAK, yytext());    }
"class"     { return new_symbol(sym.CLASS, yytext());    }
"else"      { return new_symbol(sym.ELSE, yytext());     }
"if"        { return new_symbol(sym.IF, yytext());       }
"new"       { return new_symbol(sym.NEW, yytext());      }
"print"     { return new_symbol(sym.PRINT, yytext());    }
"read"      { return new_symbol(sym.READ, yytext());     }
"return"    { return new_symbol(sym.RETURN, yytext());   }
"void"      { return new_symbol(sym.VOID, yytext());     }
"do"        { return new_symbol(sym.DO, yytext());       }
"while"     { return new_symbol(sym.WHILE, yytext());    }
"extends"   { return new_symbol(sym.EXTENDS, yytext());  }
"continue"  { return new_symbol(sym.CONTINUE, yytext()); }

// operators

"+"   { return new_symbol(sym.PLUS, yytext());               }
"-"   { return new_symbol(sym.MINUS, yytext());              }
"*"   { return new_symbol(sym.MUL, yytext());                }
"/"   { return new_symbol(sym.DIV, yytext());                }
"%"   { return new_symbol(sym.MOD, yytext());                }
"=="  { return new_symbol(sym.EQUALS, yytext());             }
"!="  { return new_symbol(sym.NOT_EQUALS, yytext());         }
">"   { return new_symbol(sym.GREATER_THAN, yytext());       }
">="  { return new_symbol(sym.GREATER_THAN_EQUALS, yytext());}
"<"   { return new_symbol(sym.LESS_THAN, yytext());          }
"<="  { return new_symbol(sym.LESS_THAN_EQUALS, yytext());   }
"&&"  { return new_symbol(sym.AND, yytext());                }
"||"  { return new_symbol(sym.OR, yytext());                 }
"="   { return new_symbol(sym.ASSIGN, yytext());             }
"++"  { return new_symbol(sym.INC, yytext());                }
"--"  { return new_symbol(sym.DEC, yytext());                }
";"   { return new_symbol(sym.SEMICOLON, yytext());          }
","   { return new_symbol(sym.COMMA, yytext());              }
"."   { return new_symbol(sym.PERIOD, yytext());             }
"("   { return new_symbol(sym.LEFT_PARENTHESIS, yytext());   }
")"   { return new_symbol(sym.RIGHT_PARENTHESIS, yytext());  }
"["   { return new_symbol(sym.LEFT_BRACKET, yytext());       }
"]"   { return new_symbol(sym.RIGHT_BRACKET, yytext());      }
"{"   { return new_symbol(sym.LEFT_BRACE, yytext());         }
"}"   { return new_symbol(sym.RIGHT_BRACE, yytext());        }

// constants

[0-9]+    { return new_symbol(sym.NUMBER, new Integer (yytext())); }
[x20-x7E] { return new_symbol(sym.CHAR, new Character (yytext())); }
"true"    { return new_symbol(sym.BOOL, new Boolean (true));       }
"false"   { return new_symbol(sym.BOOL, new Boolean (false));      }

// identifiers

([a-z]|[A-Z])[a-z|A-Z|0-9|_]* 	{return new_symbol (sym.IDENT, yytext()); }

// comments

"//" 		     { yybegin(COMMENT);   }
<COMMENT> .      { yybegin(COMMENT);   }
<COMMENT> "\r\n" { yybegin(YYINITIAL); }

// not paired; error

. { System.err.println("Leksicka greska (" + yytext() + ") u liniji " + (yyline + 1) + " i koloni " + yycolumn); }