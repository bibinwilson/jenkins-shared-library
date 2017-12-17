folder('DAAC') {
    description('Folder containing all jobs for DAAC')
}
pipelineJob("DAAC/DAAC-PIPELINE") {
    logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("""
                @Library("java-maven-build") _
                standardPipeline {
                        projectName = "DAAC"
                        serverDomain = "www.daac.io"
                }
            """.stripIndent())
        }
    }
}