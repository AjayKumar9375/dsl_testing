package JsonDsl

import JsonDsl.buildTypes.*
import JsonDsl.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("JsonDsl")
    name = "Json_dsl"

    vcsRoot(JsonDsl_HttpsGithubComAjayKumar9375jsonRepoGitRefsHeadsMain)

    buildType(JsonDsl_Build)
})
