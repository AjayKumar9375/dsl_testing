package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComAjayKumar9375jsonRepoGit : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/json_repo.git"
    url = "https://github.com/AjayKumar9375/json_repo.git"
    branch = "refs/heads/main"
})
