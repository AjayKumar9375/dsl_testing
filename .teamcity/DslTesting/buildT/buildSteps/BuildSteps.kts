package DslTesting.buildT.buildSteps

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.python

class PythonBuildStep(id: String, filename: String, scriptArguments: String) {
    var pythonStep = python {
        this.id = id
        command = file {
            this.filename = filename
            this.scriptArguments = scriptArguments
        }
    }
}
