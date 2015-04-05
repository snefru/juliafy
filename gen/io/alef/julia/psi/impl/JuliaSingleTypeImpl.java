// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaSingleType;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaSingleTypeImpl extends JuliaExpressionImpl implements JuliaSingleType {

    public JuliaSingleTypeImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitSingleType(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaExpression getExpression() {
        return findChildByClass(JuliaExpression.class);
    }

}
