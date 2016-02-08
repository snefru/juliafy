package io.alef.julia.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.util.Condition;
import io.alef.julia.JuliaBundle;
import io.alef.julia.JuliaIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JuliaModuleType extends ModuleType<JuliaModuleBuilder> {
    @NonNls
    public static final String JULIA_MODULE = "JULIA_MODULE";

    public JuliaModuleType() {
        super(JULIA_MODULE);
    }

    public static ModuleType getInstance() {
        return ModuleTypeManager.getInstance().findByID(JULIA_MODULE);
    }

    @NotNull
    public String getName() {
        return JuliaBundle.message("module.type.name");
    }

    @NotNull
    public String getDescription() {
        return JuliaBundle.message("module.type.description");
    }

    public Icon getBigIcon() {
        return JuliaIcons.JULIA_24;
    }

    public Icon getNodeIcon(final boolean isOpened) {
        return JuliaIcons.JULIA_24;
    }

    @NotNull
    public JuliaModuleBuilder createModuleBuilder() {
        return new JuliaModuleBuilder();
    }

    @Nullable
    public ModuleWizardStep modifySettingsStep(@NotNull SettingsStep settingsStep, @NotNull final ModuleBuilder moduleBuilder) {
        final Condition<SdkTypeId> condition = new Condition<SdkTypeId>() {
            @Override
            public boolean value(SdkTypeId sdkType) {
                return moduleBuilder.isSuitableSdkType(sdkType);
            }
        };
        return new JuliaSettingsStep(settingsStep, moduleBuilder, condition);
    }

}

