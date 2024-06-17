package DslTesting

import DslTesting.buildTypes.*
import DslTesting.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.triggers.vcs

import kotlin.collections.listOf
object Project : Project({
    id("DslTesting")
    name = "Dsl Testing"

    vcsRoot(DslTesting_HttpsGithubComAjayKumar9375dslTestingGitRefsHeadsMain)


    //Features List
/**
    val feature1 = buildType(DslTesting_BuildTypes(
            "feature_1",
            "1_This build is used for importing the json values",
            "json_destination.json"))

    val feature2 = buildType(DslTesting_BuildTypes(
            "feature_2",
            "2_This build is used for importing the json values",
            "json_destination.json"))

    val feature3 = buildType(DslTesting_BuildTypes(
            "feature_3",
            "3_This build is used for importing the json values",
            "json_destination.json"))

    val feature4 = buildType(DslTesting_BuildTypes(
            "feature_4",
            "4_This build is used for importing the json values",
            "json_destination.json"))

    val feature5 = buildType(DslTesting_BuildTypes(
            "feature_5",
            "5_This build is used for importing the json values",
            "json_destination.json"))

    val feature6 = buildType(DslTesting_BuildTypes(
            "feature_6",
            "6_This build is used for importing the json values",
            "json_destination.json"))

    val feature7 = buildType(DslTesting_BuildTypes(
            "feature_7",
            "7_This build is used for importing the json values",
            "json_destination.json"))

    val feature8 = buildType(DslTesting_BuildTypes(
            "feature_8",
            "8_This build is used for importing the json values",
            "json_destination.json"))

    val feature9 = buildType(DslTesting_BuildTypes(
            "feature_9",
            "9_This build is used for importing the json values",
            "json_destination.json"))

**/

    val featuresList = listOf (
            "feature_1" to "1_This build is used for importing the json values",
            "feature_2" to "2_This build is used for importing the json values",
            "feature_3" to "3_This build is used for importing the json values",
            "feature_4" to "4_This build is used for importing the json values",
            "feature_5" to "5_This build is used for importing the json values",
            "feature_6" to "6_This build is used for importing the json values",
            "feature_7" to "7_This build is used for importing the json values",
            "feature_8" to "8_This build is used for importing the json values",
            "feature_9" to "9_This build is used for importing the json values"
    )

    for ((name, description) in featuresList) {
        buildType(DslTesting_BuildTypes(
                name,
                description,
                "json_destination.json"
        ))
    }


})
