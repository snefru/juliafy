// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JuliaTryCatchStmtImpl extends JuliaStatementImpl implements JuliaTryCatchStmt {

    public JuliaTryCatchStmtImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitTryCatchStmt(this);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public JuliaCatchClause getCatchClause() {
        return findChildByClass(JuliaCatchClause.class);
    }

    @Override
    @Nullable
    public JuliaFinallyClause getFinallyClause() {
        return findChildByClass(JuliaFinallyClause.class);
    }

    @Override
    @NotNull
    public List<JuliaStatement> getStatementList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaStatement.class);
    }

}
