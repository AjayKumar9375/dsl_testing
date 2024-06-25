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
     python{
        // id = "python_runner"
        param("id", "Python_runner")
        // command = file {
            // filename = fileName
            // scriptArguments = scriptArg
            param("filename", fileName)
            param("scriptArguments", scriptArg)
        // }
        }
}