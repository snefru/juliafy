// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.alef.julia.psi.JuliaRegexLiteral;
import io.alef.julia.psi.JuliaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.alef.julia.psi.JuliaTypes.REGEX;

public class JuliaRegexLiteralImpl extends JuliaExpressionImpl implements JuliaRegexLiteral {

    public JuliaRegexLiteralImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof JuliaVisitor) ((JuliaVisitor) visitor).visitRegexLiteral(this);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public PsiElement getRegex() {
        return findNotNullChildByType(REGEX);
    }

}
