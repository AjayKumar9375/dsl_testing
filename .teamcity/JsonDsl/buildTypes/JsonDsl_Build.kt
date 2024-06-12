package JsonDsl.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object JsonDsl_Build : BuildType({
    name = "Build"

    vcs {
        root(JsonDsl.vcsRoots.JsonDsl_HttpsGithubComAjayKumar9375jsonRepoGitRefsHeadsMain)
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
