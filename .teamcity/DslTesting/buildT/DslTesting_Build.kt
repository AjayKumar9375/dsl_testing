import DslTesting.buildT.buildTypes.BuildTypes
import DslTesting.buildT.buildSteps.BuildSteps
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.buildSteps.python
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object DslTestingConfig {
    val dslTestingBuild = DslTestingBuild("YourBuildName", "YourArtifactRules")

    val pythonBuildStep = PythonBuildStep("YourId", "YourFileName", "YourScriptArguments")

    val dslTestingBuildType = dslTestingBuild {
        steps {
            pythonBuildStep.pythonStep
        }
        failureConditions {
            failOnText {
                conditionType = BuildFailureOnText.ConditionType.CONTAINS
                pattern = "Key not found"
                failureMessage = "Key didn't match"
                reverse = false
                stopBuildOnFailure = true
            }
        }
    }
}

