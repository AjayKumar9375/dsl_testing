package UsingSingleBuildConfig.buildTypes

import jetbrains.buildServer.configs.kotlin.*

object UsingSingleBuildConfig_OneForAll : BuildType({
    name = "one_for_all"

    params {
        text("repository", "", label = "Repository name", display = ParameterDisplay.PROMPT, allowEmpty = false)
        text("solution", "", label = "Project solution file name", display = ParameterDisplay.PROMPT, allowEmpty = false)
        text("project_file_name", "", label = "Project file name", display = ParameterDisplay.PROMPT, allowEmpty = false)
    }

    vcs {
        root(UsingSingleBuildConfig.vcsRoots.UsingSingleBuildConfig_HttpsGithubComAjayKumar9375ciCdDemoGit)
    }
})
