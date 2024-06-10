package CiCdDemo.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object CiCdDemo_CiCdDemo1_2 : BuildType({
    name = "ci-cd_demo"

    params {
        param("repository", "ci-cd_demo")
    }

    vcs {
        root(CiCdDemo.vcsRoots.CiCdDemo_HttpsGithubComAjayKumar9375ciCdDemoGit)
    }
})
