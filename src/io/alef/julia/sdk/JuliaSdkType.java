package io.alef.julia.sdk;

import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import io.alef.julia.JuliaBundle;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;

/**
 * Mac OSX specific
 * TODO abstract underlying OS
 */
public class JuliaSdkType extends SdkType {

    private static final String NAME = "DefaultJuliaSdkType";
    private static final String PREFIX = "Julia-";
    private static final String SUFFIX = ".app";


    public JuliaSdkType() {
        super(NAME);
    }

    @NotNull
    public static JuliaSdkType getInstance() {
        return SdkType.findInstance(JuliaSdkType.class);
    }

    @Nullable
    public static VirtualFile root(File file, final String relativePath) {
        file = new File(file.getAbsolutePath() + File.separator + relativePath.replace('/', File.separatorChar));
        if (!file.exists() || !file.isDirectory()) return null;
        String path = file.getAbsolutePath().replace(File.separatorChar, '/');
        return LocalFileSystem.getInstance().findFileByPath(path);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return null;
    }

    @Override
    public boolean isValidSdkHome(final String path) {
        return new File(path).getName().contains("Julia");
    }

    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return JuliaBundle.message("sdk.name");
    }

    @Nullable
    @Override
    public String getVersionString(String sdkHome) {
        return new File(sdkHome).getName().replace(PREFIX, "").replace(SUFFIX, "");
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(SdkModel sdkModel, SdkModificator sdkModificator) {
        return null;
    }

    @Override
    public String getPresentableName() {
        return JuliaBundle.message("sdk.name");
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData additionalData, @NotNull Element additional) {

    }

    @Override
    public void setupSdkPaths(@NotNull Sdk sdk) {
        String homePath = sdk.getHomePath();
        if (homePath == null)
            return;
        final File sdkHome = new File(homePath);
        final VirtualFile classes = root(sdkHome, "Contents/Resources/julia/share/julia/base");
        final VirtualFile sources = root(sdkHome, "Contents/Resources/julia/share/julia/base");
        final SdkModificator sdkModificator = sdk.getSdkModificator();
        if (classes != null) {
            sdkModificator.addRoot(classes, OrderRootType.CLASSES);
        }
        if (sources != null) {
            sdkModificator.addRoot(sources, OrderRootType.SOURCES);
        }
        sdkModificator.commitChanges();
    }
}
