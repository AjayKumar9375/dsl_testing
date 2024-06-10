package UsingSingleBuildConfig

import UsingSingleBuildConfig.buildTypes.*
import UsingSingleBuildConfig.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({
    id("UsingSingleBuildConfig")
    name = "Using_single_build_config"

    vcsRoot(UsingSingleBuildConfig_HttpsGithubComAjayKumar9375ciCdDemoGit)

    buildType(UsingSingleBuildConfig_OneForAll)
})
