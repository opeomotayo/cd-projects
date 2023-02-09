// github('opeomotayo/cd-projects') can also be used instead of url('https://github.com/opeomotayo/cd-projects.git')
// multiple pipelinesJobs can also be set here
pipelineJob('actions-runner-controller') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cpsScm {
            scm {
                git {
                remote {
                    url('https://github.com/opeomotayo/cd-projects.git') 
                }
                branches('main')
                }
            }   
            scriptPath('pipelines/actions-runner-controller/Jenkinsfile')
        }  
    }       
}

