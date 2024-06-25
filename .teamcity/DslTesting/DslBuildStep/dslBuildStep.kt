package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.buildSteps.*
// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({


// })

// fun createpythonStep(scriptArg: String, fileName: String) =python{
//         id = "python_runner"
//         command = file {
//             filename = fileName
//             scriptArguments = scriptArg
//         }
// }




fun createPythonStep(scriptArg: String, fileName: String) = python {
    id = "python_runner"
    script = file(fileName)
    params {
        parameter("scriptArguments", scriptArg)
    }
}