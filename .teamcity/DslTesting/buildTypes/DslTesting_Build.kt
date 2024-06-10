package DslTesting.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
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

    
    steps {
        python {
            id = "python_runner"
            command = file {
                filename = "main.py"
                scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
            }
        }
    }

    triggers {
        vcs {
        }
    }

    failureConditions {
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Key not found"
            failureMessage = "Key didn't match"
            reverse = false
            stopBuildOnFailure = true
        }
    }
    
    features {
        perfmon {
        }
    }
})
