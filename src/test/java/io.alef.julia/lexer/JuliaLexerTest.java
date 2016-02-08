package io.alef.julia.lexer;

import com.intellij.psi.tree.IElementType;
import io.alef.julia.JuliaLexerAdapter;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class JuliaLexerTest {


    @Test
    public void binary_literal() throws IOException {
        assertLiteralType("0b01", "binary_integer");
    }

    @Test
    public void octal_literal() throws IOException {
        assertLiteralType("0o1234567", "octal_integer");
    }

    @Test
    public void float_literal_01() throws IOException {
        assertLiteralType("0123456789.0123456789", "float");
    }

    @Test
    public void float_literal_02() throws IOException {
        assertLiteralType(".0123456789", "float");
    }

    @Ignore
    @Test
    public void float_literal_03() throws IOException {
        assertLiteralType("1.", "float");
    }

    @Test
    public void float_literal_04() throws IOException {
        assertLiteralType(".1e12", "float");
    }

    @Test
    public void float_literal_05() throws IOException {
        assertLiteralType(".1f12", "float");
    }

    @Test
    public void hex_integer_literal() throws IOException {
        assertLiteralType("0x0123456789abcdef", "hex_integer");
    }

    @Test
    public void hex_float_literal_01() throws IOException {
        assertLiteralType("0x0123456789abcdef.0123456789abcdefp1", "hex_float");
    }

    @Test
    public void hex_float_literal_02() throws IOException {
        assertLiteralType("0x.0123456789abcdefp1", "hex_float");
    }

    @Test
    public void hex_float_literal_03() throws IOException {
        assertLiteralType("0x.0123456789abcdefp-1", "hex_float");
    }

    @Test
    public void hex_float_literal_04() throws IOException {
        assertLiteralType("0x.0123456789abcdefp-1", "hex_float");
    }

    @Test
    public void byte_array_literal() throws IOException {
        assertLiteralType("b\"DATA\\xff\\u2200\"", "byte_array");
    }

    @Test
    public void regex_literal() throws IOException {
        assertLiteralType("r\"^\\s*(?:#|$)\"", "regex");
    }

    @Test
    public void version_literal() throws IOException {
        assertLiteralType("v\"0.2.1-rc1+win64\"", "version");
    }

    @Test
    public void word_size() throws IOException {
        assertLiteralType("WORD_SIZE", "predefined_value");
    }

    @Test
    public void version() throws IOException {
        assertLiteralType("VERSION", "predefined_value");
    }

    @Test
    public void hex_float_literal_05() throws IOException {
        assertLiteralType("0x1p0", "hex_float");
    }

    @Test
    public void hex_float_literal_06() throws IOException {
        assertLiteralType("0x1.8p3", "hex_float");
    }

    @Test
    public void hex_float_literal_07() throws IOException {
        assertLiteralType("0x.4p-1", "hex_float");
    }

    @Test
    public void string_literal() throws IOException {
        assertLiteralType("\"hello world\"", "string");
    }

    private void assertLiteralType(String value, String type) {
        final JuliaLexerAdapter lexer = new JuliaLexerAdapter();
        lexer.start(value);
        final IElementType tokenType = lexer.getTokenType();
        assertEquals("JuliaTokenType." + type, tokenType.toString());
    }
}
