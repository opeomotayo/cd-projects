# How I deployed Nexus

* ### Clone official Nexus chart
```
git clone https://github.com/sonatype/helm3-charts.git
```

* ### Create values-override.yaml to override the default values

* ### Update ingress.yaml file for host/domain name configuration

* ### Run the below commands to test installation
``` 
helm template nexus -f nexus/values-override.yaml > template-outputs/nexus.yaml 
helm -n nexus upgrade --install nexus nexus -f nexus/values-override.yaml
```

* ### To deploy with Argo CD 
Create nexus.yaml file within argocd/apps/ directory

* ### Run the below command to create nexus 
```
kubectl apply -f apps/nexus.yaml
```

* ### To update Nexus
Update code and push commit to github, because autosync is enabled, the commited changes should continously deploy to kubernetes cluster

* ### To update Nexus
I configured GitHub SSO to Nexus

# References:
https://github.com/sonatype/helm3-charts.git