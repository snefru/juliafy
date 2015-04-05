// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface JuliaIndexSpecifier extends PsiElement {

    @Nullable
    JuliaMultiIndexSpecificer getMultiIndexSpecificer();

    @Nullable
    JuliaSingleIndexSpecificer getSingleIndexSpecificer();

}
