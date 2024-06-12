package DslTesting.buildT.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.triggers.vcs

class DslTestingBuild(name: String, artifactRules: String) : BuildType({
    this.name = name
    this.artifactRules = artifactRules

    params {
        param("destination", "json_destination.json")
        param("location1", "PlantModel")
        param("location2", "Bsc")
        param("Organization", "KPIT")
        param("source", "json_source.json")
    }

    vcs {
        root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
    }
})
