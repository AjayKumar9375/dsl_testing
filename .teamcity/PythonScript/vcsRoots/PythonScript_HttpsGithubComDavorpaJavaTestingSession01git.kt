package PythonScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object PythonScript_HttpsGithubComDavorpaJavaTestingSession01git : GitVcsRoot({
    name = "https://github.com/davorpa/java-testing-session-01.git"
    url = "https://github.com/davorpa/java-testing-session-01.git"
    branch = "refs/heads/main"
})
