package io.alef.julia.runner;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import io.alef.julia.JuliaBundle;
import io.alef.julia.JuliaFileType;
import io.alef.julia.JuliaIcons;
import org.jetbrains.annotations.NotNull;

public class JuliaApplicationConfigurationType extends ConfigurationTypeBase {
    public JuliaApplicationConfigurationType() {
        super("JuliaCommandLineRunConfigurationType",
                JuliaBundle.message("runner.command.line.configuration.name"),
                JuliaBundle.message("runner.command.line.configuration.name"),
                JuliaIcons.JULIA_16);
        addFactory(new ConfigurationFactory(this) {
            @Override
            public RunConfiguration createTemplateConfiguration(Project project) {
                return new JuliaApplicationConfiguration("Julia", project, JuliaApplicationConfigurationType.this);
            }

            @Override
            public boolean isApplicable(@NotNull Project project) {
                return FileTypeIndex.containsFileOfType(JuliaFileType.INSTANCE, GlobalSearchScope.projectScope(project));
            }
        });
    }

    public static JuliaApplicationConfigurationType getInstance() {
        return Extensions.findExtension(CONFIGURATION_TYPE_EP, JuliaApplicationConfigurationType.class);
    }
}
