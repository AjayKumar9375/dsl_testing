package ImportingElements

import ImportingElements.buildTypes.*
import ImportingElements.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("ImportingElements")
    name = "Importing_elements"

    vcsRoot(ImportingElements_HttpsGithubComAjayKumar9375JsonStringGit)

    buildType(ImportingElements_SearchValue)
})
