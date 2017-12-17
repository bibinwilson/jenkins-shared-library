pipelineJob("pipeline-calls-other-pipeline") {
    logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("""
                @Library("your-library-name") _
                standardPipeline {
                        projectName = "DAAC"
                        serverDomain = "www.daac.io"
                }
            """.stripIndent())
        }
    }
}