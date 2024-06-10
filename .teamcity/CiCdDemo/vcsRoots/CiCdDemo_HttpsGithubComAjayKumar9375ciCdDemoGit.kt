package CiCdDemo.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object CiCdDemo_HttpsGithubComAjayKumar9375ciCdDemoGit : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/%repository%.git"
    url = "https://github.com/AjayKumar9375/ci-cd_demo.git"
    branch = "refs/heads/main"
})
