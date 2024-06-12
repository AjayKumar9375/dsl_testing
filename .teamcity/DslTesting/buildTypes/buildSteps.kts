// BuildSteps.kt
package my.pipeline

import jetbrains.buildServer.configs.kotlin.v2019_2.*

package my.pipeline

import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.ScriptBuildStep

class BuildSteps {

    fun step1() = ScriptBuildStep {
        name = "Build Step 1"
        scriptContent = """
            echo "Executing Build Step 1"
        """.trimIndent()
    }

    fun step2() = ScriptBuildStep {
        name = "Build Step 2"
        scriptContent = """
            echo "Executing Build Step 2"
        """.trimIndent()
    }
    
    fun step3() = ScriptBuildStep {
        name = "Build Step 3"
        scriptContent = """
            echo "Executing Build Step 3"
        """.trimIndent()
    }
    
    fun allSteps() = listOf(step1(), step2(), step3())
}