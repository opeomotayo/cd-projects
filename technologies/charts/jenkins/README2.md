### Installation Instructions

This Jenkins application was installed via argocd, the Jenkins helm chart is stored in technologies/charts/jenkins, the directory also contains addition yaml files for Jenkins values, ingress and https certificates. Jenkins app deployment file is in argocd/apps/jenkins.yaml file.

### Method to deploy Jenkins
Apply the yaml file directly on the cluster or
Push the change up to github and navigate to argocd to sync the change

### References:
jenkins helm chart
https://github.com/jenkinsci/helm-charts/blob/main/charts/jenkins/README.md
configuration as code (jcasc)
https://plugins.jenkins.io/configuration-as-code/
job-dsl (seed job)
https://plugins.jenkins.io/job-dsl/
pipeline as code (Jenkinsfile)
https://www.jenkins.io/doc/book/pipeline/
https://www.jenkins.io/doc/book/pipeline/jenkinsfile/
kubernetes agent
https://devopscube.com/jenkins-build-agents-kubernetes/
https://plugins.jenkins.io/kubernetes/
shared library
https://www.jenkins.io/doc/book/pipeline/shared-libraries/
