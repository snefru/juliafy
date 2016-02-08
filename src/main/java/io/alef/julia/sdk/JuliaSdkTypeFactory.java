package io.alef.julia.sdk;

import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.util.SystemInfo;

public class JuliaSdkTypeFactory {

    static SdkType create() {
        if (SystemInfo.isMac) {
            return JuliaOsxSdkType.getInstance();
        }
        throw new UnsupportedOperationException("unsupported platform");
    }
}
