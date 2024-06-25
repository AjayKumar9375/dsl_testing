package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
// import jetbrains.buildServer.configs.kotlin.buildSteps.python


// class DslTesting_BuildStep(
//     id: String, 
//     filename: String, 
//     scriptArguments: String) : BuildStep({
// })


fun createPythonStep(): BuildStep {
    return python {
     id = "python_runner"
        command = file {
            filename = "main.py"
            scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
        }
    }
}

