package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object HttpsGithubComAjayKumar9375jsonRepoGit : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/json_repo.git"
    url = "https://github.com/AjayKumar9375/json_repo.git"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "ajaykumar9375"
        password = "credentialsJSON:3ddfa1d9-e0ed-4e4f-8354-bf389f01e338"
    }
})
