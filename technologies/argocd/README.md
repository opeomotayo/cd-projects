# Installation Instruction:

### create argocd
```
kubectl create namespace argocd
kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml
kubectl apply -n argocd -f argocd-ingress.yaml
kubectl port-forward svc/argocd-server -n argocd 8080:443 --address 167.235.236.197
```

### login to argocd ui
url is argocd.opeomotayo.net
username is admin
get password
```
kubectl -n argocd get secret argocd-initial-admin-secret -o jsonpath="{.data.password}" | base64 -d; echo
```

### install argocd cli
```
sudo curl -sSL -o /usr/local/bin/argocd https://github.com/argoproj/argo-cd/releases/latest/download/argocd-linux-amd64\n
sudo chmod +x /usr/local/bin/argocd
argocd version --grpc-web
```

### login to argocd cli
```
argocd login argocd.opeomotayo.net:443 --grpc-web
```

### test commands
```
argocd app create guestbook --repo https://github.com/argoproj/argocd-example-apps.git --path helm-guestbook --dest-server https://kubernetes.default.svc --dest-namespace apps --sync-option CreateNamespace=true --grpc-web
argocd app get guestbook --grpc-web
argocd app sync guestbook --grpc-web
argocd cluster list
k get app -n argocd
argocd app create nginx-ingress --repo https://charts.helm.sh/stable --helm-chart nginx-ingress --revision 1.24.3 --dest-namespace default --dest-server https://kubernetes.default.svc --self-heal
argocd app list --grpc-web
argocd app delete guestbook
k get appproject -n argocd
```

### references
```
https://www.stackovercloud.com/2022/01/22/how-to-deploy-to-kubernetes-using-argo-cd-and-gitops/
https://argo-cd.readthedocs.io/en/stable/operator-manual/ingress/#option-2-multiple-ingress-objects-and-hosts
https://cloudyuga.guru/blog/jenkins-argo
```
