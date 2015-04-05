// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface JuliaImmutableTypeDef extends JuliaExpression {

    @NotNull
    List<JuliaExpression> getExpressionList();

    @Nullable
    JuliaTypeParameters getTypeParameters();

    @NotNull
    List<JuliaTypedField> getTypedFieldList();

}
