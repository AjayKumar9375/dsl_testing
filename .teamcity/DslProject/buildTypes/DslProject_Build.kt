package DslProject.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object DslProject_Build : BuildType({
    name = "Build"

    vcs {
        root(DslProject.vcsRoots.DslProject_HttpsGithubComAjayKumar9375jsonRepoGitRefsHeadsMain)
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})
