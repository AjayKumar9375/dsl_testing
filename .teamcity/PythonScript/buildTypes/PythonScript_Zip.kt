package PythonScript.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object PythonScript_Zip : BuildType({
    name = "zip"

    artifactRules = "hp.zip"

    params {
        param("destination", "%system.teamcity.build.workingDir%")
        param("output_location", "hp.zip")
        param("directory_location", "java-testing-collections/*")
        param("zip_location", "hp.zip")
    }

    vcs {
        root(PythonScript.vcsRoots.PythonScript_HttpsGithubComDavorpaJavaTestingSession01git)
        root(PythonScript.vcsRoots.PythonScript_HttpsGithubComAjayKumar9375PythonScriptingGit)
    }

    steps {
        script {
            id = "simpleRunner"
            enabled = false
            scriptContent = "unzip %zip_location% -d %destination%"
        }
        python {
            id = "python_runner"
            command = file {
                filename = "zip_artifacts.py"
                scriptArguments = "--directory %directory_location% --output %output_location%"
            }
        }
    }
})
