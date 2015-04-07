// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JuliaCompositeTypeDef extends JuliaExpression {

  @NotNull
  List<JuliaExpression> getExpressionList();

  @NotNull
  List<JuliaTypeParameters> getTypeParametersList();

  @NotNull
  List<JuliaTypedVariable> getTypedVariableList();

}
