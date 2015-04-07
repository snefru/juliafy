// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JuliaTypeAlias extends JuliaExpression {

  @NotNull
  List<JuliaIdentifier> getIdentifierList();

  @NotNull
  List<JuliaTypeParameters> getTypeParametersList();

}
