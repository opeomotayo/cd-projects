### Installation Instructions

This Jenkins application was installed via argocd, the Jenkins helm chart is stored in technologies/charts/jenkins, the directory also contains addition yaml files for Jenkins values, ingress and https certificates. Jenkins app deployment file is in argocd/apps/jenkins.yaml file.

### Method to deploy Jenkins
Apply the yaml file directly on the cluster or
Push the change up to github and navigate to argocd to sync the change
