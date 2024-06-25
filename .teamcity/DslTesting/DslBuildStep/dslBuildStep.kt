package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.buildSteps.*
// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({


// })

fun createpythonStep(scriptArg: String, fileName: String) = buildSteps {
     step(python{
        // id = "python_runner"
        parameter("id", "Python_runner")
        // command = file {
            // filename = fileName
            // scriptArguments = scriptArg
            parameter("filename", fileName)
            parameter("scriptArguments", scriptArg)
        // }
        })
}