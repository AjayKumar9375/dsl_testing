package DslTesting.buildT.buildSteps

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python


class PythonBuildStep(id: String, filename: String, scriptArguments: String) : BuildStep() {
    init {
        type = "Python"
        param("id", id)
        param("script.source", filename)
        param("script.args", scriptArguments)
    }
}
