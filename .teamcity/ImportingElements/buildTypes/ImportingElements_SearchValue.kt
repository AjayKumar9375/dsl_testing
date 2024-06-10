package ImportingElements.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object ImportingElements_SearchValue : BuildType({
    name = "search_value"

    params {
        param("destination", "json_destination.json")
        param("location1", "PAnimalModel")
        param("location2", "")
        param("source", "Json_source.json")
    }

    vcs {
        root(ImportingElements.vcsRoots.ImportingElements_HttpsGithubComAjayKumar9375JsonStringGit)
    }

    steps {
        python {
            id = "python_runner"
            command = file {
                filename = "search3.py"
                scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_to_be_searched %value_input%"
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
