locals {
  region               = "eu-west2"
  org_id               = "989785785157"
  billing_account      = "01F7F7-EEDB76-A58E66"
  host_project_name    = "host-staging"
  service_project_name = "k8s-staging"
  host_project_id      = "${local.host_project_name}-${random_integer.int.result}"
  service_project_id   = "${local.service_project_name}-${random_integer.int.result}"
  projects_api         = "container.googleapis.com"
  secondary_ip_ranges = {
    "pod-ip-range"      = "10.0.0.0/14",
    "services-ip-range" = "10.4.0.0/19"
  }
}