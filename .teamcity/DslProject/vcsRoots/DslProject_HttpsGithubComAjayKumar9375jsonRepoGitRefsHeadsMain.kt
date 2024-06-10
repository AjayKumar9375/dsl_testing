package DslProject.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object DslProject_HttpsGithubComAjayKumar9375jsonRepoGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/json_repo.git#refs/heads/main"
    url = "https://github.com/AjayKumar9375/json_repo.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
