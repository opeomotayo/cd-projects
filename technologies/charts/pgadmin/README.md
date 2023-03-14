# How I deployed pgadmin

* ### Clone official pgadmin chart
```
git clone https://github.com/rowanruseler/pgadmin4.git
```

* ### Create values-override.yaml to override the default values

* ### Update ingress.yaml file for host/domain name configuration

* ### Run the below commands to test installation
```
helm dependency update
helm template pgadmin -f pgadmin/values-override.yaml > template-outputs/pgadmin.yaml 
helm -n pgadmin upgrade --install pgadmin pgadmin -f pgadmin/values-override.yaml
```

* ### To deploy with Argo CD 
Create pgadmin.yaml file within argocd/apps/ directory

* ### Run the below command to create pgadmin 
```
kubectl apply -f apps/pgadmin.yaml
```

* ### To update pgadmin
Update code and push commit to github, because autosync is enabled, the commited changes should continously deploy to kubernetes cluster

* ### To update pgadmin
I configured GitHub SSO to pgadmin

# References:
https://github.com/SonarSource/helm-chart-pgadmin