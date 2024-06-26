// package patches.buildTypes

// import jetbrains.buildServer.configs.kotlin.*
// import jetbrains.buildServer.configs.kotlin.buildSteps.PythonBuildStep
// import jetbrains.buildServer.configs.kotlin.buildSteps.python
// import jetbrains.buildServer.configs.kotlin.ui.*

// /*
// This patch script was generated by TeamCity on settings change in UI.
// To apply the patch, change the buildType with id = 'feature_3'
// accordingly, and delete the patch script.
// */
// changeBuildType(RelativeId("feature_3")) {
//     expectSteps {
//         python {
//             id = "python_runner"
//             command = file {
//                 filename = "main.py"
//                 scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//             }
//         }
//     }
//     steps {
//         update<PythonBuildStep>(0) {
//             enabled = false
//             clearConditions()
//         }
//         insert(1) {
//             step {
//                 id = "DslTesting_Feature1"
//                 type = "DslTesting_Feature1"
//                 executionMode = BuildStep.ExecutionMode.DEFAULT
//                 param("Organization", "KPIT")
//                 param("destination", "json_destination.json")
//                 param("location1", "PlantModel")
//                 param("location2", "Bsc")
//                 param("teamcity.step.phase", "")
//                 param("source", "json_source.json")
//             }
//         }
//     }
// }
