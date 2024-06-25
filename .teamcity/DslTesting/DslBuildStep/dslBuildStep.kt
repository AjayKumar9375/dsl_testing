package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({


// })

fun pythonStep(cmd, dir){
    python{
        id = "python_runner"
        command = file {
            filename = dir
            scriptArguments = cmd
        }
    }
}