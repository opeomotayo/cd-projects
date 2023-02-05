$ helm dependency update

 helm -n sonarqube upgrade --install sonarqube sonarqube -f sonarqube/values-override.yaml
