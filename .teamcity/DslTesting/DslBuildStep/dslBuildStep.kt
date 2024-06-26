package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
// import jetbrains.buildServer.configs.kotlin.buildSteps.PythonBuildStep



// class PythonBuildStep {
//     lateinit var command: Command
//     var id: String = ""

//     sealed class Command {
//         class PythonFile : Command() {
//             var filename: String = ""
//             // var scripArguments: String = ""
//         }
//     }
// }


fun customPython(init: PythonBuildStep.() -> kotlin.Unit): PythonBuildStep {
    var file = PythonBuildStep.Command.PythonFile()
    file.filename = "main.py"
    // file.scripArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"

    val python = PythonBuildStep()
    python.command = file
    return python
}


// fun customAnt(init: AntBuildStep.() -> kotlin.Unit): AntBuildStep {
//     val ant_file = AntBuildStep.Mode.AntFile()
//     ant_file.path = "/some/path"

//     val ant = AntBuildStep()
//     ant.mode = ant_file
//     ant.workingDir = "/some/dir"
//     ant.jdkHome = "some_jdk"
//     return ant
// }