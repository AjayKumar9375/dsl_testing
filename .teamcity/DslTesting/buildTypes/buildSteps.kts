import jetbrains.buildServer.configs.kotlin.buildSteps.ScriptBuildStep

class BuildSteps {

    fun ScriptBuildStep {
        name = "Build Step 1"
        scriptContent = """
            echo "Executing Build Step 1"
        """.trimIndent()
    }

}