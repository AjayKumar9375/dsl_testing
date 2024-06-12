package PythonScript

import PythonScript.buildTypes.*
import PythonScript.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("PythonScript")
    name = "Python_Script"

    vcsRoot(PythonScript_HttpsGithubComAjayKumar9375PythonScriptingGit)
    vcsRoot(PythonScript_HttpsGithubComDavorpaJavaTestingSession01git)

    buildType(PythonScript_Zip)

    subProject(PythonScript_TestingPlateform.Project)
})
