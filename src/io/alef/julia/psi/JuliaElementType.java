package io.alef.julia.psi;

import com.intellij.psi.tree.IElementType;
import io.alef.julia.JuliaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JuliaElementType extends IElementType {
    public JuliaElementType(@NotNull @NonNls String debugName) {
        super(debugName, JuliaLanguage.INSTANCE);
    }
}