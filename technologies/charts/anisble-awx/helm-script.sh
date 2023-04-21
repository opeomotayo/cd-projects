helm install awx -n awx adwerx/awx -f values-override.yaml

#helm install awx -n awx --create-namespace adwerx/awx --set defaultAdminUser=admin --set defaultAdminPassword=awx --set postgresql.postgresqlPassword=awx --set secretKey=awx
