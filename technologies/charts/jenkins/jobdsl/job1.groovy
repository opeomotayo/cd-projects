pipelineJob('example1') {
    definition {
        cps {
            script(readFileFromWorkspace('project-a-workflow.groovy'))
        }
    }
}
