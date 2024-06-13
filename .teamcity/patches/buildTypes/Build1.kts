package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Build1'
accordingly, and delete the patch script.
*/

// changeBuildType(RelativeId("Build1")) {
//     check(name == "Build1") {
//         "Unexpected name: '$name'"
//     }
//     name = "Build11"

//     triggers {
//         add {
//             vcs {
//             }
//         }
//     }
// }
changeBuildType(RelativeId("Build1")) {
    triggers {
        add {
            vcs {
            }
        }
    }
}
