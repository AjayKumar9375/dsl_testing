package DslTesting.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/AjayKumar9375/dsl_testing.git#refs/heads/main"
    url = "https://github.com/AjayKumar9375/dsl_testing.git"
    branch = "refs/heads/main"
    branchSpec = "refs/heads/*"
    authMethod = password {
        userName = "ajaykumar9375"
        password = "credentialsJSON:3ddfa1d9-e0ed-4e4f-8354-bf389f01e338"
    }
})
