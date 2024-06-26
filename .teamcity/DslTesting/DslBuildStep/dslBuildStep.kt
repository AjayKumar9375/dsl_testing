package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python


// fun createPythonStep(): BuildStep {
//     return python {
//      id = "python_runner"
//         command = file {
//             filename = "main.py"
//             scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//         }
//     }
// }

// fun customPython(init: PythonBuildStep.() -> kotlin.Unit): PythonBuildStep {
//     val command = PythonBuildStep.Mode.PythonFile()
//     command.file = "main.py"

//     val python = PythonBuildStep()
//     python.mode = ant_file
//     ant.workingDir = "/some/dir"
//     ant.jdkHome = "some_jdk"
//     return ant
// }


fun customAnt(init: AntBuildStep.() -> kotlin.Unit): AntBuildStep {
    val ant_file = AntBuildStep.Mode.AntFile()
    ant_file.path = "/some/path"

    val ant = AntBuildStep()
    ant.mode = ant_file
    ant.workingDir = "/some/dir"
    ant.jdkHome = "some_jdk"
    return ant
}