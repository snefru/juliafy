// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaApplyCFunctionOp;
import io.alef.julia.psi.JuliaTuple;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JuliaApplyCFunctionOpImpl extends JuliaExpressionImpl implements JuliaApplyCFunctionOp {

    public JuliaApplyCFunctionOpImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitApplyCFunctionOp(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaTuple getTuple() {
        return findChildByClass(JuliaTuple.class);
    }

}
