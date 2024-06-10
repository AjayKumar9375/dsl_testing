package ImportingElements.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object ImportingElements_HttpsGithubComAjayKumar9375JsonStringGit : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/Json_string.git"
    url = "https://github.com/AjayKumar9375/Json_string.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
