package DslTesting.buildT.buildSteps

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.triggers.vcs

class PythonBuildStep(id: String, filename: String, scriptArguments: String) {
    val pythonStep = python {
        this.id = id
        command = file {
            this.filename = filename
            this.scriptArguments = scriptArguments
        }
    }
}
