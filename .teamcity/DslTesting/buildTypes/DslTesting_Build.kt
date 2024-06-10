package DslTesting.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object DslTesting_Build : BuildType({
    name = "Build"
    params {
        param("destination", "json_destination.json")
        param("location2", "Bsc")
        param("source", "json_source.json")
        param("location1", "PlantModel")
        param("Organization", "KPIT")
    }

    vcs {
        root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
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
