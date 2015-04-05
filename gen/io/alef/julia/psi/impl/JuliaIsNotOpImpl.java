// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.JuliaExpression;
import io.alef.julia.psi.JuliaIsNotOp;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class JuliaIsNotOpImpl extends JuliaExpressionImpl implements JuliaIsNotOp {

    public JuliaIsNotOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitIsNotOp(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<JuliaExpression> getExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaExpression.class);
    }

}
