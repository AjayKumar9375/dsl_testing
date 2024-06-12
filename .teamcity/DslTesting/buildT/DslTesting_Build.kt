import DslTesting.buildT.buildTypes.BuildTypes
import DslTesting.buildT.buildSteps.BuildSteps
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText

object DslTestingConfig {
    val dslTestingBuild = DslTestingBuild("YourBuildName", "YourArtifactRules")

    val pythonBuildStep = PythonBuildStep1("YourId", "YourFileName", "YourScriptArguments")

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

