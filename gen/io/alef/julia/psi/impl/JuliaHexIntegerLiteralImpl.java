// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaHexIntegerLiteral;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.alef.julia.psi.JuliaTypes.HEX_INTEGER;

public class JuliaHexIntegerLiteralImpl extends JuliaExpressionImpl implements JuliaHexIntegerLiteral {

    public JuliaHexIntegerLiteralImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitHexIntegerLiteral(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getHexInteger() {
        return findNotNullChildByType(HEX_INTEGER);
    }

}
