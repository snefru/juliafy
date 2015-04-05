package io.alef.julia;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface JuliaIcons {

    final String PATH = "/icon/";
    final Icon FILE = IconLoader.findIcon(PATH + "julia.png");
    final Icon ICON = FILE;
    final Icon MODULE_ICON = ICON;
    final Icon JULIA_24 = ICON;
    final Icon JULIA_16 = ICON;
}


