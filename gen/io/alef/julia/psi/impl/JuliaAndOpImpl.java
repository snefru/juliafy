// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaAndOp;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaStatement;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

public class JuliaAndOpImpl extends JuliaExpressionImpl implements JuliaAndOp {

    public JuliaAndOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitAndOp(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaExpression getExpression() {
        return findNotNullChildByClass(JuliaExpression.class);
    }

    @Override
    @NotNull
    public JuliaStatement getStatement() {
        return findNotNullChildByClass(JuliaStatement.class);
    }

}
