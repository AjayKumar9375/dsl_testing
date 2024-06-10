package ImportingElements.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object ImportingElements_SearchValue : BuildType({
    name = "search_value"

    params {
        param("destination", "json_destination.json")
        param("location1", "PAnimalModel")
        param("location2", "Bsc")
        param("source", "Json_source.json")
    }

    vcs {
        root(ImportingElements.vcsRoots.ImportingElements_HttpsGithubComAjayKumar9375JsonStringGit)
    }

    steps {
        python {
            id = "python_runner"
            enabled = false
            command = file {
                filename = "main.py"
                scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
            }
        }
    }

    triggers {
        vcs {
            enabled = false
            branchFilter = ""
        }
    }
})
