# How I deployed Portainer

* ### Clone official Portainer chart
```
git clone git clone https://github.com/portainer/k8s.git
```

* ### Create values-override.yaml to override the default values

* ### Update ingress.yaml file for host/domain name configuration

* ### Run the below commands to test installation
```
helm template portainer -f portainer/values-override.yaml > template-outputs/portainer.yaml 
helm -n portainer upgrade --install portainer portainer -f portainer/values-override.yaml
```

* ### To deploy with Argo CD 
Create portainer.yaml file within argocd/apps/ directory

* ### Run the below command to create portainer 
```
kubectl apply -f apps/portainer.yaml
```

* ### To update Portainer
Update code and push commit to github, because autosync is enabled, the commited changes should continously deploy to kubernetes cluster

* ### To update Portainer
I configured GitHub SSO to portainer

# References:
https://github.com/SonarSource/helm-chart-portainer


