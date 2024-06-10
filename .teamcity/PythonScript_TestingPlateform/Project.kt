package PythonScript_TestingPlateform

import PythonScript_TestingPlateform.buildTypes.*
import PythonScript_TestingPlateform.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("PythonScript_TestingPlateform")
    name = "testing_plateform"

    vcsRoot(PythonScript_TestingPlateform_Fdf)

    buildType(PythonScript_TestingPlateform_Test)
})
