package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

// class AntBuildStep {
//     lateinit var mode: Mode
//     var workingDir: String = ""
//     var jdkHome: String = ""
//     var name: String = ""
//     var targets: String = ""

//     sealed class Mode {
//         class AntFile : Mode() {
//             var path: String = ""
//         }
//     }
// }

class PythonBuildStep {
    lateinit var command: Command
    var id: String = ""

    sealed class Command {
        class PythonFile : Command() {
            var filename: String = ""
            var scripArguments: String = ""
        }
    }
}



// fun createPythonStep(): BuildStep {
//     return python {
//      id = "python_runner"
//         command = file {
//             filename = "main.py"
//             scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//         }
//     }
// }

fun customPython(init: PythonBuildStep.() -> kotlin.Unit): PythonBuildStep {
    val file = PythonBuildStep.Command.PythonFile()
    file.filename = "main.py"
    file.scripArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"

    val python = PythonBuildStep()
    python.command = file
    python.id = "python_runner"
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