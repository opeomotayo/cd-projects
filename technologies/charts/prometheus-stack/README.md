# How I deployed Prometheus Stack

* ### Clone official Prometheus Stack chart
```
git clone git clone https://github.com/prometheus-community/helm-charts.git
```

* ### Create values-override.yaml to override the default values

* ### Update ingress.yaml file for host/domain name configuration

* ### Run the below commands to test installation
```
kubectl create ns prometheus-stack
helm template prometheus-stack -f prometheus-stack/values-override.yaml > template-outputs/prometheus-stack.yaml 
helm -n prometheus-stack upgrade --install prometheus-stack prometheus-stack -f prometheus-stack/values-override.yaml
```

* ### To deploy with Argo CD 
Create prometheus-stack.yaml file within argocd/apps/ directory

* ### Run the below command to create prometheus-stack 
```
kubectl apply -f apps/prometheus-stack.yaml
```

* ### To update prometheus-stack
Update code and push commit to github, because autosync is enabled, the commited changes should continously deploy to kubernetes cluster

* ### To update prometheus-stack
I configured GitHub SSO to prometheus-stack

# References:
https://github.com/SonarSource/helm-chart-prometheus-stack
