package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({


// })

fun pythonStep(scriptArguments: String, filename: String) = python{
        id = "python_runner"
        command = file {
            this.filename = filename
            this.scriptArguments = scriptArguments
        }
    }