package DslTesting

import DslTesting.buildTypes.*
import DslTesting.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("DslTesting")
    name = "Dsl Testing"

    vcsRoot(DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)
//  val bts = 
 sequential{
    buildType(DslTesting_BuildTypes(
        "Build", 
        "This build is used for importing the json values",
        "json_destination.json", 
        "python_runner", 
        "main.py",  
        "--path_to_source_json_file %source% --path_to_destination_json_file %destination% --location_one %location1% --location_two %location2%"))
    }
    // .buildTypes()

//  bts.forEach{ buildType(it)}
//  bts.last().triggers{
//     vcs{
        
//     }
//  }

    // buildType(package_build)
    // buildType(DslTesting_Build2)
    // buildType(package_build2)

    // sequential {
    //     buildType(DslTesting_Build)
    //     parallel{
    //         buildType(DslTesting_Build2)
    //         buildType(package_build2)
    //     }
    //     buildType(package_build)
    // }
})
