package io.alef.julia;

public class JuliaLanguage extends com.intellij.lang.Language {

    public static final JuliaLanguage INSTANCE = new JuliaLanguage();
    private static final String ID = "Julia";
    private static final String MIME_TYPES = "application/julia";

    private JuliaLanguage() {
        super(ID, MIME_TYPES);
    }

    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}
