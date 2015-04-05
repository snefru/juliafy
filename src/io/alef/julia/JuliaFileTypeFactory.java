package io.alef.julia;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class JuliaFileTypeFactory extends FileTypeFactory {

    public static final String EXTENSIONS = "jl";

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(JuliaFileType.INSTANCE, EXTENSIONS);
    }
}

