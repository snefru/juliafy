// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.alef.julia.psi.JuliaTypes.*;
import io.alef.julia.psi.*;

public class JuliaHexIntegerLiteralImpl extends JuliaExpressionImpl implements JuliaHexIntegerLiteral {

  public JuliaHexIntegerLiteralImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) ((JuliaVisitor)visitor).visitHexIntegerLiteral(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getHexInteger() {
    return findNotNullChildByType(HEX_INTEGER);
  }

}
