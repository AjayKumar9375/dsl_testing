package JsonDirectory.buildTypes

import JsonDirectory.vcsRoots.JsonDirectory_HttpsGithubComAjayKumar9375JsonStringGitRefsHeadsMain
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object JsonDirectory_Build : BuildType({
    name = "Build"

    artifactRules = "json_destination.json"

    params {
        param("destination", "json_destination.json")
        param("location1", "PlantModel")
        param("location2", "Bsc")
        param("source", "json_source.json")
    }

    vcs {
        root(JsonDirectory.vcsRoots.JsonDirectory_HttpsGithubComAjayKumar9375JsonStringGitRefsHeadsMain)
    }

    steps {
        python {
            id = "python_runner"
            command = file {
                filename = "main.py"
                scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
            }
        }
        script {
            id = "simpleRunner"
            enabled = false
            scriptContent = "unzip"
            formatStderrAsError = true
        }
        maven {
            id = "Maven2"
            jdkHome = "%env.JDK_22_0%"
        }
    }

    triggers {
        vcs {
            triggerRules = "+:root=${JsonDirectory_HttpsGithubComAjayKumar9375JsonStringGitRefsHeadsMain.id}:**json_source.json"

            branchFilter = ""
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
})
