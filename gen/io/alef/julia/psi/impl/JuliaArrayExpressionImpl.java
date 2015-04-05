// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaArrayExpression;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

public class JuliaArrayExpressionImpl extends ASTWrapperPsiElement implements JuliaArrayExpression {

    public JuliaArrayExpressionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitArrayExpression(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaExpression getExpression() {
        return findNotNullChildByClass(JuliaExpression.class);
    }

}
