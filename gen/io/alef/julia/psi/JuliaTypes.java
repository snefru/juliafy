// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import io.alef.julia.psi.impl.*;

public interface JuliaTypes {

    IElementType ABSTRACT_TYPE_DEF = new JuliaElementType("ABSTRACT_TYPE_DEF");
    IElementType ADD_ASSIGN_OP = new JuliaElementType("ADD_ASSIGN_OP");
    IElementType AND_OP = new JuliaElementType("AND_OP");
    IElementType APPLY_C_FUNCTION_OP = new JuliaElementType("APPLY_C_FUNCTION_OP");
    IElementType APPLY_FUNCTION_OP = new JuliaElementType("APPLY_FUNCTION_OP");
    IElementType APPLY_INDEX_OP = new JuliaElementType("APPLY_INDEX_OP");
    IElementType ARRAY_CONSTRUCTOR_OP = new JuliaElementType("ARRAY_CONSTRUCTOR_OP");
    IElementType ARRAY_EXPRESSION = new JuliaElementType("ARRAY_EXPRESSION");
    IElementType ASSIGN_OP = new JuliaElementType("ASSIGN_OP");
    IElementType A_SHIFT_LEFT_ASSIGN_OP = new JuliaElementType("A_SHIFT_LEFT_ASSIGN_OP");
    IElementType A_SHIFT_LEFT_OP = new JuliaElementType("A_SHIFT_LEFT_OP");
    IElementType A_SHIFT_RIGHT_ASSIGN_OP = new JuliaElementType("A_SHIFT_RIGHT_ASSIGN_OP");
    IElementType A_SHIFT_RIGHT_OP = new JuliaElementType("A_SHIFT_RIGHT_OP");
    IElementType BINARY_LITERAL = new JuliaElementType("BINARY_LITERAL");
    IElementType BITWISE_AND_ASSIGN_OP = new JuliaElementType("BITWISE_AND_ASSIGN_OP");
    IElementType BITWISE_AND_OP = new JuliaElementType("BITWISE_AND_OP");
    IElementType BITWISE_OR_ASSIGN_OP = new JuliaElementType("BITWISE_OR_ASSIGN_OP");
    IElementType BITWISE_OR_OP = new JuliaElementType("BITWISE_OR_OP");
    IElementType BITWISE_XOR_ASSIGN_OP = new JuliaElementType("BITWISE_XOR_ASSIGN_OP");
    IElementType BITWISE_XOR_OP = new JuliaElementType("BITWISE_XOR_OP");
    IElementType BIT_WISE_NOT_OP = new JuliaElementType("BIT_WISE_NOT_OP");
    IElementType BLOCK_EXP = new JuliaElementType("BLOCK_EXP");
    IElementType BOOLEAN_LITERAL = new JuliaElementType("BOOLEAN_LITERAL");
    IElementType BYTE_ARRAY_LITERAL = new JuliaElementType("BYTE_ARRAY_LITERAL");
    IElementType CATCH_CLAUSE = new JuliaElementType("CATCH_CLAUSE");
    IElementType CHAIN_EXP = new JuliaElementType("CHAIN_EXP");
    IElementType CHAR_LITERAL = new JuliaElementType("CHAR_LITERAL");
    IElementType COMPACT_FUNCTION = new JuliaElementType("COMPACT_FUNCTION");
    IElementType COMPOSITE_TYPE_DEF = new JuliaElementType("COMPOSITE_TYPE_DEF");
    IElementType COMPOUND_QUOTE_OP = new JuliaElementType("COMPOUND_QUOTE_OP");
    IElementType COMPREHENSION_OP = new JuliaElementType("COMPREHENSION_OP");
    IElementType CONDITIONAL_OP = new JuliaElementType("CONDITIONAL_OP");
    IElementType CONSTANT = new JuliaElementType("CONSTANT");
    IElementType C_TRANSPOSE_OP = new JuliaElementType("C_TRANSPOSE_OP");
    IElementType DIVIDE_OP = new JuliaElementType("DIVIDE_OP");
    IElementType DIV_ASSIGN_OP = new JuliaElementType("DIV_ASSIGN_OP");
    IElementType ELMNT_ADD_ASSIGN_OP = new JuliaElementType("ELMNT_ADD_ASSIGN_OP");
    IElementType ELMNT_A_SHIFT_LEFT_OP = new JuliaElementType("ELMNT_A_SHIFT_LEFT_OP");
    IElementType ELMNT_A_SHIFT_RIGHT_OP = new JuliaElementType("ELMNT_A_SHIFT_RIGHT_OP");
    IElementType ELMNT_DIVIDE_OP = new JuliaElementType("ELMNT_DIVIDE_OP");
    IElementType ELMNT_DIV_ASSIGN_OP = new JuliaElementType("ELMNT_DIV_ASSIGN_OP");
    IElementType ELMNT_EQUALS_OP = new JuliaElementType("ELMNT_EQUALS_OP");
    IElementType ELMNT_EXPONENT_ASSIGN_OP = new JuliaElementType("ELMNT_EXPONENT_ASSIGN_OP");
    IElementType ELMNT_EXPONENT_OP = new JuliaElementType("ELMNT_EXPONENT_OP");
    IElementType ELMNT_FRACTION_ASSIGN_OP = new JuliaElementType("ELMNT_FRACTION_ASSIGN_OP");
    IElementType ELMNT_FRACTION_OP = new JuliaElementType("ELMNT_FRACTION_OP");
    IElementType ELMNT_GREATER_THAN_OP = new JuliaElementType("ELMNT_GREATER_THAN_OP");
    IElementType ELMNT_GREATER_THAN_OR_EQUAL_OP = new JuliaElementType("ELMNT_GREATER_THAN_OR_EQUAL_OP");
    IElementType ELMNT_LESS_THAN_OP = new JuliaElementType("ELMNT_LESS_THAN_OP");
    IElementType ELMNT_LESS_THAN_OR_EQUAL_OP = new JuliaElementType("ELMNT_LESS_THAN_OR_EQUAL_OP");
    IElementType ELMNT_L_SHIFT_RIGHT_OP = new JuliaElementType("ELMNT_L_SHIFT_RIGHT_OP");
    IElementType ELMNT_MINUS_OP = new JuliaElementType("ELMNT_MINUS_OP");
    IElementType ELMNT_MULTIPLY_OP = new JuliaElementType("ELMNT_MULTIPLY_OP");
    IElementType ELMNT_MULT_ASSIGN_OP = new JuliaElementType("ELMNT_MULT_ASSIGN_OP");
    IElementType ELMNT_NOT_EQUAL_OP = new JuliaElementType("ELMNT_NOT_EQUAL_OP");
    IElementType ELMNT_PLUS_OP = new JuliaElementType("ELMNT_PLUS_OP");
    IElementType ELMNT_REMAINDER_ASSIGN_OP = new JuliaElementType("ELMNT_REMAINDER_ASSIGN_OP");
    IElementType ELMNT_REMAINDER_OP = new JuliaElementType("ELMNT_REMAINDER_OP");
    IElementType ELMNT_SUB_ASSIGN_OP = new JuliaElementType("ELMNT_SUB_ASSIGN_OP");
    IElementType ELSE_IF_STMT = new JuliaElementType("ELSE_IF_STMT");
    IElementType EMPTY_LITERAL = new JuliaElementType("EMPTY_LITERAL");
    IElementType END_LITERAL = new JuliaElementType("END_LITERAL");
    IElementType EQUALS_OP = new JuliaElementType("EQUALS_OP");
    IElementType EXPONENT_ASSIGN_OP = new JuliaElementType("EXPONENT_ASSIGN_OP");
    IElementType EXPONENT_OP = new JuliaElementType("EXPONENT_OP");
    IElementType EXPORT_STMT = new JuliaElementType("EXPORT_STMT");
    IElementType EXPRESSION = new JuliaElementType("EXPRESSION");
    IElementType EXP_LIST = new JuliaElementType("EXP_LIST");
    IElementType EXP_LIST_2 = new JuliaElementType("EXP_LIST_2");
    IElementType FACTORISE_ASSIGN_OP = new JuliaElementType("FACTORISE_ASSIGN_OP");
    IElementType FACTORISE_OP = new JuliaElementType("FACTORISE_OP");
    IElementType FINALLY_CLAUSE = new JuliaElementType("FINALLY_CLAUSE");
    IElementType FLOAT_LITERAL = new JuliaElementType("FLOAT_LITERAL");
    IElementType FOR_STMT = new JuliaElementType("FOR_STMT");
    IElementType FRACTION_ASSIGN_OP = new JuliaElementType("FRACTION_ASSIGN_OP");
    IElementType FRACTION_OP = new JuliaElementType("FRACTION_OP");
    IElementType FUNCTION_BODY = new JuliaElementType("FUNCTION_BODY");
    IElementType GREATER_THAN_OP = new JuliaElementType("GREATER_THAN_OP");
    IElementType GREATER_THAN_OR_EQUAL_OP = new JuliaElementType("GREATER_THAN_OR_EQUAL_OP");
    IElementType HEX_FLOAT_LITERAL = new JuliaElementType("HEX_FLOAT_LITERAL");
    IElementType HEX_INTEGER_LITERAL = new JuliaElementType("HEX_INTEGER_LITERAL");
    IElementType IDENTIFIER = new JuliaElementType("IDENTIFIER");
    IElementType IF_STMT = new JuliaElementType("IF_STMT");
    IElementType IMMUTABLE_TYPE_DEF = new JuliaElementType("IMMUTABLE_TYPE_DEF");
    IElementType IMPORT_STMT = new JuliaElementType("IMPORT_STMT");
    IElementType INCLUDE_STMT = new JuliaElementType("INCLUDE_STMT");
    IElementType INDEX_SPECIFIER = new JuliaElementType("INDEX_SPECIFIER");
    IElementType INTEGER_LITERAL = new JuliaElementType("INTEGER_LITERAL");
    IElementType INTERPOLATE_OP = new JuliaElementType("INTERPOLATE_OP");
    IElementType INVERSE_DIVIDE_OP = new JuliaElementType("INVERSE_DIVIDE_OP");
    IElementType INV_DIV_ASSIGN_OP = new JuliaElementType("INV_DIV_ASSIGN_OP");
    IElementType IS_NOT_OP = new JuliaElementType("IS_NOT_OP");
    IElementType IS_OP = new JuliaElementType("IS_OP");
    IElementType LAMBDA_EXP = new JuliaElementType("LAMBDA_EXP");
    IElementType LESS_THAN_OP = new JuliaElementType("LESS_THAN_OP");
    IElementType LESS_THAN_OR_EQUAL_OP = new JuliaElementType("LESS_THAN_OR_EQUAL_OP");
    IElementType L_SHIFT_RIGHT_ASSIGN_OP = new JuliaElementType("L_SHIFT_RIGHT_ASSIGN_OP");
    IElementType L_SHIFT_RIGHT_OP = new JuliaElementType("L_SHIFT_RIGHT_OP");
    IElementType MACRO_DEF = new JuliaElementType("MACRO_DEF");
    IElementType MACRO_IDENTIFIER = new JuliaElementType("MACRO_IDENTIFIER");
    IElementType MINUS_OP = new JuliaElementType("MINUS_OP");
    IElementType MODULE = new JuliaElementType("MODULE");
    IElementType MULTIPLY_OP = new JuliaElementType("MULTIPLY_OP");
    IElementType MULTI_INDEX_SPECIFICER = new JuliaElementType("MULTI_INDEX_SPECIFICER");
    IElementType MULT_ASSIGN_OP = new JuliaElementType("MULT_ASSIGN_OP");
    IElementType NOT_EQUAL_OP = new JuliaElementType("NOT_EQUAL_OP");
    IElementType NOT_OP = new JuliaElementType("NOT_OP");
    IElementType OCTAL_LITERAL = new JuliaElementType("OCTAL_LITERAL");
    IElementType OR_OP = new JuliaElementType("OR_OP");
    IElementType PIPE_OP = new JuliaElementType("PIPE_OP");
    IElementType PLUS_OP = new JuliaElementType("PLUS_OP");
    IElementType PREDEFINED_FLOAT_LITERAL = new JuliaElementType("PREDEFINED_FLOAT_LITERAL");
    IElementType PREDEFINED_LITERAL = new JuliaElementType("PREDEFINED_LITERAL");
    IElementType RANGE_OP = new JuliaElementType("RANGE_OP");
    IElementType REGEX_LITERAL = new JuliaElementType("REGEX_LITERAL");
    IElementType REMAINDER_ASSIGN_OP = new JuliaElementType("REMAINDER_ASSIGN_OP");
    IElementType REMAINDER_OP = new JuliaElementType("REMAINDER_OP");
    IElementType RETURN_STMT = new JuliaElementType("RETURN_STMT");
    IElementType SELECTOR_OP = new JuliaElementType("SELECTOR_OP");
    IElementType SIMPLE_QUOTE_OP = new JuliaElementType("SIMPLE_QUOTE_OP");
    IElementType SINGLE_INDEX_SPECIFICER = new JuliaElementType("SINGLE_INDEX_SPECIFICER");
    IElementType SINGLE_TYPE = new JuliaElementType("SINGLE_TYPE");
    IElementType SPLICE_OP = new JuliaElementType("SPLICE_OP");
    IElementType STATEMENT = new JuliaElementType("STATEMENT");
    IElementType STD_FUNCTION = new JuliaElementType("STD_FUNCTION");
    IElementType STRING_LITERAL = new JuliaElementType("STRING_LITERAL");
    IElementType SUBTYPE_OP = new JuliaElementType("SUBTYPE_OP");
    IElementType SUB_ASSIGN_OP = new JuliaElementType("SUB_ASSIGN_OP");
    IElementType TRANSPOSE_OP = new JuliaElementType("TRANSPOSE_OP");
    IElementType TRY_CATCH_STMT = new JuliaElementType("TRY_CATCH_STMT");
    IElementType TUPLE = new JuliaElementType("TUPLE");
    IElementType TYPED_FIELD = new JuliaElementType("TYPED_FIELD");
    IElementType TYPE_ALIAS = new JuliaElementType("TYPE_ALIAS");
    IElementType TYPE_OP = new JuliaElementType("TYPE_OP");
    IElementType TYPE_PARAMETERS = new JuliaElementType("TYPE_PARAMETERS");
    IElementType TYPE_REFERENCE = new JuliaElementType("TYPE_REFERENCE");
    IElementType UNARY_MINUS_OP = new JuliaElementType("UNARY_MINUS_OP");
    IElementType UNARY_PLUS_OP = new JuliaElementType("UNARY_PLUS_OP");
    IElementType UNION_TYPE = new JuliaElementType("UNION_TYPE");
    IElementType USING_STMT = new JuliaElementType("USING_STMT");
    IElementType VERSION_LITERAL = new JuliaElementType("VERSION_LITERAL");
    IElementType WHILE_STMT = new JuliaElementType("WHILE_STMT");

