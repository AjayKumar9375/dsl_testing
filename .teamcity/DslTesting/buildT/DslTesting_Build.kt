import DslTesting.buildT.buildTypes.BuildSteps
import DslTesting.buildT.buildSteps.BuildSteps
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText

object DslTesting {
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

