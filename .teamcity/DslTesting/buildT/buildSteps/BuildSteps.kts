package DslTesting.buildT.buildSteps

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python


fun createPythonBuildStep(id: String, filename: String, scriptArguments: String) = python {
    this.id = id
    command = file {
        this.filename = filename
        this.scriptArguments = scriptArguments
    }
}