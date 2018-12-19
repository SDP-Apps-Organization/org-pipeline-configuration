application_image_repository = "aleckeller13"
application_image_repository_credential = "dockerhub-creds"

libraries{
  syntax_unit_testing {
    merge = true
  }
  newman {
    merge = true
  }
}

application_environments{
  override = true
  dev{
     short_name = "comp"
     long_name = "Component"
     appName = "dev"
     ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
  }
  test{
     short_name = "minc"
     long_name = "Minimum-Capacity"
     appName = "test"
     ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
  }
  staging{
     short_name = "prodlike"
     long_name = "Production-Like"
     appName = "staging"
     ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
  }
  prod{
     short_name = "prod"
     long_name = "Production"
     appName = "prod"
     ucp_bundle_directory = "/var/lib/jenkins/prod"
  }
}
