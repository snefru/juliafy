// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import io.alef.julia.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JuliaMacroDefImpl extends JuliaExpressionImpl implements JuliaMacroDef {

    public JuliaMacroDefImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitMacroDef(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public JuliaIdentifier getIdentifier() {
        return findNotNullChildByClass(JuliaIdentifier.class);
    }

    @Override
    @NotNull
    public List<JuliaStatement> getStatementList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaStatement.class);
    }

    @Override
    @Nullable
    public JuliaTuple getTuple() {
        return findChildByClass(JuliaTuple.class);
    }

}
