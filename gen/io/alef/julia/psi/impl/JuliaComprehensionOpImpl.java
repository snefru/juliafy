// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaComprehensionOp;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaIndexSpecifier;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaComprehensionOpImpl extends JuliaExpressionImpl implements JuliaComprehensionOp {

    public JuliaComprehensionOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitComprehensionOp(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaExpression getExpression() {
        return findNotNullChildByClass(JuliaExpression.class);
    }

    @Override
    @Nullable
    public JuliaIndexSpecifier getIndexSpecifier() {
        return findChildByClass(JuliaIndexSpecifier.class);
    }

}
