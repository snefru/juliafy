// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaIdentifier;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.alef.julia.psi.JuliaTypes.ID;

public class JuliaIdentifierImpl extends JuliaExpressionImpl implements JuliaIdentifier {

    public JuliaIdentifierImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitIdentifier(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getId() {
        return findNotNullChildByType(ID);
    }

}
