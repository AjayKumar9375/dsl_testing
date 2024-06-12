import DslTesting.buildT.buildTypes.BuildTypes
import DslTesting.buildT.buildSteps.BuildSteps
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildFeatures.perfmon
import jetbrains.buildServer.configs.kotlin.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.failureConditions.failOnText
import jetbrains.buildServer.configs.kotlin.triggers.vcs

object DslTestingConfig : BuildType({
    val dslTestingBuild = DslTestingBuild("YourBuildName", "YourArtifactRules")

    val pythonBuildStep = PythonBuildStep("YourId", "YourFileName", "YourScriptArguments")

    val dslTestingBuildType = dslTestingBuild {
        steps {
            pythonBuildStep.pythonStep
        }

    }
})

