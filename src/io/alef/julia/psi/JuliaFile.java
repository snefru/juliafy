package io.alef.julia.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.alef.julia.JuliaFileType;
import io.alef.julia.JuliaLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class JuliaFile extends PsiFileBase {
    public JuliaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, JuliaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JuliaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}