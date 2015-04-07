// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JuliaMacroDef extends JuliaExpression {

  @NotNull
  JuliaIdentifier getIdentifier();

  @NotNull
  List<JuliaStatement> getStatementList();

  @Nullable
  JuliaTuple getTuple();

}
