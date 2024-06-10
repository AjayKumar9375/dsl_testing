package JavaTestingSession01.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object JavaTestingSession01_HttpsGithubComDavorpaJavaTestingSession01gitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/davorpa/java-testing-session-01.git#refs/heads/main"
    url = "https://github.com/davorpa/java-testing-session-01.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
})
