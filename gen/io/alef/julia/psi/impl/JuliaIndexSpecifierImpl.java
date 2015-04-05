// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaIndexSpecifier;
import io.alef.julia.psi.JuliaMultiIndexSpecificer;
import io.alef.julia.psi.JuliaSingleIndexSpecificer;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaIndexSpecifierImpl extends ASTWrapperPsiElement implements JuliaIndexSpecifier {

    public JuliaIndexSpecifierImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitIndexSpecifier(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaMultiIndexSpecificer getMultiIndexSpecificer() {
        return findChildByClass(JuliaMultiIndexSpecificer.class);
    }

    @Override
    @Nullable
    public JuliaSingleIndexSpecificer getSingleIndexSpecificer() {
        return findChildByClass(JuliaSingleIndexSpecificer.class);
    }

}
