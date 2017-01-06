package com.github.blindpirate.gogradle.task;

import com.github.blindpirate.gogradle.build.BuildManager;
import com.github.blindpirate.gogradle.core.GolangTaskContainer;
import org.gradle.api.tasks.TaskAction;

import javax.inject.Inject;

public class BuildTask extends AbstractGolangTask {

    @Inject
    private BuildManager buildManager;

    public BuildTask() {
        dependsOn(GolangTaskContainer.INSTALL_DEPENDENCIES_TASK_NAME);
    }

    @TaskAction
    public void build() {
        buildManager.build();
    }
}
