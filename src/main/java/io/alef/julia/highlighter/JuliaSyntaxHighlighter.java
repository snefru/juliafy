package io.alef.julia.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.alef.julia.JuliaLexerAdapter;
import io.alef.julia.psi.JuliaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class JuliaSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey COMMA = createTextAttributesKey("JULIA_COMMA", DefaultLanguageHighlighterColors.COMMA);
    private static final TextAttributesKey[] COMMA_KEYS = pack(COMMA);
    private static final TextAttributesKey SEMICOLON = createTextAttributesKey("JULIA_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    private static final TextAttributesKey[] SEMICOLON_KEYS = pack(SEMICOLON);
    private static final TextAttributesKey COMMENT = createTextAttributesKey("JULIA_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    private static final TextAttributesKey[] COMMENT_KEYS = pack(COMMENT);
    private static final TextAttributesKey NUMBER = createTextAttributesKey("JULIA_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey[] NUMBER_KEYS = pack(NUMBER);
    private static final TextAttributesKey STRING = createTextAttributesKey("JULIA_STRING", DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey[] STRING_KEYS = pack(STRING);
    private static final TextAttributesKey IDENTIFIER = createTextAttributesKey("JULIA_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    private static final TextAttributesKey[] IDENTIFIER_KEYS = pack(IDENTIFIER);
    private static final TextAttributesKey OPERATOR = createTextAttributesKey("JULIA_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey[] OPERATOR_KEYS = pack(OPERATOR);
    private static final TextAttributesKey BRACKETS = createTextAttributesKey("JULIA_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    private static final TextAttributesKey[] BRACKETS_KEYS = pack(BRACKETS);
    private static final TextAttributesKey KEYWORD = createTextAttributesKey("JULIA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    private static final TextAttributesKey[] KEYWORD_KEYS = pack(KEYWORD);
    private static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("JULIA_BAD_CHARACTER", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    private static final TextAttributesKey[] BAD_CHARACTER_KEYS = pack(BAD_CHARACTER);
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JuliaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(JuliaTypes.STRING)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(JuliaTypes.INTEGER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.FLOAT)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(JuliaTypes.PREDEFINED_FLOAT)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(JuliaTypes.ID)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.BITWISE_OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(JuliaTypes.ELMNT_OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(JuliaTypes.RELATIONAL_OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(JuliaTypes.UPDATE_OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(JuliaTypes.OTHER_OPERATOR)) {
            return OPERATOR_KEYS;
        }
        if (tokenType.equals(JuliaTypes.BINARY_INTEGER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.BRACKETS)) {
            return BRACKETS_KEYS;
        }
        if (tokenType.equals(JuliaTypes.OCTAL_INTEGER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.HEX_INTEGER)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.HEX_FLOAT)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(JuliaTypes.PREDEFINED_VALUE)) {
            return KEYWORD_KEYS;
        }
        if (tokenType.equals(JuliaTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(JuliaTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        }
        if (tokenType.equals(JuliaTypes.COMMA)) {
            return COMMA_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTER_KEYS;
        }
        return EMPTY_KEYS;
    }
}