// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaPredefinedFloatLiteral;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.alef.julia.psi.JuliaTypes.PREDEFINED_FLOAT;

public class JuliaPredefinedFloatLiteralImpl extends JuliaExpressionImpl implements JuliaPredefinedFloatLiteral {

    public JuliaPredefinedFloatLiteralImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitPredefinedFloatLiteral(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getPredefinedFloat() {
        return findNotNullChildByType(PREDEFINED_FLOAT);
    }

}
