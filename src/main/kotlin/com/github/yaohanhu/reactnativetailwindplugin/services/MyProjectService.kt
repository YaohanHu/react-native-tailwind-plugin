package com.github.yaohanhu.reactnativetailwindplugin.services

import com.github.yaohanhu.reactnativetailwindplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
