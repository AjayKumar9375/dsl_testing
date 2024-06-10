package CiCdDemo

import CiCdDemo.buildTypes.*
import CiCdDemo.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("CiCdDemo")
    name = "CI/CD_demo"

    vcsRoot(CiCdDemo_HttpsGithubComAjayKumar9375ciCdDemoGit)

    buildType(CiCdDemo_CiCdDemo1_2)
    buildType(CiCdDemo_CiCdDemo1)
})
