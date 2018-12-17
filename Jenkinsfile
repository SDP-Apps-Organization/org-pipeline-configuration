on_commit to: develop, {
  //build()
  unit_test()
  //deploy to dev
}
on_commit to: release, {
  build()
  parallel "API Testing": { api_testing_for dev },
           "Unit Testing": { unit_testing() },
           "Syntax Testing": { syntax_testing() }
  //deploy to staging
}
on_commit to: hotfix, {
  build()
  parallel "API Testing": { api_testing_for dev },
           "Unit Testing": { unit_testing() },
           "Syntax Testing": { syntax_testing() }
  //deploy to hotfix
}

on_pull_request to: develop, {
  build()
  parallel "API Testing": { api_testing_for dev },
           "Unit Testing": { unit_testing() },
           "Syntax Testing": { syntax_testing() }
  //deploy to dev
}

on_pull_request to: master, {
  build()
  parallel "API Testing": { api_testing_for dev },
           "Unit Testing": { unit_testing() },
           "Syntax Testing": { syntax_testing() }
}

on_merge to: develop, {

}
