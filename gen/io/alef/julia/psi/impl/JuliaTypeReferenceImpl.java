// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaIdentifier;
import io.alef.julia.psi.JuliaTypeParameters;
import io.alef.julia.psi.JuliaTypeReference;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaTypeReferenceImpl extends JuliaExpressionImpl implements JuliaTypeReference {

    public JuliaTypeReferenceImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitTypeReference(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaIdentifier getIdentifier() {
        return findNotNullChildByClass(JuliaIdentifier.class);
    }

    @Override
    @Nullable
    public JuliaTypeParameters getTypeParameters() {
        return findChildByClass(JuliaTypeParameters.class);
    }

}
