// This is a generated file. Not intended for manual editing.
package io.alef.julia.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface JuliaTryCatchStmt extends JuliaStatement {

    @Nullable
    JuliaCatchClause getCatchClause();

    @Nullable
    JuliaFinallyClause getFinallyClause();

    @NotNull
    List<JuliaStatement> getStatementList();

}
