package DslTesting

import DslTesting.buildTypes.*
import DslTesting.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("DslTesting")
    name = "Dsl Testing"

    vcsRoot(DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)


    buildType(MyBuildConfiguration())

    // buildType(DslTesting_Build)
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
