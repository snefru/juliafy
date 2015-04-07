// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.alef.julia.psi.JuliaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.alef.julia.psi.*;

public class JuliaFunctionBodyImpl extends ASTWrapperPsiElement implements JuliaFunctionBody {

  public JuliaFunctionBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) ((JuliaVisitor)visitor).visitFunctionBody(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JuliaStatement> getStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaStatement.class);
  }

}
