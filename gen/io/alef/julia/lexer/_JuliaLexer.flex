package io.alef.julia.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static io.alef.julia.psi.JuliaTypes.*;

%%

%{
  public _JuliaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _JuliaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

KEYWORD=begin|while|if|for|try|return|break|continue|function|macro|quote|let|local|global|const|abstract|typealias|type|bitstype|immutable|ccall|do|module|baremodule|using|import|export|importall
PREDEFINED_VALUE=WORD_SIZE|VERSION
BINARY_INTEGER=0b[01]+
BITWISE_OPERATOR=\~|\&|\||\$|>>>|>>|<<
BYTE_ARRAY=b('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
COMMENT=\#.*
INTEGER=[0-9]+
FLOAT=[0-9]*\.[0-9]+([eE][-+]?[0-9]+)?
HEX_INTEGER=0[xX][0-9a-f]+
HEX_FLOAT=0[xX][0-9a-f]*(\.[0-9a-f]+)?p[+-]?[0-9a-f]+
OCTAL_INTEGER=0o[01234567]+
PREDEFINED_FLOAT=Inf16|Inf32|Inf|-Inf16|-Inf32|-Inf|NaN16|NaN16|NaN
RELATIONAL_OPERATOR====|==|\!=|>=|<=|>|<
UPDATE_OPERATOR==|\+=|-=|\*=|"/"=|\\=|\%=|\^=|\&=|\$=|>>>=|>>=|<<=
ARITHMETIC_OPERATOR=\+|-|\*|\\
ELMNT_OPERATOR=\.(\+|-|\*|\\)
OTHER_OPERATOR=\?|\.\.\.|\|\||\&\&|\!|\.|\:|\@|\-\>|\$
BRACKETS=\(|\)|\{|\}|\[|\]
STRING=\"[^\"]*\"
CHAR='(\\[uU][0-9a-fA-F]{1,4})'|'(\\([\\\"'nrbtfav?]|[0-7]{1,3}|x[0-9a-fA-F]{1,2}))'|'.'
REGEX=r('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")
VERSION=v(('[0-9](\.[0-9]){0,2}(-[^']*)?')|(\"[0-9](\.[0-9]){0,2}(-[^']*)?\"))
ID=([a-zA-Z_])([a-zA-Z0-9_\!])*

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "+="                       { return ADD_ASGN; }
  "::"                       { return OFTYPE; }
  ":"                        { return COLON; }
  "Union"                    { return UNION; }
  ","                        { return COMMA; }
  ";"                        { return SEMICOLON; }
  "end"                      { return END; }
  "break"                    { return BREAK; }
  "continue"                 { return CONTINUE; }
  "include"                  { return INCLUDE; }
  "export"                   { return EXPORT; }
  "import"                   { return IMPORT; }
  "using"                    { return USING; }
  "macro"                    { return MACRO; }
  "if"                       { return IF; }
  "else"                     { return ELSE; }
  "elseif"                   { return ELSEIF; }
  "for"                      { return FOR; }
  "while"                    { return WHILE; }
  "try"                      { return TRY; }
  "catch"                    { return CATCH; }
  "finally"                  { return FINALLY; }
  "ccall"                    { return CCALL; }
  "begin"                    { return BEGIN; }
  "true"                     { return TRUE; }
  "false"                    { return FALSE; }
  "const"                    { return CONST; }
  "function"                 { return FUNCTION; }
  "abstract"                 { return ABSTRACT; }
  "immutable"                { return IMMUTABLE; }
  "typealias"                { return TYPEALIAS; }

  {KEYWORD}                  { return KEYWORD; }
  {PREDEFINED_VALUE}         { return PREDEFINED_VALUE; }
  {BINARY_INTEGER}           { return BINARY_INTEGER; }
  {BITWISE_OPERATOR}         { return BITWISE_OPERATOR; }
  {BYTE_ARRAY}               { return BYTE_ARRAY; }
  {COMMENT}                  { return COMMENT; }
  {INTEGER}                  { return INTEGER; }
  {FLOAT}                    { return FLOAT; }
  {HEX_INTEGER}              { return HEX_INTEGER; }
  {HEX_FLOAT}                { return HEX_FLOAT; }
  {OCTAL_INTEGER}            { return OCTAL_INTEGER; }
  {PREDEFINED_FLOAT}         { return PREDEFINED_FLOAT; }
  {RELATIONAL_OPERATOR}      { return RELATIONAL_OPERATOR; }
  {UPDATE_OPERATOR}          { return UPDATE_OPERATOR; }
  {ARITHMETIC_OPERATOR}      { return ARITHMETIC_OPERATOR; }
  {ELMNT_OPERATOR}           { return ELMNT_OPERATOR; }
  {OTHER_OPERATOR}           { return OTHER_OPERATOR; }
  {BRACKETS}                 { return BRACKETS; }
  {STRING}                   { return STRING; }
  {CHAR}                     { return CHAR; }
  {REGEX}                    { return REGEX; }
  {VERSION}                  { return VERSION; }
  {ID}                       { return ID; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
