package PythonScript_TestingPlateform.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PythonScript_TestingPlateform_Fdf : GitVcsRoot({
    name = "fdf"
    url = "https://github.com/projectatomic/dockerfile_lint.git"
    branch = "projectatomic / dockerfile_lint"
})
