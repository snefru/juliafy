package io.alef.julia.sdk;

import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import io.alef.julia.JuliaBundle;
import org.jdom.Element;
import org.jetbrains.annotations.Nullable;

import java.io.File;

public class JuliaOsxSdkType extends SdkType {

    public static final String APPLICATIONS_DIR = "/Applications";
    private static final String DEAULT_NAME = "JuliaOSXSdk";
    private static final String PREFIX = "Julia-";
    private static final String SUFFIX = ".app";
    private static final String LIBRARY = "Contents/Resources/julia/share/julia/base";
    private static final JuliaOsxSdkType INSTANCE = new JuliaOsxSdkType();


    public JuliaOsxSdkType() {
        this(DEAULT_NAME);
    }

    public JuliaOsxSdkType(String name) {
        super(name);
    }

    static JuliaOsxSdkType getInstance() {
        return INSTANCE;
    }

    @Nullable
    private static VirtualFile root(File file, final String relativePath) {
        file = new File(file.getAbsolutePath() + File.separator + relativePath.replace('/', File.separatorChar));
        if (!file.exists() || !file.isDirectory()) return null;
        final String path = file.getAbsolutePath().replace(File.separatorChar, '/');
        return LocalFileSystem.getInstance().findFileByPath(path);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        final File[] applications = new File(APPLICATIONS_DIR).listFiles();
        for (File application : applications) {
            if (application.getName().toLowerCase().contains("julia"))
                return application.getAbsolutePath();
        }
        return APPLICATIONS_DIR;
    }

    @Override
    public boolean isValidSdkHome(String path) {
        return new File(path).getName().toLowerCase().contains("julia");

    }

    @Override
    public String suggestSdkName(String currentSdkName, String sdkHome) {
        return JuliaBundle.message("sdk.name");

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
    public void saveAdditionalData(SdkAdditionalData additionalData, Element additional) {

    }

    @Nullable
    @Override
    public String getVersionString(String sdkhome) {
        return new File(sdkhome).getName().replace(PREFIX, "").replace(SUFFIX, "");
    }

    @Override
    public void setupSdkPaths(Sdk sdk) {
        final String homePath = sdk.getHomePath();
        if (homePath == null)
            return;
        final File sdkHome = new File(homePath);
        final VirtualFile classes = root(sdkHome, LIBRARY);
        final VirtualFile sources = root(sdkHome, LIBRARY);
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
