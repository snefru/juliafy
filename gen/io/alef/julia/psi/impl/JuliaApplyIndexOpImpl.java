// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaApplyIndexOp;
import io.alef.julia.psi.JuliaArrayExpression;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

public class JuliaApplyIndexOpImpl extends JuliaExpressionImpl implements JuliaApplyIndexOp {

    public JuliaApplyIndexOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitApplyIndexOp(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaArrayExpression getArrayExpression() {
        return findNotNullChildByClass(JuliaArrayExpression.class);
    }

    @Override
    @NotNull
    public JuliaExpression getExpression() {
        return findNotNullChildByClass(JuliaExpression.class);
    }

}
