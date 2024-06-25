package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({


// })

fun pythonStep(scriptArg: String, fileName: String) = python{
        // id = "python_runner"
        // param("id", "")
        command = file {
            // filename = fileName
            // scriptArguments = scriptArg
            param("filename", fileName)
            param("scriptArguments", scriptArg)
        }
    }