package com.shinesolutions;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class DemoTask extends DefaultTask {
    @TaskAction
    public void greet() {
        DemoPluginExtension extension = getProject().getExtensions().findByType(DemoPluginExtension.class);
        if (extension == null) {
            extension = new DemoPluginExtension();
        }
        String message = extension.getMessage();
        System.out.println(message);
    }
}
