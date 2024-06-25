package DslTesting.DslBuildStep

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python
// import jetbrains.buildServer.configs.kotlin.buildSteps.*

// fun createpythonStep() = python{
//         id = "python_runner"
//         command = file {
//             filename = "main.py"
//             scriptArguments = """--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%""".trimIndent()
//         }
// }

def create_python_step():
    return {
        'id': 'python_runner',
        'command': 'python',
        'filename': 'ain.py',
        'criptArguments': [
            '--path_to_source_json_file', '%source%',
            '--path_to_destination_json_file', '%destination%',
            '--location_one', '%location1%',
            '--location_two', '%location2%'
        ]
    }