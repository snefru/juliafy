package io.alef.julia.psi;

import com.intellij.psi.tree.IElementType;
import io.alef.julia.JuliaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JuliaTokenType extends IElementType {
    public JuliaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, JuliaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "JuliaTokenType." + super.toString();
    }
}