// This is a generated file. Not intended for manual editing.
package io.alef.julia.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static io.alef.julia.psi.JuliaTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JuliaParser implements PsiParser {

    public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[]{
            create_token_set_(ELSE_IF_STMT, EXPORT_STMT, FOR_STMT, IF_STMT,
                    IMPORT_STMT, INCLUDE_STMT, RETURN_STMT, STATEMENT,
                    TRY_CATCH_STMT, USING_STMT, WHILE_STMT),
            create_token_set_(ABSTRACT_TYPE_DEF, ADD_ASSIGN_OP, AND_OP, APPLY_C_FUNCTION_OP,
                    APPLY_FUNCTION_OP, APPLY_INDEX_OP, ARRAY_CONSTRUCTOR_OP, ASSIGN_OP,
                    A_SHIFT_LEFT_ASSIGN_OP, A_SHIFT_LEFT_OP, A_SHIFT_RIGHT_ASSIGN_OP, A_SHIFT_RIGHT_OP,
                    BINARY_LITERAL, BITWISE_AND_ASSIGN_OP, BITWISE_AND_OP, BITWISE_OR_ASSIGN_OP,
                    BITWISE_OR_OP, BITWISE_XOR_ASSIGN_OP, BITWISE_XOR_OP, BIT_WISE_NOT_OP,
                    BLOCK_EXP, BOOLEAN_LITERAL, BYTE_ARRAY_LITERAL, CHAIN_EXP,
                    CHAR_LITERAL, COMPACT_FUNCTION, COMPOSITE_TYPE_DEF, COMPOUND_QUOTE_OP,
                    COMPREHENSION_OP, CONDITIONAL_OP, CONSTANT, C_TRANSPOSE_OP,
                    DIVIDE_OP, DIV_ASSIGN_OP, ELMNT_ADD_ASSIGN_OP, ELMNT_A_SHIFT_LEFT_OP,
                    ELMNT_A_SHIFT_RIGHT_OP, ELMNT_DIVIDE_OP, ELMNT_DIV_ASSIGN_OP, ELMNT_EQUALS_OP,
                    ELMNT_EXPONENT_ASSIGN_OP, ELMNT_EXPONENT_OP, ELMNT_FRACTION_ASSIGN_OP, ELMNT_FRACTION_OP,
                    ELMNT_GREATER_THAN_OP, ELMNT_GREATER_THAN_OR_EQUAL_OP, ELMNT_LESS_THAN_OP, ELMNT_LESS_THAN_OR_EQUAL_OP,
                    ELMNT_L_SHIFT_RIGHT_OP, ELMNT_MINUS_OP, ELMNT_MULTIPLY_OP, ELMNT_MULT_ASSIGN_OP,
                    ELMNT_NOT_EQUAL_OP, ELMNT_PLUS_OP, ELMNT_REMAINDER_ASSIGN_OP, ELMNT_REMAINDER_OP,
                    ELMNT_SUB_ASSIGN_OP, EMPTY_LITERAL, END_LITERAL, EQUALS_OP,
                    EXPONENT_ASSIGN_OP, EXPONENT_OP, EXPRESSION, EXP_LIST,
                    EXP_LIST_2, FACTORISE_ASSIGN_OP, FACTORISE_OP, FLOAT_LITERAL,
                    FRACTION_ASSIGN_OP, FRACTION_OP, GREATER_THAN_OP, GREATER_THAN_OR_EQUAL_OP,
                    HEX_FLOAT_LITERAL, HEX_INTEGER_LITERAL, IDENTIFIER, IMMUTABLE_TYPE_DEF,
                    INTEGER_LITERAL, INTERPOLATE_OP, INVERSE_DIVIDE_OP, INV_DIV_ASSIGN_OP,
                    IS_NOT_OP, IS_OP, LAMBDA_EXP, LESS_THAN_OP,
                    LESS_THAN_OR_EQUAL_OP, L_SHIFT_RIGHT_ASSIGN_OP, L_SHIFT_RIGHT_OP, MACRO_DEF,
                    MACRO_IDENTIFIER, MINUS_OP, MULTIPLY_OP, MULT_ASSIGN_OP,
                    NOT_EQUAL_OP, NOT_OP, OCTAL_LITERAL, OR_OP,
                    PIPE_OP, PLUS_OP, PREDEFINED_FLOAT_LITERAL, PREDEFINED_LITERAL,
                    RANGE_OP, REGEX_LITERAL, REMAINDER_ASSIGN_OP, REMAINDER_OP,
                    SELECTOR_OP, SIMPLE_QUOTE_OP, SINGLE_TYPE, SPLICE_OP,
                    STD_FUNCTION, STRING_LITERAL, SUBTYPE_OP, SUB_ASSIGN_OP,
                    TRANSPOSE_OP, TUPLE, TYPE_ALIAS, TYPE_OP,
                    TYPE_REFERENCE, UNARY_MINUS_OP, UNARY_PLUS_OP, UNION_TYPE,
                    VERSION_LITERAL),
    };

    /* ********************************************************** */
    // TypeAlias
    //     |   ChainExp
    //     |   ArrayConstructorOp        //todo confirm position before or after function definition
    //     |   ApplyIndexOp        //todo confirm position before or after function definition
    //     |   ApplyCFunctionOp
    //     |   MacroDef
    //     |   AbstractTypeDef
    //     |   CompositeTypeDef
    //     |   ImmutableTypeDef
    //     |   UnionType
    //     |   BlockExp
    //     |   Tuple //bracketed
    // //    |   group17
    //     |   group1
    // //     (?)
    //     |   ConditionalOp   //group2
    //     |   ApplyFunctionOp
    //     |   ComprehensionOp //todo precedence?
    //     |   group3
    // //     (&&)
    //     |   AndOp           //group 4
    //     |   LambdaExp       //group5
    // //     (-- -->)
    //     |   group6
    // //     (|\|>| |<\||)
    //     |   PipeOp          //group 7
    //     |   group8
    //     |   group9
    //     |   group10
    // //    |   TransposeOp
    //     |   group11
    // //    |   HVCatOp
    // //    |   HCatOp
    // //    |   VCatOp
    //     |   CTransposeOp
    //     |   group12
    //     |   group13
    //     |   group14
    //     |   group15
    // //     (|.|)))
    //     |    SelectorOp
    //     |   group17
    //         |   ExpList2
    //         |   EndLiteral
    public static boolean ArrayExpression(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ArrayExpression")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<array expression>");
        r = TypeAlias(b, l + 1);
        if (!r) r = Expression(b, l + 1, 0);
        if (!r) r = Expression(b, l + 1, 1);
        if (!r) r = Expression(b, l + 1, 2);
        if (!r) r = ApplyCFunctionOp(b, l + 1);
        if (!r) r = MacroDef(b, l + 1);
        if (!r) r = AbstractTypeDef(b, l + 1);
        if (!r) r = CompositeTypeDef(b, l + 1);
        if (!r) r = ImmutableTypeDef(b, l + 1);
        if (!r) r = UnionType(b, l + 1);
        if (!r) r = BlockExp(b, l + 1);
        if (!r) r = Tuple(b, l + 1);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 12);
        if (!r) r = Expression(b, l + 1, 13);
        if (!r) r = ComprehensionOp(b, l + 1);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 16);
        if (!r) r = Expression(b, l + 1, 17);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 19);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 24);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 29);
        if (!r) r = Expression(b, l + 1, -2);
        if (!r) r = Expression(b, l + 1, 31);
        if (!r) r = EndLiteral(b, l + 1);
        exit_section_(b, l, m, ARRAY_EXPRESSION, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // catch (id)? Statement+
    public static boolean CatchClause(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CatchClause")) return false;
        if (!nextTokenIs(b, CATCH)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, CATCH);
        r = r && CatchClause_1(b, l + 1);
        r = r && CatchClause_2(b, l + 1);
        exit_section_(b, m, CATCH_CLAUSE, r);
        return r;
    }

    // (id)?
    private static boolean CatchClause_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CatchClause_1")) return false;
        consumeToken(b, ID);
        return true;
    }

    // Statement+
    private static boolean CatchClause_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CatchClause_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "CatchClause_2", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // Identifier TypeParameters? Tuple '=' FunctionBody
    public static boolean CompactFunction(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompactFunction")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Identifier(b, l + 1);
        r = r && CompactFunction_1(b, l + 1);
        r = r && Tuple(b, l + 1);
        r = r && consumeToken(b, "=");
        r = r && FunctionBody(b, l + 1);
        exit_section_(b, m, COMPACT_FUNCTION, r);
        return r;
    }

    // TypeParameters?
    private static boolean CompactFunction_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompactFunction_1")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // const Identifier '=' Expression
    public static boolean Constant(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Constant")) return false;
        if (!nextTokenIs(b, CONST)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, CONST);
        r = r && Identifier(b, l + 1);
        r = r && consumeToken(b, "=");
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, CONSTANT, r);
        return r;
    }

    /* ********************************************************** */
    // elseif Statement+
    public static boolean ElseIfStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ElseIfStmt")) return false;
        if (!nextTokenIs(b, ELSEIF)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ELSEIF);
        r = r && ElseIfStmt_1(b, l + 1);
        exit_section_(b, m, ELSE_IF_STMT, r);
        return r;
    }

    // Statement+
    private static boolean ElseIfStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ElseIfStmt_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ElseIfStmt_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // end
    public static boolean EndLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "EndLiteral")) return false;
        if (!nextTokenIs(b, END)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, END);
        exit_section_(b, m, END_LITERAL, r);
        return r;
    }

    /* ********************************************************** */
    // Expression  (',' (Expression?))*
    public static boolean ExpList(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExpList")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _COLLAPSE_, "<exp list>");
        r = Expression(b, l + 1, -1);
        r = r && ExpList_1(b, l + 1);
        exit_section_(b, l, m, EXP_LIST, r, false, null);
        return r;
    }

    // (',' (Expression?))*
    private static boolean ExpList_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExpList_1")) return false;
        int c = current_position_(b);
        while (true) {
            if (!ExpList_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ExpList_1", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' (Expression?)
    private static boolean ExpList_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExpList_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && ExpList_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // Expression?
    private static boolean ExpList_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExpList_1_0_1")) return false;
        Expression(b, l + 1, -1);
        return true;
    }

    /* ********************************************************** */
    // export  (Identifier|MacroIdentifier) (',' (Identifier|MacroIdentifier))*
    public static boolean ExportStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExportStmt")) return false;
        if (!nextTokenIs(b, EXPORT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, EXPORT);
        r = r && ExportStmt_1(b, l + 1);
        r = r && ExportStmt_2(b, l + 1);
        exit_section_(b, m, EXPORT_STMT, r);
        return r;
    }

    // Identifier|MacroIdentifier
    private static boolean ExportStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExportStmt_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Identifier(b, l + 1);
        if (!r) r = MacroIdentifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' (Identifier|MacroIdentifier))*
    private static boolean ExportStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExportStmt_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!ExportStmt_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ExportStmt_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' (Identifier|MacroIdentifier)
    private static boolean ExportStmt_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExportStmt_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && ExportStmt_2_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // Identifier|MacroIdentifier
    private static boolean ExportStmt_2_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ExportStmt_2_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Identifier(b, l + 1);
        if (!r) r = MacroIdentifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // finally Statement+
    public static boolean FinallyClause(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FinallyClause")) return false;
        if (!nextTokenIs(b, FINALLY)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, FINALLY);
        r = r && FinallyClause_1(b, l + 1);
        exit_section_(b, m, FINALLY_CLAUSE, r);
        return r;
    }

    // Statement+
    private static boolean FinallyClause_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FinallyClause_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FinallyClause_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // IndexSpecifier Statement+ end
    public static boolean ForStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ForStmt")) return false;
        if (!nextTokenIs(b, FOR)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = IndexSpecifier(b, l + 1);
        r = r && ForStmt_1(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, FOR_STMT, r);
        return r;
    }

    // Statement+
    private static boolean ForStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ForStmt_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ForStmt_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // Statement*
    public static boolean FunctionBody(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FunctionBody")) return false;
        Marker m = enter_section_(b, l, _NONE_, "<function body>");
        int c = current_position_(b);
        while (true) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "FunctionBody", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, l, m, FUNCTION_BODY, true, false, null);
        return true;
    }

    /* ********************************************************** */
    // if  Statement+ (ElseIfStmt* (else Statement+)?)?  end
    public static boolean IfStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt")) return false;
        if (!nextTokenIs(b, IF)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, IF);
        r = r && IfStmt_1(b, l + 1);
        r = r && IfStmt_2(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, IF_STMT, r);
        return r;
    }

    // Statement+
    private static boolean IfStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "IfStmt_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (ElseIfStmt* (else Statement+)?)?
    private static boolean IfStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2")) return false;
        IfStmt_2_0(b, l + 1);
        return true;
    }

    // ElseIfStmt* (else Statement+)?
    private static boolean IfStmt_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = IfStmt_2_0_0(b, l + 1);
        r = r && IfStmt_2_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // ElseIfStmt*
    private static boolean IfStmt_2_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2_0_0")) return false;
        int c = current_position_(b);
        while (true) {
            if (!ElseIfStmt(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "IfStmt_2_0_0", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // (else Statement+)?
    private static boolean IfStmt_2_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2_0_1")) return false;
        IfStmt_2_0_1_0(b, l + 1);
        return true;
    }

    // else Statement+
    private static boolean IfStmt_2_0_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2_0_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ELSE);
        r = r && IfStmt_2_0_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // Statement+
    private static boolean IfStmt_2_0_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IfStmt_2_0_1_0_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "IfStmt_2_0_1_0_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // import Identifier (colon Identifier (',' Identifier)*)?
    public static boolean ImportStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImportStmt")) return false;
        if (!nextTokenIs(b, IMPORT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, IMPORT);
        r = r && Identifier(b, l + 1);
        r = r && ImportStmt_2(b, l + 1);
        exit_section_(b, m, IMPORT_STMT, r);
        return r;
    }

    // (colon Identifier (',' Identifier)*)?
    private static boolean ImportStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImportStmt_2")) return false;
        ImportStmt_2_0(b, l + 1);
        return true;
    }

    // colon Identifier (',' Identifier)*
    private static boolean ImportStmt_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImportStmt_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COLON);
        r = r && Identifier(b, l + 1);
        r = r && ImportStmt_2_0_2(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (',' Identifier)*
    private static boolean ImportStmt_2_0_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImportStmt_2_0_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!ImportStmt_2_0_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ImportStmt_2_0_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' Identifier
    private static boolean ImportStmt_2_0_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImportStmt_2_0_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && Identifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // include '(' string ')'
    public static boolean IncludeStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IncludeStmt")) return false;
        if (!nextTokenIs(b, INCLUDE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, INCLUDE);
        r = r && consumeToken(b, "(");
        r = r && consumeToken(b, STRING);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, INCLUDE_STMT, r);
        return r;
    }

    /* ********************************************************** */
    // for (MultiIndexSpecificer|SingleIndexSpecificer )
    public static boolean IndexSpecifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IndexSpecifier")) return false;
        if (!nextTokenIs(b, FOR)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, FOR);
        r = r && IndexSpecifier_1(b, l + 1);
        exit_section_(b, m, INDEX_SPECIFIER, r);
        return r;
    }

    // MultiIndexSpecificer|SingleIndexSpecificer
    private static boolean IndexSpecifier_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IndexSpecifier_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = MultiIndexSpecificer(b, l + 1);
        if (!r) r = SingleIndexSpecificer(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // 'module' (Statement)+ end
    public static boolean Module(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Module")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<module>");
        r = consumeToken(b, "module");
        r = r && Module_1(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, l, m, MODULE, r, false, null);
        return r;
    }

    // (Statement)+
    private static boolean Module_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Module_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Module_1_0(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Module_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "Module_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)
    private static boolean Module_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Module_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '(' id (',' id)+')' ('in'|'=') Expression
    public static boolean MultiIndexSpecificer(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MultiIndexSpecificer")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<multi index specificer>");
        r = consumeToken(b, "(");
        r = r && consumeToken(b, ID);
        r = r && MultiIndexSpecificer_2(b, l + 1);
        r = r && consumeToken(b, ")");
        r = r && MultiIndexSpecificer_4(b, l + 1);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, l, m, MULTI_INDEX_SPECIFICER, r, false, null);
        return r;
    }

    // (',' id)+
    private static boolean MultiIndexSpecificer_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MultiIndexSpecificer_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = MultiIndexSpecificer_2_0(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!MultiIndexSpecificer_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "MultiIndexSpecificer_2", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // ',' id
    private static boolean MultiIndexSpecificer_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MultiIndexSpecificer_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && consumeToken(b, ID);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'in'|'='
    private static boolean MultiIndexSpecificer_4(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MultiIndexSpecificer_4")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "in");
        if (!r) r = consumeToken(b, "=");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // 'return' Expression?
    public static boolean ReturnStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ReturnStmt")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<return stmt>");
        r = consumeToken(b, "return");
        r = r && ReturnStmt_1(b, l + 1);
        exit_section_(b, l, m, RETURN_STMT, r, false, null);
        return r;
    }

    // Expression?
    private static boolean ReturnStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ReturnStmt_1")) return false;
        Expression(b, l + 1, -1);
        return true;
    }

    /* ********************************************************** */
    // id ('in'|'=') Expression
    public static boolean SingleIndexSpecificer(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "SingleIndexSpecificer")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, ID);
        r = r && SingleIndexSpecificer_1(b, l + 1);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, SINGLE_INDEX_SPECIFICER, r);
        return r;
    }

    // 'in'|'='
    private static boolean SingleIndexSpecificer_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "SingleIndexSpecificer_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, "in");
        if (!r) r = consumeToken(b, "=");
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // Constant
    //     |   IncludeStmt
    //     |   ExportStmt
    //     |   ImportStmt
    //     |   UsingStmt
    //     |   StdFunction
    //     |   CompactFunction
    //     |   IfStmt
    //     |   ForStmt
    //     |   WhileStmt
    //     |   TryCatchStmt
    //     |   ReturnStmt
    //     |   break
    //     |   continue
    //     |   Expression
    public static boolean Statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Statement")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _COLLAPSE_, "<statement>");
        r = Constant(b, l + 1);
        if (!r) r = IncludeStmt(b, l + 1);
        if (!r) r = ExportStmt(b, l + 1);
        if (!r) r = ImportStmt(b, l + 1);
        if (!r) r = UsingStmt(b, l + 1);
        if (!r) r = StdFunction(b, l + 1);
        if (!r) r = CompactFunction(b, l + 1);
        if (!r) r = IfStmt(b, l + 1);
        if (!r) r = ForStmt(b, l + 1);
        if (!r) r = WhileStmt(b, l + 1);
        if (!r) r = TryCatchStmt(b, l + 1);
        if (!r) r = ReturnStmt(b, l + 1);
        if (!r) r = consumeToken(b, BREAK);
        if (!r) r = consumeToken(b, CONTINUE);
        if (!r) r = Expression(b, l + 1, -1);
        exit_section_(b, l, m, STATEMENT, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // function Identifier TypeParameters?  Tuple FunctionBody end
    public static boolean StdFunction(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "StdFunction")) return false;
        if (!nextTokenIs(b, FUNCTION)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, FUNCTION);
        r = r && Identifier(b, l + 1);
        r = r && StdFunction_2(b, l + 1);
        r = r && Tuple(b, l + 1);
        r = r && FunctionBody(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, STD_FUNCTION, r);
        return r;
    }

    // TypeParameters?
    private static boolean StdFunction_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "StdFunction_2")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // Expression ".'"
    public static boolean TransposeOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TransposeOp")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<transpose op>");
        r = Expression(b, l + 1, -1);
        r = r && consumeToken(b, ".'");
        exit_section_(b, l, m, TRANSPOSE_OP, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // try Statement+ CatchClause? FinallyClause? end
    public static boolean TryCatchStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TryCatchStmt")) return false;
        if (!nextTokenIs(b, TRY)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, TRY);
        r = r && TryCatchStmt_1(b, l + 1);
        r = r && TryCatchStmt_2(b, l + 1);
        r = r && TryCatchStmt_3(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, TRY_CATCH_STMT, r);
        return r;
    }

    // Statement+
    private static boolean TryCatchStmt_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TryCatchStmt_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "TryCatchStmt_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // CatchClause?
    private static boolean TryCatchStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TryCatchStmt_2")) return false;
        CatchClause(b, l + 1);
        return true;
    }

    // FinallyClause?
    private static boolean TryCatchStmt_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TryCatchStmt_3")) return false;
        FinallyClause(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // (CompactFunction|TypedField|Identifier|StdFunction)*
    static boolean TypeDefBody(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypeDefBody")) return false;
        int c = current_position_(b);
        while (true) {
            if (!TypeDefBody_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "TypeDefBody", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // CompactFunction|TypedField|Identifier|StdFunction
    private static boolean TypeDefBody_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypeDefBody_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = CompactFunction(b, l + 1);
        if (!r) r = TypedField(b, l + 1);
        if (!r) r = Identifier(b, l + 1);
        if (!r) r = StdFunction(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // '{' ExpList '}'
    public static boolean TypeParameters(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypeParameters")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<type parameters>");
        r = consumeToken(b, "{");
        r = r && ExpList(b, l + 1);
        r = r && consumeToken(b, "}");
        exit_section_(b, l, m, TYPE_PARAMETERS, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // Identifier oftype Expression
    public static boolean TypedField(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypedField")) return false;
        if (!nextTokenIs(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Identifier(b, l + 1);
        r = r && consumeToken(b, OFTYPE);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, TYPED_FIELD, r);
        return r;
    }

    /* ********************************************************** */
    // '+' Expression
    public static boolean UnaryPlusOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UnaryPlusOp")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<unary plus op>");
        r = consumeToken(b, "+");
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, l, m, UNARY_PLUS_OP, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // Module
    //     |   (Statement)+
    static boolean Unit(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Unit")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Module(b, l + 1);
        if (!r) r = Unit_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)+
    private static boolean Unit_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Unit_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Unit_1_0(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Unit_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "Unit_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)
    private static boolean Unit_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Unit_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // using Expression (',' Expression)*
    public static boolean UsingStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UsingStmt")) return false;
        if (!nextTokenIs(b, USING)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, USING);
        r = r && Expression(b, l + 1, -1);
        r = r && UsingStmt_2(b, l + 1);
        exit_section_(b, m, USING_STMT, r);
        return r;
    }

    // (',' Expression)*
    private static boolean UsingStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UsingStmt_2")) return false;
        int c = current_position_(b);
        while (true) {
            if (!UsingStmt_2_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "UsingStmt_2", c)) break;
            c = current_position_(b);
        }
        return true;
    }

    // ',' Expression
    private static boolean UsingStmt_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UsingStmt_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // while Expression Statement+ end
    public static boolean WhileStmt(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "WhileStmt")) return false;
        if (!nextTokenIs(b, WHILE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, WHILE);
        r = r && Expression(b, l + 1, -1);
        r = r && WhileStmt_2(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, WHILE_STMT, r);
        return r;
    }

    // Statement+
    private static boolean WhileStmt_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "WhileStmt_2")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!Statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "WhileStmt_2", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // Expression root: Expression
    // Operator priority table:
    // 0: ATOM(TypeAlias)
    // 1: POSTFIX(ChainExp)
    // 2: POSTFIX(ArrayConstructorOp)
    // 3: POSTFIX(ApplyIndexOp)
    // 4: PREFIX(ApplyCFunctionOp)
    // 5: PREFIX(MacroDef)
    // 6: ATOM(AbstractTypeDef)
    // 7: ATOM(CompositeTypeDef)
    // 8: ATOM(ImmutableTypeDef)
    // 9: PREFIX(UnionType)
    // 10: ATOM(BlockExp)
    // 11: ATOM(Tuple)
    // 12: BINARY(AssignOp) BINARY(AddAssignOp) BINARY(SubAssignOp) BINARY(MultAssignOp) BINARY(DivAssignOp) BINARY(FractionAssignOp) BINARY(InvDivAssignOp) BINARY(ExponentAssignOp) BINARY(RemainderAssignOp) PREFIX(BitWiseNotOp) BINARY(BitwiseOrAssignOp) BINARY(BitwiseAndAssignOp) BINARY(BitwiseXorAssignOp) BINARY(AShiftLeftAssignOp) BINARY(AShiftRightAssignOp) BINARY(LShiftRightAssignOp) BINARY(ElmntAddAssignOp) BINARY(ElmntSubAssignOp) BINARY(ElmntMultAssignOp) BINARY(ElmntDivAssignOp) BINARY(ElmntFractionAssignOp) BINARY(FactoriseAssignOp) BINARY(ElmntExponentAssignOp) BINARY(ElmntRemainderAssignOp) BINARY(RangeOp)
    // 13: BINARY(ConditionalOp)
    // 14: POSTFIX(ApplyFunctionOp)
    // 15: ATOM(ComprehensionOp)
    // 16: POSTFIX(OrOp) BINARY(BitwiseOrOp)
    // 17: POSTFIX(AndOp)
    // 18: BINARY(LambdaExp)
    // 19: BINARY(LessThanOrEqualOp) BINARY(LessThanOp) BINARY(GreaterThanOrEqualOp) BINARY(GreaterThanOp) BINARY(IsOp) BINARY(EqualsOp) BINARY(SubtypeOp) BINARY(NotEqualOp) BINARY(IsNotOp) BINARY(ElmntGreaterThanOrEqualOp) BINARY(ElmntLessThanOrEqualOp) BINARY(ElmntGreaterThanOp) BINARY(ElmntLessThanOp) BINARY(ElmntEqualsOp) BINARY(ElmntNotEqualOp)
    // 20: BINARY(PipeOp)
    // 21: PREFIX(SimpleQuoteOp) ATOM(CompoundQuoteOp) POSTFIX(SpliceOp)
    // 22: BINARY(PlusOp) BINARY(MinusOp) BINARY(BitwiseXorOp) BINARY(ElmntPlusOp) BINARY(ElmntMinusOp)
    // 23: BINARY(AShiftLeftOp) BINARY(LShiftRightOp) BINARY(AShiftRightOp) BINARY(ElmntAShiftLeftOp) BINARY(ElmntLShiftRightOp) BINARY(ElmntAShiftRightOp)
    // 24: BINARY(MultiplyOp) BINARY(DivideOp) BINARY(RemainderOp) BINARY(BitwiseAndOp) BINARY(InverseDivideOp) BINARY(ElmntMultiplyOp) BINARY(ElmntDivideOp) BINARY(ElmntRemainderOp) BINARY(FactoriseOp)
    // 25: POSTFIX(CTransposeOp)
    // 26: BINARY(FractionOp) BINARY(ElmntFractionOp)
    // 27: BINARY(ExponentOp) BINARY(ElmntExponentOp)
    // 28: BINARY(TypeOp) PREFIX(SingleType)
    // 29: PREFIX(UnaryMinusOp) PREFIX(NotOp) PREFIX(InterpolateOp)
    // 30: BINARY(SelectorOp)
    // 31: PREFIX(MacroIdentifier) POSTFIX(TypeReference) ATOM(Identifier) ATOM(IntegerLiteral) ATOM(HexFloatLiteral) ATOM(HexIntegerLiteral) ATOM(CharLiteral) ATOM(BinaryLiteral) ATOM(OctalLiteral) ATOM(FloatLiteral) ATOM(ByteArrayLiteral) ATOM(VersionLiteral) ATOM(RegexLiteral) ATOM(PredefinedFloatLiteral) ATOM(PredefinedLiteral) ATOM(StringLiteral) ATOM(BooleanLiteral) ATOM(EmptyLiteral)
    // 32: N_ARY(ExpList2)
    public static boolean Expression(PsiBuilder b, int l, int g) {
        if (!recursion_guard_(b, l, "Expression")) return false;
        addVariant(b, "<expression>");
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, "<expression>");
        r = TypeAlias(b, l + 1);
        if (!r) r = ApplyCFunctionOp(b, l + 1);
        if (!r) r = MacroDef(b, l + 1);
        if (!r) r = AbstractTypeDef(b, l + 1);
        if (!r) r = CompositeTypeDef(b, l + 1);
        if (!r) r = ImmutableTypeDef(b, l + 1);
        if (!r) r = UnionType(b, l + 1);
        if (!r) r = BlockExp(b, l + 1);
        if (!r) r = Tuple(b, l + 1);
        if (!r) r = BitWiseNotOp(b, l + 1);
        if (!r) r = SimpleQuoteOp(b, l + 1);
        if (!r) r = ComprehensionOp(b, l + 1);
        if (!r) r = CompoundQuoteOp(b, l + 1);
        if (!r) r = UnaryMinusOp(b, l + 1);
        if (!r) r = InterpolateOp(b, l + 1);
        if (!r) r = SingleType(b, l + 1);
        if (!r) r = NotOp(b, l + 1);
        if (!r) r = MacroIdentifier(b, l + 1);
        if (!r) r = Identifier(b, l + 1);
        if (!r) r = IntegerLiteral(b, l + 1);
        if (!r) r = HexFloatLiteral(b, l + 1);
        if (!r) r = HexIntegerLiteral(b, l + 1);
        if (!r) r = CharLiteral(b, l + 1);
        if (!r) r = BinaryLiteral(b, l + 1);
        if (!r) r = OctalLiteral(b, l + 1);
        if (!r) r = FloatLiteral(b, l + 1);
        if (!r) r = ByteArrayLiteral(b, l + 1);
        if (!r) r = VersionLiteral(b, l + 1);
        if (!r) r = RegexLiteral(b, l + 1);
        if (!r) r = PredefinedFloatLiteral(b, l + 1);
        if (!r) r = PredefinedLiteral(b, l + 1);
        if (!r) r = StringLiteral(b, l + 1);
        if (!r) r = BooleanLiteral(b, l + 1);
        if (!r) r = EmptyLiteral(b, l + 1);
        p = r;
        r = r && Expression_0(b, l + 1, g);
        exit_section_(b, l, m, null, r, p, null);
        return r || p;
    }

    public static boolean Expression_0(PsiBuilder b, int l, int g) {
        if (!recursion_guard_(b, l, "Expression_0")) return false;
        boolean r = true;
        while (true) {
            Marker m = enter_section_(b, l, _LEFT_, null);
            if (g < 1 && ChainExp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, CHAIN_EXP, r, true, null);
            } else if (g < 2 && ArrayConstructorOp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, ARRAY_CONSTRUCTOR_OP, r, true, null);
            } else if (g < 3 && ApplyIndexOp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, APPLY_INDEX_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ADD_ASGN)) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ADD_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "-=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, SUB_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "*=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, MULT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "/=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, DIV_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "//=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, FRACTION_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "\\\\=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, INV_DIV_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "^=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, EXPONENT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "%=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, REMAINDER_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "|=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, BITWISE_OR_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "&=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, BITWISE_AND_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "$=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, BITWISE_XOR_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "<<=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, A_SHIFT_LEFT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ">>=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, A_SHIFT_RIGHT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ">>>=")) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, L_SHIFT_RIGHT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".+=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_ADD_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".-=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_SUB_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".*=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_MULT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, "./=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_DIV_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".//=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_FRACTION_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".\\\\=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, FACTORISE_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".^=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_EXPONENT_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, ".%=")) {
                r = Expression(b, l, 11);
                exit_section_(b, l, m, ELMNT_REMAINDER_ASSIGN_OP, r, true, null);
            } else if (g < 12 && consumeTokenSmart(b, COLON)) {
                r = Expression(b, l, 12);
                exit_section_(b, l, m, RANGE_OP, r, true, null);
            } else if (g < 13 && consumeTokenSmart(b, "?")) {
                r = report_error_(b, Expression(b, l, 13));
                r = ConditionalOp_1(b, l + 1) && r;
                exit_section_(b, l, m, CONDITIONAL_OP, r, true, null);
            } else if (g < 14 && ApplyFunctionOp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, APPLY_FUNCTION_OP, r, true, null);
            } else if (g < 16 && OrOp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, OR_OP, r, true, null);
            } else if (g < 16 && consumeTokenSmart(b, "|")) {
                r = Expression(b, l, 16);
                exit_section_(b, l, m, BITWISE_OR_OP, r, true, null);
            } else if (g < 17 && AndOp_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, AND_OP, r, true, null);
            } else if (g < 18 && leftMarkerIs(b, IDENTIFIER) && consumeTokenSmart(b, "->")) {
                r = Expression(b, l, 17);
                exit_section_(b, l, m, LAMBDA_EXP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "<=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, LESS_THAN_OR_EQUAL_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "<")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, LESS_THAN_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ">=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, GREATER_THAN_OR_EQUAL_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ">")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, GREATER_THAN_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "===")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, IS_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "==")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, EQUALS_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "<:")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, SUBTYPE_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "!=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, NOT_EQUAL_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, "!==")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, IS_NOT_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".>=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_GREATER_THAN_OR_EQUAL_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".<=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_LESS_THAN_OR_EQUAL_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".>")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_GREATER_THAN_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".<")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_LESS_THAN_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".==")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_EQUALS_OP, r, true, null);
            } else if (g < 19 && consumeTokenSmart(b, ".!=")) {
                r = Expression(b, l, 19);
                exit_section_(b, l, m, ELMNT_NOT_EQUAL_OP, r, true, null);
            } else if (g < 20 && consumeTokenSmart(b, "|>")) {
                r = Expression(b, l, 20);
                exit_section_(b, l, m, PIPE_OP, r, true, null);
            } else if (g < 21 && consumeTokenSmart(b, "...")) {
                r = true;
                exit_section_(b, l, m, SPLICE_OP, r, true, null);
            } else if (g < 22 && consumeTokenSmart(b, "+")) {
                r = Expression(b, l, 22);
                exit_section_(b, l, m, PLUS_OP, r, true, null);
            } else if (g < 22 && consumeTokenSmart(b, "-")) {
                r = Expression(b, l, 22);
                exit_section_(b, l, m, MINUS_OP, r, true, null);
            } else if (g < 22 && consumeTokenSmart(b, "$")) {
                r = Expression(b, l, 22);
                exit_section_(b, l, m, BITWISE_XOR_OP, r, true, null);
            } else if (g < 22 && consumeTokenSmart(b, ".+")) {
                r = Expression(b, l, 22);
                exit_section_(b, l, m, ELMNT_PLUS_OP, r, true, null);
            } else if (g < 22 && consumeTokenSmart(b, ".-")) {
                r = Expression(b, l, 22);
                exit_section_(b, l, m, ELMNT_MINUS_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, "<<")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, A_SHIFT_LEFT_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, ">>>")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, L_SHIFT_RIGHT_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, ">>")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, A_SHIFT_RIGHT_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, ".<<")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, ELMNT_A_SHIFT_LEFT_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, ".>>>")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, ELMNT_L_SHIFT_RIGHT_OP, r, true, null);
            } else if (g < 23 && consumeTokenSmart(b, ".>>")) {
                r = Expression(b, l, 23);
                exit_section_(b, l, m, ELMNT_A_SHIFT_RIGHT_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "*")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, MULTIPLY_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "/")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, DIVIDE_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "%")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, REMAINDER_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "&")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, BITWISE_AND_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "\\\\")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, INVERSE_DIVIDE_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, ".*")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, ELMNT_MULTIPLY_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, "./")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, ELMNT_DIVIDE_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, ".%")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, ELMNT_REMAINDER_OP, r, true, null);
            } else if (g < 24 && consumeTokenSmart(b, ".\\\\")) {
                r = Expression(b, l, 24);
                exit_section_(b, l, m, FACTORISE_OP, r, true, null);
            } else if (g < 25 && consumeTokenSmart(b, "'")) {
                r = true;
                exit_section_(b, l, m, C_TRANSPOSE_OP, r, true, null);
            } else if (g < 26 && consumeTokenSmart(b, "//")) {
                r = Expression(b, l, 26);
                exit_section_(b, l, m, FRACTION_OP, r, true, null);
            } else if (g < 26 && consumeTokenSmart(b, ".//")) {
                r = Expression(b, l, 26);
                exit_section_(b, l, m, ELMNT_FRACTION_OP, r, true, null);
            } else if (g < 27 && consumeTokenSmart(b, "^")) {
                r = Expression(b, l, 27);
                exit_section_(b, l, m, EXPONENT_OP, r, true, null);
            } else if (g < 27 && consumeTokenSmart(b, ".^")) {
                r = Expression(b, l, 27);
                exit_section_(b, l, m, ELMNT_EXPONENT_OP, r, true, null);
            } else if (g < 28 && consumeTokenSmart(b, OFTYPE)) {
                r = Expression(b, l, 28);
                exit_section_(b, l, m, TYPE_OP, r, true, null);
            } else if (g < 30 && consumeTokenSmart(b, ".")) {
                r = Expression(b, l, 30);
                exit_section_(b, l, m, SELECTOR_OP, r, true, null);
            } else if (g < 31 && leftMarkerIs(b, IDENTIFIER) && TypeReference_0(b, l + 1)) {
                r = true;
                exit_section_(b, l, m, TYPE_REFERENCE, r, true, null);
            } else if (g < 32 && consumeTokenSmart(b, COMMA)) {
                while (true) {
                    r = report_error_(b, Expression(b, l, 32));
                    if (!consumeTokenSmart(b, COMMA)) break;
                }
                exit_section_(b, l, m, EXP_LIST_2, r, true, null);
            } else {
                exit_section_(b, l, m, null, false, false, null);
                break;
            }
        }
        return r;
    }

    // typealias TypeReference Expression
    public static boolean TypeAlias(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypeAlias")) return false;
        if (!nextTokenIsFast(b, TYPEALIAS)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, TYPEALIAS);
        r = r && Expression(b, l + 1, 30);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, TYPE_ALIAS, r);
        return r;
    }

    // (semicolon Expression)+ semicolon?
    private static boolean ChainExp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ChainExp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ChainExp_0_0(b, l + 1);
        r = r && ChainExp_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (semicolon Expression)+
    private static boolean ChainExp_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ChainExp_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ChainExp_0_0_0(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!ChainExp_0_0_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "ChainExp_0_0", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // semicolon Expression
    private static boolean ChainExp_0_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ChainExp_0_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, SEMICOLON);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    // semicolon?
    private static boolean ChainExp_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ChainExp_0_1")) return false;
        consumeTokenSmart(b, SEMICOLON);
        return true;
    }

    // '[' ']'
    private static boolean ArrayConstructorOp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ArrayConstructorOp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "[");
        r = r && consumeToken(b, "]");
        exit_section_(b, m, null, r);
        return r;
    }

    // '[' ArrayExpression ']'
    private static boolean ApplyIndexOp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ApplyIndexOp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "[");
        r = r && ArrayExpression(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, m, null, r);
        return r;
    }

    public static boolean ApplyCFunctionOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ApplyCFunctionOp")) return false;
        if (!nextTokenIsFast(b, CCALL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, CCALL);
        p = r;
        r = p && Expression(b, l, 10);
        exit_section_(b, l, m, APPLY_C_FUNCTION_OP, r, p, null);
        return r || p;
    }

    public static boolean MacroDef(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroDef")) return false;
        if (!nextTokenIsFast(b, MACRO)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = MacroDef_0(b, l + 1);
        p = r;
        r = p && Expression(b, l, 10);
        r = p && report_error_(b, MacroDef_1(b, l + 1)) && r;
        exit_section_(b, l, m, MACRO_DEF, r, p, null);
        return r || p;
    }

    // macro Identifier
    private static boolean MacroDef_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroDef_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, MACRO);
        r = r && Identifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)+ end
    private static boolean MacroDef_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroDef_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = MacroDef_1_0(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)+
    private static boolean MacroDef_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroDef_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = MacroDef_1_0_0(b, l + 1);
        int c = current_position_(b);
        while (r) {
            if (!MacroDef_1_0_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "MacroDef_1_0", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    // (Statement)
    private static boolean MacroDef_1_0_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroDef_1_0_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Statement(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // abstract Identifier TypeParameters? ('<:' Expression)?
    public static boolean AbstractTypeDef(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AbstractTypeDef")) return false;
        if (!nextTokenIsFast(b, ABSTRACT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, ABSTRACT);
        r = r && Identifier(b, l + 1);
        r = r && AbstractTypeDef_2(b, l + 1);
        r = r && AbstractTypeDef_3(b, l + 1);
        exit_section_(b, m, ABSTRACT_TYPE_DEF, r);
        return r;
    }

    // TypeParameters?
    private static boolean AbstractTypeDef_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AbstractTypeDef_2")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    // ('<:' Expression)?
    private static boolean AbstractTypeDef_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AbstractTypeDef_3")) return false;
        AbstractTypeDef_3_0(b, l + 1);
        return true;
    }

    // '<:' Expression
    private static boolean AbstractTypeDef_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AbstractTypeDef_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "<:");
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'type' Identifier TypeParameters? ('<:' Expression)? TypeDefBody end
    public static boolean CompositeTypeDef(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompositeTypeDef")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<composite type def>");
        r = consumeTokenSmart(b, "type");
        r = r && Identifier(b, l + 1);
        r = r && CompositeTypeDef_2(b, l + 1);
        r = r && CompositeTypeDef_3(b, l + 1);
        r = r && TypeDefBody(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, l, m, COMPOSITE_TYPE_DEF, r, false, null);
        return r;
    }

    // TypeParameters?
    private static boolean CompositeTypeDef_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompositeTypeDef_2")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    // ('<:' Expression)?
    private static boolean CompositeTypeDef_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompositeTypeDef_3")) return false;
        CompositeTypeDef_3_0(b, l + 1);
        return true;
    }

    // '<:' Expression
    private static boolean CompositeTypeDef_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompositeTypeDef_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "<:");
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    // immutable Identifier TypeParameters? ('<:' Expression )? TypeDefBody end
    public static boolean ImmutableTypeDef(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImmutableTypeDef")) return false;
        if (!nextTokenIsFast(b, IMMUTABLE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, IMMUTABLE);
        r = r && Identifier(b, l + 1);
        r = r && ImmutableTypeDef_2(b, l + 1);
        r = r && ImmutableTypeDef_3(b, l + 1);
        r = r && TypeDefBody(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, IMMUTABLE_TYPE_DEF, r);
        return r;
    }

    // TypeParameters?
    private static boolean ImmutableTypeDef_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImmutableTypeDef_2")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    // ('<:' Expression )?
    private static boolean ImmutableTypeDef_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImmutableTypeDef_3")) return false;
        ImmutableTypeDef_3_0(b, l + 1);
        return true;
    }

    // '<:' Expression
    private static boolean ImmutableTypeDef_3_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ImmutableTypeDef_3_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "<:");
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    public static boolean UnionType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UnionType")) return false;
        if (!nextTokenIsFast(b, UNION)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, UNION);
        p = r;
        r = p && Expression(b, l, 10);
        exit_section_(b, l, m, UNION_TYPE, r, p, null);
        return r || p;
    }

    // begin Expression? end
    public static boolean BlockExp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BlockExp")) return false;
        if (!nextTokenIsFast(b, BEGIN)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, BEGIN);
        r = r && BlockExp_1(b, l + 1);
        r = r && consumeToken(b, END);
        exit_section_(b, m, BLOCK_EXP, r);
        return r;
    }

    // Expression?
    private static boolean BlockExp_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BlockExp_1")) return false;
        Expression(b, l + 1, -1);
        return true;
    }

    // '(' ExpList? ')'
    public static boolean Tuple(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Tuple")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<tuple>");
        r = consumeTokenSmart(b, "(");
        r = r && Tuple_1(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, l, m, TUPLE, r, false, null);
        return r;
    }

    // ExpList?
    private static boolean Tuple_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Tuple_1")) return false;
        ExpList(b, l + 1);
        return true;
    }

    public static boolean BitWiseNotOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BitWiseNotOp")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, "~");
        p = r;
        r = p && Expression(b, l, 12);
        exit_section_(b, l, m, BIT_WISE_NOT_OP, r, p, null);
        return r || p;
    }

    public static boolean SimpleQuoteOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "SimpleQuoteOp")) return false;
        if (!nextTokenIsFast(b, COLON)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, COLON);
        p = r;
        r = p && Expression(b, l, 21);
        exit_section_(b, l, m, SIMPLE_QUOTE_OP, r, p, null);
        return r || p;
    }

    // colon Expression
    private static boolean ConditionalOp_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ConditionalOp_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COLON);
        r = r && Expression(b, l + 1, -1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '(' ExpList? ')'
    private static boolean ApplyFunctionOp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ApplyFunctionOp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "(");
        r = r && ApplyFunctionOp_0_1(b, l + 1);
        r = r && consumeToken(b, ")");
        exit_section_(b, m, null, r);
        return r;
    }

    // ExpList?
    private static boolean ApplyFunctionOp_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ApplyFunctionOp_0_1")) return false;
        ExpList(b, l + 1);
        return true;
    }

    // '[' ( Expression IndexSpecifier | ExpList ) ']'
    public static boolean ComprehensionOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ComprehensionOp")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<comprehension op>");
        r = consumeTokenSmart(b, "[");
        r = r && ComprehensionOp_1(b, l + 1);
        r = r && consumeToken(b, "]");
        exit_section_(b, l, m, COMPREHENSION_OP, r, false, null);
        return r;
    }

    // Expression IndexSpecifier | ExpList
    private static boolean ComprehensionOp_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ComprehensionOp_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = ComprehensionOp_1_0(b, l + 1);
        if (!r) r = ExpList(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // Expression IndexSpecifier
    private static boolean ComprehensionOp_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ComprehensionOp_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Expression(b, l + 1, -1);
        r = r && IndexSpecifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '||' Statement
    private static boolean OrOp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "OrOp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "||");
        r = r && Statement(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // '&&' Statement
    private static boolean AndOp_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "AndOp_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, "&&");
        r = r && Statement(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // 'quote' Expression+ 'end'
    public static boolean CompoundQuoteOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompoundQuoteOp")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<compound quote op>");
        r = consumeTokenSmart(b, "quote");
        r = r && CompoundQuoteOp_1(b, l + 1);
        r = r && consumeToken(b, "end");
        exit_section_(b, l, m, COMPOUND_QUOTE_OP, r, false, null);
        return r;
    }

    // Expression+
    private static boolean CompoundQuoteOp_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CompoundQuoteOp_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = Expression(b, l + 1, -1);
        int c = current_position_(b);
        while (r) {
            if (!Expression(b, l + 1, -1)) break;
            if (!empty_element_parsed_guard_(b, "CompoundQuoteOp_1", c)) break;
            c = current_position_(b);
        }
        exit_section_(b, m, null, r);
        return r;
    }

    public static boolean UnaryMinusOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "UnaryMinusOp")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, "-");
        p = r;
        r = p && Expression(b, l, 29);
        exit_section_(b, l, m, UNARY_MINUS_OP, r, p, null);
        return r || p;
    }

    public static boolean InterpolateOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "InterpolateOp")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, "$");
        p = r;
        r = p && Expression(b, l, 29);
        exit_section_(b, l, m, INTERPOLATE_OP, r, p, null);
        return r || p;
    }

    public static boolean SingleType(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "SingleType")) return false;
        if (!nextTokenIsFast(b, OFTYPE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, OFTYPE);
        p = r;
        r = p && Expression(b, l, 28);
        exit_section_(b, l, m, SINGLE_TYPE, r, p, null);
        return r || p;
    }

    public static boolean NotOp(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "NotOp")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, "!");
        p = r;
        r = p && Expression(b, l, 29);
        exit_section_(b, l, m, NOT_OP, r, p, null);
        return r || p;
    }

    public static boolean MacroIdentifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "MacroIdentifier")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, null);
        r = consumeTokenSmart(b, "@");
        p = r;
        r = p && Expression(b, l, 30);
        exit_section_(b, l, m, MACRO_IDENTIFIER, r, p, null);
        return r || p;
    }

    // TypeParameters?
    private static boolean TypeReference_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "TypeReference_0")) return false;
        TypeParameters(b, l + 1);
        return true;
    }

    // id
    public static boolean Identifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "Identifier")) return false;
        if (!nextTokenIsFast(b, ID)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, ID);
        exit_section_(b, m, IDENTIFIER, r);
        return r;
    }

    // integer
    public static boolean IntegerLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "IntegerLiteral")) return false;
        if (!nextTokenIsFast(b, INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, INTEGER);
        exit_section_(b, m, INTEGER_LITERAL, r);
        return r;
    }

    // hex_float
    public static boolean HexFloatLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "HexFloatLiteral")) return false;
        if (!nextTokenIsFast(b, HEX_FLOAT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, HEX_FLOAT);
        exit_section_(b, m, HEX_FLOAT_LITERAL, r);
        return r;
    }

    // hex_integer
    public static boolean HexIntegerLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "HexIntegerLiteral")) return false;
        if (!nextTokenIsFast(b, HEX_INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, HEX_INTEGER);
        exit_section_(b, m, HEX_INTEGER_LITERAL, r);
        return r;
    }

    // char
    public static boolean CharLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "CharLiteral")) return false;
        if (!nextTokenIsFast(b, CHAR)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, CHAR);
        exit_section_(b, m, CHAR_LITERAL, r);
        return r;
    }

    // binary_integer
    public static boolean BinaryLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BinaryLiteral")) return false;
        if (!nextTokenIsFast(b, BINARY_INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, BINARY_INTEGER);
        exit_section_(b, m, BINARY_LITERAL, r);
        return r;
    }

    // octal_integer
    public static boolean OctalLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "OctalLiteral")) return false;
        if (!nextTokenIsFast(b, OCTAL_INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, OCTAL_INTEGER);
        exit_section_(b, m, OCTAL_LITERAL, r);
        return r;
    }

    // float
    public static boolean FloatLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "FloatLiteral")) return false;
        if (!nextTokenIsFast(b, FLOAT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, FLOAT);
        exit_section_(b, m, FLOAT_LITERAL, r);
        return r;
    }

    // byte_array
    public static boolean ByteArrayLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "ByteArrayLiteral")) return false;
        if (!nextTokenIsFast(b, BYTE_ARRAY)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, BYTE_ARRAY);
        exit_section_(b, m, BYTE_ARRAY_LITERAL, r);
        return r;
    }

    // version
    public static boolean VersionLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "VersionLiteral")) return false;
        if (!nextTokenIsFast(b, VERSION)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, VERSION);
        exit_section_(b, m, VERSION_LITERAL, r);
        return r;
    }

    // regex
    public static boolean RegexLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "RegexLiteral")) return false;
        if (!nextTokenIsFast(b, REGEX)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, REGEX);
        exit_section_(b, m, REGEX_LITERAL, r);
        return r;
    }

    // predefined_float
    public static boolean PredefinedFloatLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "PredefinedFloatLiteral")) return false;
        if (!nextTokenIsFast(b, PREDEFINED_FLOAT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, PREDEFINED_FLOAT);
        exit_section_(b, m, PREDEFINED_FLOAT_LITERAL, r);
        return r;
    }

    // predefined_value
    public static boolean PredefinedLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "PredefinedLiteral")) return false;
        if (!nextTokenIsFast(b, PREDEFINED_VALUE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, PREDEFINED_VALUE);
        exit_section_(b, m, PREDEFINED_LITERAL, r);
        return r;
    }

    // string
    public static boolean StringLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "StringLiteral")) return false;
        if (!nextTokenIsFast(b, STRING)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokenSmart(b, STRING);
        exit_section_(b, m, STRING_LITERAL, r);
        return r;
    }

    // true | false
    public static boolean BooleanLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "BooleanLiteral")) return false;
        if (!nextTokenIsFast(b, FALSE, TRUE)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<boolean literal>");
        r = consumeTokenSmart(b, TRUE);
        if (!r) r = consumeTokenSmart(b, FALSE);
        exit_section_(b, l, m, BOOLEAN_LITERAL, r, false, null);
        return r;
    }

    // '[' ']'
    public static boolean EmptyLiteral(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "EmptyLiteral")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, "<empty literal>");
        r = consumeTokenSmart(b, "[");
        r = r && consumeToken(b, "]");
        exit_section_(b, l, m, EMPTY_LITERAL, r, false, null);
        return r;
    }

    public ASTNode parse(IElementType t, PsiBuilder b) {
        parseLight(t, b);
        return b.getTreeBuilt();
    }

    public void parseLight(IElementType t, PsiBuilder b) {
        boolean r;
        b = adapt_builder_(t, b, this, EXTENDS_SETS_);
        Marker m = enter_section_(b, 0, _COLLAPSE_, null);
        if (t == A_SHIFT_LEFT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == A_SHIFT_LEFT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == A_SHIFT_RIGHT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == A_SHIFT_RIGHT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == ABSTRACT_TYPE_DEF) {
            r = AbstractTypeDef(b, 0);
        } else if (t == ADD_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == AND_OP) {
            r = Expression(b, 0, 16);
        } else if (t == APPLY_C_FUNCTION_OP) {
            r = ApplyCFunctionOp(b, 0);
        } else if (t == APPLY_FUNCTION_OP) {
            r = Expression(b, 0, 13);
        } else if (t == APPLY_INDEX_OP) {
            r = Expression(b, 0, 2);
        } else if (t == ARRAY_CONSTRUCTOR_OP) {
            r = Expression(b, 0, 1);
        } else if (t == ARRAY_EXPRESSION) {
            r = ArrayExpression(b, 0);
        } else if (t == ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == BINARY_LITERAL) {
            r = BinaryLiteral(b, 0);
        } else if (t == BIT_WISE_NOT_OP) {
            r = BitWiseNotOp(b, 0);
        } else if (t == BITWISE_AND_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == BITWISE_AND_OP) {
            r = Expression(b, 0, 23);
        } else if (t == BITWISE_OR_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == BITWISE_OR_OP) {
            r = Expression(b, 0, 15);
        } else if (t == BITWISE_XOR_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == BITWISE_XOR_OP) {
            r = Expression(b, 0, 21);
        } else if (t == BLOCK_EXP) {
            r = BlockExp(b, 0);
        } else if (t == BOOLEAN_LITERAL) {
            r = BooleanLiteral(b, 0);
        } else if (t == BYTE_ARRAY_LITERAL) {
            r = ByteArrayLiteral(b, 0);
        } else if (t == C_TRANSPOSE_OP) {
            r = Expression(b, 0, 24);
        } else if (t == CATCH_CLAUSE) {
            r = CatchClause(b, 0);
        } else if (t == CHAIN_EXP) {
            r = Expression(b, 0, 0);
        } else if (t == CHAR_LITERAL) {
            r = CharLiteral(b, 0);
        } else if (t == COMPACT_FUNCTION) {
            r = CompactFunction(b, 0);
        } else if (t == COMPOSITE_TYPE_DEF) {
            r = CompositeTypeDef(b, 0);
        } else if (t == COMPOUND_QUOTE_OP) {
            r = CompoundQuoteOp(b, 0);
        } else if (t == COMPREHENSION_OP) {
            r = ComprehensionOp(b, 0);
        } else if (t == CONDITIONAL_OP) {
            r = Expression(b, 0, 12);
        } else if (t == CONSTANT) {
            r = Constant(b, 0);
        } else if (t == DIV_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == DIVIDE_OP) {
            r = Expression(b, 0, 23);
        } else if (t == ELMNT_A_SHIFT_LEFT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == ELMNT_A_SHIFT_RIGHT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == ELMNT_ADD_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_DIV_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_DIVIDE_OP) {
            r = Expression(b, 0, 23);
        } else if (t == ELMNT_EQUALS_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_EXPONENT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_EXPONENT_OP) {
            r = Expression(b, 0, 26);
        } else if (t == ELMNT_FRACTION_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_FRACTION_OP) {
            r = Expression(b, 0, 25);
        } else if (t == ELMNT_GREATER_THAN_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_GREATER_THAN_OR_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_L_SHIFT_RIGHT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == ELMNT_LESS_THAN_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_LESS_THAN_OR_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_MINUS_OP) {
            r = Expression(b, 0, 21);
        } else if (t == ELMNT_MULT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_MULTIPLY_OP) {
            r = Expression(b, 0, 23);
        } else if (t == ELMNT_NOT_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == ELMNT_PLUS_OP) {
            r = Expression(b, 0, 21);
        } else if (t == ELMNT_REMAINDER_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELMNT_REMAINDER_OP) {
            r = Expression(b, 0, 23);
        } else if (t == ELMNT_SUB_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == ELSE_IF_STMT) {
            r = ElseIfStmt(b, 0);
        } else if (t == EMPTY_LITERAL) {
            r = EmptyLiteral(b, 0);
        } else if (t == END_LITERAL) {
            r = EndLiteral(b, 0);
        } else if (t == EQUALS_OP) {
            r = Expression(b, 0, 18);
        } else if (t == EXP_LIST) {
            r = ExpList(b, 0);
        } else if (t == EXP_LIST_2) {
            r = Expression(b, 0, 31);
        } else if (t == EXPONENT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == EXPONENT_OP) {
            r = Expression(b, 0, 26);
        } else if (t == EXPORT_STMT) {
            r = ExportStmt(b, 0);
        } else if (t == EXPRESSION) {
            r = Expression(b, 0, -1);
        } else if (t == FACTORISE_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == FACTORISE_OP) {
            r = Expression(b, 0, 23);
        } else if (t == FINALLY_CLAUSE) {
            r = FinallyClause(b, 0);
        } else if (t == FLOAT_LITERAL) {
            r = FloatLiteral(b, 0);
        } else if (t == FOR_STMT) {
            r = ForStmt(b, 0);
        } else if (t == FRACTION_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == FRACTION_OP) {
            r = Expression(b, 0, 25);
        } else if (t == FUNCTION_BODY) {
            r = FunctionBody(b, 0);
        } else if (t == GREATER_THAN_OP) {
            r = Expression(b, 0, 18);
        } else if (t == GREATER_THAN_OR_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == HEX_FLOAT_LITERAL) {
            r = HexFloatLiteral(b, 0);
        } else if (t == HEX_INTEGER_LITERAL) {
            r = HexIntegerLiteral(b, 0);
        } else if (t == IDENTIFIER) {
            r = Identifier(b, 0);
        } else if (t == IF_STMT) {
            r = IfStmt(b, 0);
        } else if (t == IMMUTABLE_TYPE_DEF) {
            r = ImmutableTypeDef(b, 0);
        } else if (t == IMPORT_STMT) {
            r = ImportStmt(b, 0);
        } else if (t == INCLUDE_STMT) {
            r = IncludeStmt(b, 0);
        } else if (t == INDEX_SPECIFIER) {
            r = IndexSpecifier(b, 0);
        } else if (t == INTEGER_LITERAL) {
            r = IntegerLiteral(b, 0);
        } else if (t == INTERPOLATE_OP) {
            r = InterpolateOp(b, 0);
        } else if (t == INV_DIV_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == INVERSE_DIVIDE_OP) {
            r = Expression(b, 0, 23);
        } else if (t == IS_NOT_OP) {
            r = Expression(b, 0, 18);
        } else if (t == IS_OP) {
            r = Expression(b, 0, 18);
        } else if (t == L_SHIFT_RIGHT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == L_SHIFT_RIGHT_OP) {
            r = Expression(b, 0, 22);
        } else if (t == LAMBDA_EXP) {
            r = Expression(b, 0, 17);
        } else if (t == LESS_THAN_OP) {
            r = Expression(b, 0, 18);
        } else if (t == LESS_THAN_OR_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == MACRO_DEF) {
            r = MacroDef(b, 0);
        } else if (t == MACRO_IDENTIFIER) {
            r = MacroIdentifier(b, 0);
        } else if (t == MINUS_OP) {
            r = Expression(b, 0, 21);
        } else if (t == MODULE) {
            r = Module(b, 0);
        } else if (t == MULT_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == MULTI_INDEX_SPECIFICER) {
            r = MultiIndexSpecificer(b, 0);
        } else if (t == MULTIPLY_OP) {
            r = Expression(b, 0, 23);
        } else if (t == NOT_EQUAL_OP) {
            r = Expression(b, 0, 18);
        } else if (t == NOT_OP) {
            r = NotOp(b, 0);
        } else if (t == OCTAL_LITERAL) {
            r = OctalLiteral(b, 0);
        } else if (t == OR_OP) {
            r = Expression(b, 0, 15);
        } else if (t == PIPE_OP) {
            r = Expression(b, 0, 19);
        } else if (t == PLUS_OP) {
            r = Expression(b, 0, 21);
        } else if (t == PREDEFINED_FLOAT_LITERAL) {
            r = PredefinedFloatLiteral(b, 0);
        } else if (t == PREDEFINED_LITERAL) {
            r = PredefinedLiteral(b, 0);
        } else if (t == RANGE_OP) {
            r = Expression(b, 0, 11);
        } else if (t == REGEX_LITERAL) {
            r = RegexLiteral(b, 0);
        } else if (t == REMAINDER_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == REMAINDER_OP) {
            r = Expression(b, 0, 23);
        } else if (t == RETURN_STMT) {
            r = ReturnStmt(b, 0);
        } else if (t == SELECTOR_OP) {
            r = Expression(b, 0, 29);
        } else if (t == SIMPLE_QUOTE_OP) {
            r = SimpleQuoteOp(b, 0);
        } else if (t == SINGLE_INDEX_SPECIFICER) {
            r = SingleIndexSpecificer(b, 0);
        } else if (t == SINGLE_TYPE) {
            r = SingleType(b, 0);
        } else if (t == SPLICE_OP) {
            r = Expression(b, 0, 20);
        } else if (t == STATEMENT) {
            r = Statement(b, 0);
        } else if (t == STD_FUNCTION) {
            r = StdFunction(b, 0);
        } else if (t == STRING_LITERAL) {
            r = StringLiteral(b, 0);
        } else if (t == SUB_ASSIGN_OP) {
            r = Expression(b, 0, 11);
        } else if (t == SUBTYPE_OP) {
            r = Expression(b, 0, 18);
        } else if (t == TRANSPOSE_OP) {
            r = TransposeOp(b, 0);
        } else if (t == TRY_CATCH_STMT) {
            r = TryCatchStmt(b, 0);
        } else if (t == TUPLE) {
            r = Tuple(b, 0);
        } else if (t == TYPE_ALIAS) {
            r = TypeAlias(b, 0);
        } else if (t == TYPE_OP) {
            r = Expression(b, 0, 27);
        } else if (t == TYPE_PARAMETERS) {
            r = TypeParameters(b, 0);
        } else if (t == TYPE_REFERENCE) {
            r = Expression(b, 0, 30);
        } else if (t == TYPED_FIELD) {
            r = TypedField(b, 0);
        } else if (t == UNARY_MINUS_OP) {
            r = UnaryMinusOp(b, 0);
        } else if (t == UNARY_PLUS_OP) {
            r = UnaryPlusOp(b, 0);
        } else if (t == UNION_TYPE) {
            r = UnionType(b, 0);
        } else if (t == USING_STMT) {
            r = UsingStmt(b, 0);
        } else if (t == VERSION_LITERAL) {
            r = VersionLiteral(b, 0);
        } else if (t == WHILE_STMT) {
            r = WhileStmt(b, 0);
        } else {
            r = parse_root_(t, b, 0);
        }
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
    }

    protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
        return Unit(b, l + 1);
    }

}
