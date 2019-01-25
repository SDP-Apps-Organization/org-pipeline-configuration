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
  dev{
     short_name = "comp"
     long_name = "Component"
     appName = "dev"
     ucp_bundle_directory = "/opt/jenkins-master/bundle_nonprod"
  }
  test{
     short_name = "minc"
     long_name = "Minimum-Capacity"
     appName = "test"
     ucp_bundle_directory = "/opt/jenkins-master/bundle_nonprod"
  }
  staging{
     short_name = "prodlike"
     long_name = "Production-Like"
     appName = "staging"
     ucp_bundle_directory = "/opt/jenkins-master/bundle_nonprod"
  }
  prod{
     short_name = "prod"
     long_name = "Production"
     appName = "prod"
     ucp_bundle_directory = "/opt/jenkins-master/prod"
  }
}

steps{
  unit_test{
    stage = "Unit Test"
    image = "aleckeller13/unittesting"    //create image that has both node and mvn installed
    command = ""                          //write command that determines which language

  }
}
