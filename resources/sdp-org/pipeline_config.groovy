application_image_repository = "aleckeller13"
application_image_repository_credential = "dockerhub-creds"

libraries{
  github_enterprise
  docker
  newman {
    merge = true
  }
}

keywords{
  master  =  /^[Mm]aster$/
  develop =  /^[Dd]evelop(ment|er|)$/
  hotfix  =  /^[Hh]ot[Ff]ix-/
  release =  /^[Rr]elease-(\d+.)*\d$/
}

application_environments{
     dev{
         short_name = "comp"
         long_name = "Component"
         appName = "dev"
         ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
         askApproval = true
     }
     test{
         short_name = "minc"
         long_name = "Minimum-Capacity"
         appName = "test"
         ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
         askApproval = true
     }
     staging{
         short_name = "prodlike"
         long_name = "Production-Like"
         appName = "staging"
         ucp_bundle_directory = "/var/lib/jenkins/bundle_nonprod"
         askApproval = true
     }
     prod{
       short_name = "prod"
       long_name = "Production"
       appName = "prod"
       ucp_bundle_directory = "/var/lib/jenkins/prod"
       askApproval = true
     }
}

// stages{
//   continuous_integration{
//
//   }
// }
steps{
  org_default_step_implementation
}
