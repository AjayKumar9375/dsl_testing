package CiCdDemo.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object CiCdDemo_CiCdDemo1 : BuildType({
    name = "ci-cd_demo1"

    params {
        param("repository", "ci-cd_demo1")
    }

    vcs {
        root(CiCdDemo.vcsRoots.CiCdDemo_HttpsGithubComAjayKumar9375ciCdDemoGit)
    }
})