    IElementType ABSTRACT = new JuliaTokenType("abstract");
    IElementType ADD_ASGN = new JuliaTokenType("+=");
    IElementType ARITHMETIC_OPERATOR = new JuliaTokenType("arithmetic_operator");
    IElementType BEGIN = new JuliaTokenType("begin");
    IElementType BINARY_INTEGER = new JuliaTokenType("binary_integer");
    IElementType BITWISE_OPERATOR = new JuliaTokenType("bitwise_operator");
    IElementType BRACKETS = new JuliaTokenType("brackets");
    IElementType BREAK = new JuliaTokenType("break");
    IElementType BYTE_ARRAY = new JuliaTokenType("byte_array");
    IElementType CATCH = new JuliaTokenType("catch");
    IElementType CCALL = new JuliaTokenType("ccall");
    IElementType CHAR = new JuliaTokenType("char");
    IElementType COLON = new JuliaTokenType(":");
    IElementType COMMA = new JuliaTokenType(",");
    IElementType COMMENT = new JuliaTokenType("comment");
    IElementType CONST = new JuliaTokenType("const");
    IElementType CONTINUE = new JuliaTokenType("continue");
    IElementType ELMNT_OPERATOR = new JuliaTokenType("elmnt_operator");
    IElementType ELSE = new JuliaTokenType("else");
    IElementType ELSEIF = new JuliaTokenType("elseif");
    IElementType END = new JuliaTokenType("end");
    IElementType EXPORT = new JuliaTokenType("export");
    IElementType FALSE = new JuliaTokenType("false");
    IElementType FINALLY = new JuliaTokenType("finally");
    IElementType FLOAT = new JuliaTokenType("float");
    IElementType FOR = new JuliaTokenType("for");
    IElementType FUNCTION = new JuliaTokenType("function");
    IElementType HEX_FLOAT = new JuliaTokenType("hex_float");
    IElementType HEX_INTEGER = new JuliaTokenType("hex_integer");
    IElementType ID = new JuliaTokenType("id");
    IElementType IF = new JuliaTokenType("if");
    IElementType IMMUTABLE = new JuliaTokenType("immutable");
    IElementType IMPORT = new JuliaTokenType("import");
    IElementType INCLUDE = new JuliaTokenType("include");
    IElementType INTEGER = new JuliaTokenType("integer");
    IElementType KEYWORD = new JuliaTokenType("keyword");
    IElementType MACRO = new JuliaTokenType("macro");
    IElementType OCTAL_INTEGER = new JuliaTokenType("octal_integer");
    IElementType OFTYPE = new JuliaTokenType("::");
    IElementType OTHER_OPERATOR = new JuliaTokenType("other_operator");
    IElementType PREDEFINED_FLOAT = new JuliaTokenType("predefined_float");
    IElementType PREDEFINED_VALUE = new JuliaTokenType("predefined_value");
    IElementType REGEX = new JuliaTokenType("regex");
    IElementType RELATIONAL_OPERATOR = new JuliaTokenType("relational_operator");
    IElementType SEMICOLON = new JuliaTokenType(";");
    IElementType STRING = new JuliaTokenType("string");
    IElementType TRUE = new JuliaTokenType("true");
    IElementType TRY = new JuliaTokenType("try");
    IElementType TYPEALIAS = new JuliaTokenType("typealias");
    IElementType UNION = new JuliaTokenType("Union");
    IElementType UPDATE_OPERATOR = new JuliaTokenType("update_operator");
    IElementType USING = new JuliaTokenType("using");
    IElementType VERSION = new JuliaTokenType("version");
    IElementType WHILE = new JuliaTokenType("while");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == ABSTRACT_TYPE_DEF) {
                return new JuliaAbstractTypeDefImpl(node);
            } else if (type == ADD_ASSIGN_OP) {
                return new JuliaAddAssignOpImpl(node);
            } else if (type == AND_OP) {
                return new JuliaAndOpImpl(node);
            } else if (type == APPLY_C_FUNCTION_OP) {
                return new JuliaApplyCFunctionOpImpl(node);
            } else if (type == APPLY_FUNCTION_OP) {
                return new JuliaApplyFunctionOpImpl(node);
            } else if (type == APPLY_INDEX_OP) {
                return new JuliaApplyIndexOpImpl(node);
            } else if (type == ARRAY_CONSTRUCTOR_OP) {
                return new JuliaArrayConstructorOpImpl(node);
            } else if (type == ARRAY_EXPRESSION) {
                return new JuliaArrayExpressionImpl(node);
            } else if (type == ASSIGN_OP) {
                return new JuliaAssignOpImpl(node);
            } else if (type == A_SHIFT_LEFT_ASSIGN_OP) {
                return new JuliaAShiftLeftAssignOpImpl(node);
            } else if (type == A_SHIFT_LEFT_OP) {
                return new JuliaAShiftLeftOpImpl(node);
            } else if (type == A_SHIFT_RIGHT_ASSIGN_OP) {
                return new JuliaAShiftRightAssignOpImpl(node);
            } else if (type == A_SHIFT_RIGHT_OP) {
                return new JuliaAShiftRightOpImpl(node);
            } else if (type == BINARY_LITERAL) {
                return new JuliaBinaryLiteralImpl(node);
            } else if (type == BITWISE_AND_ASSIGN_OP) {
                return new JuliaBitwiseAndAssignOpImpl(node);
            } else if (type == BITWISE_AND_OP) {
                return new JuliaBitwiseAndOpImpl(node);
            } else if (type == BITWISE_OR_ASSIGN_OP) {
                return new JuliaBitwiseOrAssignOpImpl(node);
            } else if (type == BITWISE_OR_OP) {
                return new JuliaBitwiseOrOpImpl(node);
            } else if (type == BITWISE_XOR_ASSIGN_OP) {
                return new JuliaBitwiseXorAssignOpImpl(node);
            } else if (type == BITWISE_XOR_OP) {
                return new JuliaBitwiseXorOpImpl(node);
            } else if (type == BIT_WISE_NOT_OP) {
                return new JuliaBitWiseNotOpImpl(node);
            } else if (type == BLOCK_EXP) {
                return new JuliaBlockExpImpl(node);
            } else if (type == BOOLEAN_LITERAL) {
                return new JuliaBooleanLiteralImpl(node);
            } else if (type == BYTE_ARRAY_LITERAL) {
                return new JuliaByteArrayLiteralImpl(node);
            } else if (type == CATCH_CLAUSE) {
                return new JuliaCatchClauseImpl(node);
            } else if (type == CHAIN_EXP) {
                return new JuliaChainExpImpl(node);
            } else if (type == CHAR_LITERAL) {
                return new JuliaCharLiteralImpl(node);
            } else if (type == COMPACT_FUNCTION) {
                return new JuliaCompactFunctionImpl(node);
            } else if (type == COMPOSITE_TYPE_DEF) {
                return new JuliaCompositeTypeDefImpl(node);
            } else if (type == COMPOUND_QUOTE_OP) {
                return new JuliaCompoundQuoteOpImpl(node);
            } else if (type == COMPREHENSION_OP) {
                return new JuliaComprehensionOpImpl(node);
            } else if (type == CONDITIONAL_OP) {
                return new JuliaConditionalOpImpl(node);
            } else if (type == CONSTANT) {
                return new JuliaConstantImpl(node);
            } else if (type == C_TRANSPOSE_OP) {
                return new JuliaCTransposeOpImpl(node);
            } else if (type == DIVIDE_OP) {
                return new JuliaDivideOpImpl(node);
            } else if (type == DIV_ASSIGN_OP) {
                return new JuliaDivAssignOpImpl(node);
            } else if (type == ELMNT_ADD_ASSIGN_OP) {
                return new JuliaElmntAddAssignOpImpl(node);
            } else if (type == ELMNT_A_SHIFT_LEFT_OP) {
                return new JuliaElmntAShiftLeftOpImpl(node);
            } else if (type == ELMNT_A_SHIFT_RIGHT_OP) {
                return new JuliaElmntAShiftRightOpImpl(node);
            } else if (type == ELMNT_DIVIDE_OP) {
                return new JuliaElmntDivideOpImpl(node);
            } else if (type == ELMNT_DIV_ASSIGN_OP) {
                return new JuliaElmntDivAssignOpImpl(node);
            } else if (type == ELMNT_EQUALS_OP) {
                return new JuliaElmntEqualsOpImpl(node);
            } else if (type == ELMNT_EXPONENT_ASSIGN_OP) {
                return new JuliaElmntExponentAssignOpImpl(node);
            } else if (type == ELMNT_EXPONENT_OP) {
                return new JuliaElmntExponentOpImpl(node);
            } else if (type == ELMNT_FRACTION_ASSIGN_OP) {
                return new JuliaElmntFractionAssignOpImpl(node);
            } else if (type == ELMNT_FRACTION_OP) {
                return new JuliaElmntFractionOpImpl(node);
            } else if (type == ELMNT_GREATER_THAN_OP) {
                return new JuliaElmntGreaterThanOpImpl(node);
            } else if (type == ELMNT_GREATER_THAN_OR_EQUAL_OP) {
                return new JuliaElmntGreaterThanOrEqualOpImpl(node);
            } else if (type == ELMNT_LESS_THAN_OP) {
                return new JuliaElmntLessThanOpImpl(node);
            } else if (type == ELMNT_LESS_THAN_OR_EQUAL_OP) {
                return new JuliaElmntLessThanOrEqualOpImpl(node);
            } else if (type == ELMNT_L_SHIFT_RIGHT_OP) {
                return new JuliaElmntLShiftRightOpImpl(node);
            } else if (type == ELMNT_MINUS_OP) {
                return new JuliaElmntMinusOpImpl(node);
            } else if (type == ELMNT_MULTIPLY_OP) {
                return new JuliaElmntMultiplyOpImpl(node);
            } else if (type == ELMNT_MULT_ASSIGN_OP) {
                return new JuliaElmntMultAssignOpImpl(node);
            } else if (type == ELMNT_NOT_EQUAL_OP) {
                return new JuliaElmntNotEqualOpImpl(node);
            } else if (type == ELMNT_PLUS_OP) {
                return new JuliaElmntPlusOpImpl(node);
            } else if (type == ELMNT_REMAINDER_ASSIGN_OP) {
                return new JuliaElmntRemainderAssignOpImpl(node);
            } else if (type == ELMNT_REMAINDER_OP) {
                return new JuliaElmntRemainderOpImpl(node);
            } else if (type == ELMNT_SUB_ASSIGN_OP) {
                return new JuliaElmntSubAssignOpImpl(node);
            } else if (type == ELSE_IF_STMT) {
                return new JuliaElseIfStmtImpl(node);
            } else if (type == EMPTY_LITERAL) {
                return new JuliaEmptyLiteralImpl(node);
            } else if (type == END_LITERAL) {
                return new JuliaEndLiteralImpl(node);
            } else if (type == EQUALS_OP) {
                return new JuliaEqualsOpImpl(node);
            } else if (type == EXPONENT_ASSIGN_OP) {
                return new JuliaExponentAssignOpImpl(node);
            } else if (type == EXPONENT_OP) {
                return new JuliaExponentOpImpl(node);
            } else if (type == EXPORT_STMT) {
                return new JuliaExportStmtImpl(node);
            } else if (type == EXPRESSION) {
                return new JuliaExpressionImpl(node);
            } else if (type == EXP_LIST) {
                return new JuliaExpListImpl(node);
            } else if (type == EXP_LIST_2) {
                return new JuliaExpList2Impl(node);
            } else if (type == FACTORISE_ASSIGN_OP) {
                return new JuliaFactoriseAssignOpImpl(node);
            } else if (type == FACTORISE_OP) {
                return new JuliaFactoriseOpImpl(node);
            } else if (type == FINALLY_CLAUSE) {
                return new JuliaFinallyClauseImpl(node);
            } else if (type == FLOAT_LITERAL) {
                return new JuliaFloatLiteralImpl(node);
            } else if (type == FOR_STMT) {
                return new JuliaForStmtImpl(node);
            } else if (type == FRACTION_ASSIGN_OP) {
                return new JuliaFractionAssignOpImpl(node);
            } else if (type == FRACTION_OP) {
                return new JuliaFractionOpImpl(node);
            } else if (type == FUNCTION_BODY) {
                return new JuliaFunctionBodyImpl(node);
            } else if (type == GREATER_THAN_OP) {
                return new JuliaGreaterThanOpImpl(node);
            } else if (type == GREATER_THAN_OR_EQUAL_OP) {
                return new JuliaGreaterThanOrEqualOpImpl(node);
            } else if (type == HEX_FLOAT_LITERAL) {
                return new JuliaHexFloatLiteralImpl(node);
            } else if (type == HEX_INTEGER_LITERAL) {
                return new JuliaHexIntegerLiteralImpl(node);
            } else if (type == IDENTIFIER) {
                return new JuliaIdentifierImpl(node);
            } else if (type == IF_STMT) {
                return new JuliaIfStmtImpl(node);
            } else if (type == IMMUTABLE_TYPE_DEF) {
                return new JuliaImmutableTypeDefImpl(node);
            } else if (type == IMPORT_STMT) {
                return new JuliaImportStmtImpl(node);
            } else if (type == INCLUDE_STMT) {
                return new JuliaIncludeStmtImpl(node);
            } else if (type == INDEX_SPECIFIER) {
                return new JuliaIndexSpecifierImpl(node);
            } else if (type == INTEGER_LITERAL) {
                return new JuliaIntegerLiteralImpl(node);
            } else if (type == INTERPOLATE_OP) {
                return new JuliaInterpolateOpImpl(node);
            } else if (type == INVERSE_DIVIDE_OP) {
                return new JuliaInverseDivideOpImpl(node);
            } else if (type == INV_DIV_ASSIGN_OP) {
                return new JuliaInvDivAssignOpImpl(node);
            } else if (type == IS_NOT_OP) {
                return new JuliaIsNotOpImpl(node);
            } else if (type == IS_OP) {
                return new JuliaIsOpImpl(node);
            } else if (type == LAMBDA_EXP) {
                return new JuliaLambdaExpImpl(node);
            } else if (type == LESS_THAN_OP) {
                return new JuliaLessThanOpImpl(node);
            } else if (type == LESS_THAN_OR_EQUAL_OP) {
                return new JuliaLessThanOrEqualOpImpl(node);
            } else if (type == L_SHIFT_RIGHT_ASSIGN_OP) {
                return new JuliaLShiftRightAssignOpImpl(node);
            } else if (type == L_SHIFT_RIGHT_OP) {
                return new JuliaLShiftRightOpImpl(node);
            } else if (type == MACRO_DEF) {
                return new JuliaMacroDefImpl(node);
            } else if (type == MACRO_IDENTIFIER) {
                return new JuliaMacroIdentifierImpl(node);
            } else if (type == MINUS_OP) {
                return new JuliaMinusOpImpl(node);
            } else if (type == MODULE) {
                return new JuliaModuleImpl(node);
            } else if (type == MULTIPLY_OP) {
                return new JuliaMultiplyOpImpl(node);
            } else if (type == MULTI_INDEX_SPECIFICER) {
                return new JuliaMultiIndexSpecificerImpl(node);
            } else if (type == MULT_ASSIGN_OP) {
                return new JuliaMultAssignOpImpl(node);
            } else if (type == NOT_EQUAL_OP) {
                return new JuliaNotEqualOpImpl(node);
            } else if (type == NOT_OP) {
                return new JuliaNotOpImpl(node);
            } else if (type == OCTAL_LITERAL) {
                return new JuliaOctalLiteralImpl(node);
            } else if (type == OR_OP) {
                return new JuliaOrOpImpl(node);
            } else if (type == PIPE_OP) {
                return new JuliaPipeOpImpl(node);
            } else if (type == PLUS_OP) {
                return new JuliaPlusOpImpl(node);
            } else if (type == PREDEFINED_FLOAT_LITERAL) {
                return new JuliaPredefinedFloatLiteralImpl(node);
            } else if (type == PREDEFINED_LITERAL) {
                return new JuliaPredefinedLiteralImpl(node);
            } else if (type == RANGE_OP) {
                return new JuliaRangeOpImpl(node);
            } else if (type == REGEX_LITERAL) {
                return new JuliaRegexLiteralImpl(node);
            } else if (type == REMAINDER_ASSIGN_OP) {
                return new JuliaRemainderAssignOpImpl(node);
            } else if (type == REMAINDER_OP) {
                return new JuliaRemainderOpImpl(node);
            } else if (type == RETURN_STMT) {
                return new JuliaReturnStmtImpl(node);
            } else if (type == SELECTOR_OP) {
                return new JuliaSelectorOpImpl(node);
            } else if (type == SIMPLE_QUOTE_OP) {
                return new JuliaSimpleQuoteOpImpl(node);
            } else if (type == SINGLE_INDEX_SPECIFICER) {
                return new JuliaSingleIndexSpecificerImpl(node);
            } else if (type == SINGLE_TYPE) {
                return new JuliaSingleTypeImpl(node);
            } else if (type == SPLICE_OP) {
                return new JuliaSpliceOpImpl(node);
            } else if (type == STATEMENT) {
                return new JuliaStatementImpl(node);
            } else if (type == STD_FUNCTION) {
                return new JuliaStdFunctionImpl(node);
            } else if (type == STRING_LITERAL) {
                return new JuliaStringLiteralImpl(node);
            } else if (type == SUBTYPE_OP) {
                return new JuliaSubtypeOpImpl(node);
            } else if (type == SUB_ASSIGN_OP) {
                return new JuliaSubAssignOpImpl(node);
            } else if (type == TRANSPOSE_OP) {
                return new JuliaTransposeOpImpl(node);
            } else if (type == TRY_CATCH_STMT) {
                return new JuliaTryCatchStmtImpl(node);
            } else if (type == TUPLE) {
                return new JuliaTupleImpl(node);
            } else if (type == TYPED_FIELD) {
                return new JuliaTypedFieldImpl(node);
            } else if (type == TYPE_ALIAS) {
                return new JuliaTypeAliasImpl(node);
            } else if (type == TYPE_OP) {
                return new JuliaTypeOpImpl(node);
            } else if (type == TYPE_PARAMETERS) {
                return new JuliaTypeParametersImpl(node);
            } else if (type == TYPE_REFERENCE) {
                return new JuliaTypeReferenceImpl(node);
            } else if (type == UNARY_MINUS_OP) {
                return new JuliaUnaryMinusOpImpl(node);
            } else if (type == UNARY_PLUS_OP) {
                return new JuliaUnaryPlusOpImpl(node);
            } else if (type == UNION_TYPE) {
                return new JuliaUnionTypeImpl(node);
            } else if (type == USING_STMT) {
                return new JuliaUsingStmtImpl(node);
            } else if (type == VERSION_LITERAL) {
                return new JuliaVersionLiteralImpl(node);
            } else if (type == WHILE_STMT) {
                return new JuliaWhileStmtImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
