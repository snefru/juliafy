// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaEmptyLiteral;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

public class JuliaEmptyLiteralImpl extends JuliaExpressionImpl implements JuliaEmptyLiteral {

    public JuliaEmptyLiteralImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitEmptyLiteral(this);
        else super.accept(visitor);
    }

}
