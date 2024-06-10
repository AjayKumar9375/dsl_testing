package PythonScript_TestingPlateform.buildTypes

import PythonScript.buildTypes.PythonScript_Zip
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.triggers.finishBuildTrigger

object PythonScript_TestingPlateform_Test : BuildType({
    name = "test"

    artifactRules = "+:%destination%=>artifact-demo"

    params {
        param("destination", "unzip_folder")
        param("source", "build/hp.zip")
    }

    steps {
        script {
            id = "simpleRunner"
            scriptContent = "powershell -Command Expand-Archive -Path %source% -DestinationPath %destination%"
        }
    }

    triggers {
        finishBuildTrigger {
            buildType = "${PythonScript_Zip.id}"
            successfulOnly = true
        }
    }

    dependencies {
        artifacts(PythonScript.buildTypes.PythonScript_Zip) {
            buildRule = lastSuccessful()
            artifactRules = "hp.zip => build/"
        }
    }
})
