package io.alef.julia;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface JuliaIcons {

    final String PATH = "/icon/";
    String JULIA_PNG = "julia.png";
    final Icon FILE = IconLoader.findIcon(PATH + JULIA_PNG);
    final Icon ICON = FILE;
    final Icon MODULE_ICON = ICON;
    final Icon JULIA_24 = ICON;
    final Icon JULIA_16 = ICON;
}


