package io.alef.julia;

import com.intellij.lexer.FlexAdapter;
import io.alef.julia.lexer._JuliaLexer;

public class JuliaLexerAdapter extends FlexAdapter {
    public JuliaLexerAdapter() {
        super(new _JuliaLexer(null));
    }
}