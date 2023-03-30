The SealedSecrets implementation consists of two components:
- A controller that runs in-cluster
- A kubeseal CLI that encrypts a regular Kubernetes Secret object into a SealedSecret that can be stored in a Git repository. 

You can retrieve the public key with:
`kubeseal --fetch-cert \
--controller-name=sealed-secrets \
--controller-namespace=shared-services > mycert.pem`

or with: 
`kubectl get secret --field-selector type=kubernetes.io/tls \
-o=jsonpath="{.items[*].data.tls\.crt}" -n shared-services | base64 -d >> mycert.pem`

The public key can be safely stored in Git, and can be used to encrypt secrets without direct access to the Kubernetes cluster.

Encrypt the secret with kubeseal:
`kubeseal --format=yaml --cert=mycert.pem \
< chillfs-secret.yaml > chillfs-sealed-secret.yaml`

Once the sealed secret resource is applied, the sealed-secrets controller automatically decrypts the sealed secret and converts that to a Kubernetes-based secret ( base 64 ).

https://us05web.zoom.us/j/83716928780?pwd=L1ExdlBsMElOTDg4aTFoN3IwVVRwZz09


 - name: JAVA_OPTS
      value: "-Djavax.net.ssl.trustStore=/usr/local/share/ca-certificates/java/cacerts -Djavax.net.ssl.trustStorePassword=changeit"