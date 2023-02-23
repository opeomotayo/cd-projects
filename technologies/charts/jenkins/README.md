# Steps to create Jenkins with Configurtion as Code

1: Clone the the latest Jenkins helm Chart. <br>
2: Temporarily install Jenkins without any modification for testing using the below commands: <br>
```
helm -n jenkins upgrade --install jenkins jenkins
```
3: Create values-override.yaml next to values.yaml. <br>
4: Create jenkins-casc.yaml in ci folder location. <br>
5: Add additional Jenkins's plugins, and JCasC URL location to folder option. <br>

6: Configure Global Tool Configuration, Configure Global Security, Configure Clouds, Configure System adding Global Pipeline Libraries (shared library) etc from Jenkins's UI. <br>
7: Go to Configuration as Code, click View Configuration and copy the content and add it to jenkins-casc.yaml file. <br>

8: Delete and test Jenkins installation again using the below commands: <br>
```
helm uninstall jenkins -n jenkins
helm template jenkins -f jenkins/values-override.yaml > template-outputs/jenkins.yaml
helm -n jenkins upgrade --install jenkins jenkins -f jenkins/values-override.yaml
helm -n jenkins show values jenkins
helm -n jenkins get values jenkins

```