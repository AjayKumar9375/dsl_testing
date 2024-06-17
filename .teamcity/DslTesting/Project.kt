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

    val bts = listof<String> (
        buildType(DslTesting_BuildTypes(
        "feature_1",
        "1_This build is used for importing the json values",
        "json_destination.json")),

        buildType(DslTesting_BuildTypes(
            "feature_2",
            "2_This build is used for importing the json values",
            "json_destination.json"))
    ).buildTypes()

    bts.forEach{buildType(it)}


//    val featureList = listOf<String>("feature1", "feature2", "feature3", "feature4", "feature5", "feature6", "feature7", "feature8", "feature9")

})
