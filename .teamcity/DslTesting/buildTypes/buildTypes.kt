package DslTesting.buildTypes

// import buildSteps
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.triggers.vcs


class MyBuildConfiguration : BuildType({
    name = "My Build Configuration"
    
    vcs {
        root(DslContext.settingsRoot)
    }
    
    val buildSteps = BuildSteps()
    
    steps {
        buildSteps.step1 
    }
    
    triggers {
        vcs {
            // VCS trigger configuration
        }
    }
    
    features {
        // Define any additional features like notifications, etc.
    }
})
























// object DslTesting_Build : BuildType({
//     name = "Build"

//     artifactRules = "json_destination.json"

//     params {
//         param("destination", "json_destination.json")
//         param("location1", "PlantModel")
//         param("location2", "Bsc")
//         param("Organization", "KPIT")
//         param("source", "json_source.json")
//     }

//     vcs {
//         root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
//     }

//     steps {
//         myBuildSteps()
//     }

//     triggers {
//         vcs {
//             // branchFilter = ".*"
//         }
//     }


//     failureConditions {
//         failOnText {
//             conditionType = BuildFailureOnText.ConditionType.CONTAINS
//             pattern = "Key not found"
//             failureMessage = "Key didn't match"
//             reverse = false
//             stopBuildOnFailure = true
//         }
//     }

//     features {
//         perfmon {
//         }
//     }
// })


// object package_build : BuildType({
//     name = "package"

//     artifactRules = "json_destination.json"

//     params {
//         param("destination", "json_destination.json")
//         param("location1", "PlantModel")
//         param("location2", "Bsc")
//         param("Organization", "KPIT")
//         param("source", "json_source.json")
//     }

//     vcs {
//         root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
//     }

//     steps {
//         python {
//             id = "python_runner"
//             command = file {
//                 filename = "main.py"
//                 scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//             }
//         }
//     }

//     triggers {
//         vcs {
//             // branchFilter = ".*"
//         }
//     }

//     // dependencies{
//     //     snapshot(DslTesting_Build){}
//     // }

//     failureConditions {
//         failOnText {
//             conditionType = BuildFailureOnText.ConditionType.CONTAINS
//             pattern = "Key not found"
//             failureMessage = "Key didn't match"
//             reverse = false
//             stopBuildOnFailure = true
//         }
//     }

//     features {
//         perfmon {
//         }
//     }
// })



// object DslTesting_Build2 : BuildType({
//     name = "Build2"

//     artifactRules = "json_destination.json"

//     params {
//         param("destination", "json_destination.json")
//         param("location1", "PlantModel")
//         param("location2", "Bsc")
//         param("Organization", "KPIT")
//         param("source", "json_source.json")
//     }

//     vcs {
//         root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
//     }

//     steps {
//         python {
//             id = "python_runner"
//             command = file {
//                 filename = "main.py"
//                 scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//             }
//         }
//     }

//     triggers {
//         vcs {
//             // branchFilter = ".*"
//         }
//     }


//     failureConditions {
//         failOnText {
//             conditionType = BuildFailureOnText.ConditionType.CONTAINS
//             pattern = "Key not found"
//             failureMessage = "Key didn't match"
//             reverse = false
//             stopBuildOnFailure = true
//         }
//     }

//     features {
//         perfmon {
//         }
//     }
// })


// object package_build2 : BuildType({
//     name = "package2"

//     artifactRules = "json_destination.json"

//     params {
//         param("destination", "json_destination.json")
//         param("location1", "PlantModel")
//         param("location2", "Bsc")
//         param("Organization", "KPIT")
//         param("source", "json_source.json")
//     }

//     vcs {
//         root(DslTesting.vcsRoots.DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
//     }

//     steps {
//         python {
//             id = "python_runner"
//             command = file {
//                 filename = "main.py"
//                 scriptArguments = "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"
//             }
//         }
//     }

//     triggers {
//         vcs {
//             // branchFilter = ".*"
//         }
//     }

//     // dependencies{
//     //     snapshot(DslTesting_Build){}
//     // }

//     failureConditions {
//         failOnText {
//             conditionType = BuildFailureOnText.ConditionType.CONTAINS
//             pattern = "Key not found"
//             failureMessage = "Key didn't match"
//             reverse = false
//             stopBuildOnFailure = true
//         }
//     }

//     features {
//         perfmon {
//         }
//     }
// })
