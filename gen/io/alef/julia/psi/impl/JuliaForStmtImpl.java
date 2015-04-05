// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.JuliaForStmt;
import io.alef.julia.psi.JuliaIndexSpecifier;
import io.alef.julia.psi.JuliaStatement;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class JuliaForStmtImpl extends JuliaStatementImpl implements JuliaForStmt {

    public JuliaForStmtImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitForStmt(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaIndexSpecifier getIndexSpecifier() {
        return findNotNullChildByClass(JuliaIndexSpecifier.class);
    }

    @Override
    @NotNull
    public List<JuliaStatement> getStatementList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaStatement.class);
    }

}
