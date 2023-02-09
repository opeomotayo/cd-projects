// github('opeomotayo/cd-projects') can also be used instead of url('https://github.com/opeomotayo/cd-projects.git')
// multiple pipelinesJobs can also be set here
pipelineJob('actions-controller') {
    logRotator {
        numToKeep(10)
        daysToKeep(30)
    }
    agent {
        kubernetes {
            label "-${UUID.randomUUID()}"
            defaultContainer 'devops-tools'
            yamlFile 'jobs/pod-templates.yaml'
        }
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
            scriptPath('pipelines/team-pluto/actions-controller/Jenkinsfile')
        }  
    }       
}
