// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaInterpolateOp;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaInterpolateOpImpl extends JuliaExpressionImpl implements JuliaInterpolateOp {

    public JuliaInterpolateOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitInterpolateOp(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaExpression getExpression() {
        return findChildByClass(JuliaExpression.class);
    }

}
