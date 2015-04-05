// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface JuliaCatchClause extends PsiElement {

    @NotNull
    List<JuliaStatement> getStatementList();

    @Nullable
    PsiElement getId();

}
