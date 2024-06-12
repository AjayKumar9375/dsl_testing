package DslTesting.buildT.buildSteps

import jetbrains.buildServer.configs.kotlin.buildSteps.python

class BuildStep(id: String, filename: String, scriptArguments: String) {
    val pythonStep = python {
        this.id = id
        command = file {
            this.filename = filename
            this.scriptArguments = scriptArguments
        }
    }
}
