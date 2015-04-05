// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

public class JuliaExpressionImpl extends ASTWrapperPsiElement implements JuliaExpression {

    public JuliaExpressionImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitExpression(this);
        else super.accept(visitor);
    }

}
