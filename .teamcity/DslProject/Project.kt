package DslProject

import DslProject.buildTypes.*
import DslProject.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("DslProject")
    name = "DSL_project"

    vcsRoot(DslProject_HttpsGithubComAjayKumar9375jsonRepoGitRefsHeadsMain)

    buildType(DslProject_Build)
})
