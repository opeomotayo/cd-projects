provider "google" {
  credentials = file("~/encoded-secrets/terraform-sa.json")
  project     = "terraform-provisioner"
  region      = "eu-west-2"
}
