package JavaTestingSession01.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.dockerCommand
import jetbrains.buildServer.configs.kotlin.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object JavaTestingSession01_Build : BuildType({
    name = "Build"

    vcs {
        root(JavaTestingSession01.vcsRoots.JavaTestingSession01_HttpsGithubComDavorpaJavaTestingSession01gitRefsHeadsMain)
    }

    steps {
        maven {
            id = "Maven2"
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
        dockerCommand {
            id = "DockerCommand"
            commandType = build {
                source = file {
                    path = "docker"
                }
                commandArgs = "--pull"
            }
        }
    }

    triggers {
        vcs {
        }
    }

    features {
        perfmon {
        }
    }
})
