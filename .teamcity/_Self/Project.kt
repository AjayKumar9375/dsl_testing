package _Self

import _Self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.projectFeatures.buildReportTab

object Project : Project({
    description = "Contains all other projects"

    vcsRoot(HttpsGithubComAjayKumar9375jsonRepoGit)

    features {
        buildReportTab {
            id = "PROJECT_EXT_1"
            title = "Code Coverage"
            startPage = "coverage.zip!index.html"
        }
    }

    cleanup {
        baseRule {
            preventDependencyCleanup = false
        }
    }

    subProject(JavaTestingSession01.Project)
    subProject(JsonDirectory.Project)
    subProject(ImportingElements.Project)
    subProject(CiCdDemo.Project)
    subProject(DslProject.Project)
    subProject(JsonDsl.Project)
    subProject(PythonScript.Project)
    subProject(UsingSingleBuildConfig.Project)
    subProject(DslTesting.Project)
})
