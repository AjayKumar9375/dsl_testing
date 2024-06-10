package JavaTestingSession01

import JavaTestingSession01.buildTypes.*
import JavaTestingSession01.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("JavaTestingSession01")
    name = "Java Testing Session 01"

    vcsRoot(JavaTestingSession01_HttpsGithubComDavorpaJavaTestingSession01gitRefsHeadsMain)

    buildType(JavaTestingSession01_Build)
})
