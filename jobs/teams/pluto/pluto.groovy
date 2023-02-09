// github('opeomotayo/cd-projects') can also be used instead of url('https://github.com/opeomotayo/cd-projects.git')
// multiple pipelinesJobs can also be set here
pipelineJob('actions-controller') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipeplines/actions-controller/Jenkinsfile'))
            sandbox()     
        }
    }       
}
pipelineJob('actions-controller2') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipeplines/actions-controller/Jenkinsfile'))
            sandbox()     
        }
    }      
}

