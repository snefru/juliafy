// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.JuliaIdentifier;
import io.alef.julia.psi.JuliaImportStmt;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class JuliaImportStmtImpl extends JuliaStatementImpl implements JuliaImportStmt {

    public JuliaImportStmtImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitImportStmt(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<JuliaIdentifier> getIdentifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaIdentifier.class);
    }

}
