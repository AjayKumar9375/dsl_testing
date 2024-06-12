package ZipingLocalDirectory

import ZipingLocalDirectory.buildTypes.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("ZipingLocalDirectory")
    name = "project_43"

    buildType(ZipingLocalDirectory_LocalDir)
})
