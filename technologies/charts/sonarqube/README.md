# How I installed SonarQube

* ### Clone official SonarQube chart
```
git clone https://github.com/SonarSource/helm-chart-sonarqube.git 
```

* ### Create values-override.yaml to override the default values

* ### Update ingress.yaml file

* ### Run the below commands to test installation
``` 
helm dependency update
helm -n sonarqube upgrade --install sonarqube sonarqube -f sonarqube/values-override.yaml
```

* ### To deploy with Argo CD 
Create sonarqube.yaml file within argocd/apps/ directory

* ### Run the below command to create sonarqube 
```
kubectl apply -f apps/sonarqube.yaml
```

* ### To update SonarQube
Update code and push commit to github, because autosync is enabled, the commited changes should continously deploy to kubernetes cluster

# References:
https://github.com/SonarSource/helm-chart-sonarqube