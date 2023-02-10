// github('opeomotayo/cd-projects') can also be used instead of url('https://github.com/opeomotayo/cd-projects.git')
// multiple pipelinesJobs can also be set here
pipelineJob('actions-controller1') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cpsScm {
        scm {
            git {
            remote {
                github('opeomotayo/cd-projects')
            }
            branches('main')
            }
        }   
        scriptPath('dsl/pipelines/actions-controller/Jenkinsfile')
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
            script(readFileFromWorkspace('pipelines/actions-controller/Jenkinsfile'))
            sandbox()     
        }
    }      
}
pipelineJob('actions-controller3') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/actions-controller/Jenkinsfile'))
            sandbox()     
        }
    }       
}
pipelineJob('actions-controller4') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    definition {
        cps {
            script(readFileFromWorkspace('pipelines/actions-controller/Jenkinsfile'))
            sandbox()     
        }
    }      
}
