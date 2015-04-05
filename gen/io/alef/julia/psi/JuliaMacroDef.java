// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface JuliaMacroDef extends JuliaExpression {

    @NotNull
    JuliaIdentifier getIdentifier();

    @NotNull
    List<JuliaStatement> getStatementList();

    @Nullable
    JuliaTuple getTuple();

}
