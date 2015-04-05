// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaHexFloatLiteral;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.alef.julia.psi.JuliaTypes.HEX_FLOAT;

public class JuliaHexFloatLiteralImpl extends JuliaExpressionImpl implements JuliaHexFloatLiteral {

    public JuliaHexFloatLiteralImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitHexFloatLiteral(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getHexFloat() {
        return findNotNullChildByType(HEX_FLOAT);
    }

}
