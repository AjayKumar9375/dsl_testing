package JsonDirectory

import JsonDirectory.buildTypes.*
import JsonDirectory.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("JsonDirectory")
    name = "Json_directory"

    vcsRoot(JsonDirectory_HttpsGithubComAjayKumar9375JsonStringGitRefsHeadsMain)
    vcsRoot(JsonDirectory_HttpsGithubComAjayKumar9375JsonStringGit)

    buildType(JsonDirectory_Build)
})
