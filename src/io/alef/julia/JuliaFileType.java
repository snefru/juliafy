package io.alef.julia;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JuliaFileType extends LanguageFileType {
    public static final JuliaFileType INSTANCE = new JuliaFileType();
    private static final String EXTENSION = "jl";

    private JuliaFileType() {
        super(JuliaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return JuliaBundle.message("filetype.name");
    }

    @NotNull
    @Override
    public String getDescription() {
        return JuliaBundle.message("filetype.description");
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return JuliaIcons.FILE;
    }
}