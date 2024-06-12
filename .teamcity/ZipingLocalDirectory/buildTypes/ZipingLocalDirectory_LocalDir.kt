package ZipingLocalDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object ZipingLocalDirectory_LocalDir : BuildType({
    name = "local_dir"

    steps {
        script {
            id = "simpleRunner"
            scriptContent = """zip -r archive_name.zip D:\Class_7\Our_Environment\*"""
        }
    }
})
