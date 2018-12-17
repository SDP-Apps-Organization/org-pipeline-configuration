on_commit to: develop, {
  build()
  api_testing_for dev
  //deploy to dev
}
on_commit to: release, {
  build()
  api_testing_for staging
  //deploy to staging
}
on_commit to: hotfix, {
  build()
  api_testing_for hotfix
  //deploy to hotfix
}

on_pull_request to: develop, {
  build()
  api_testing_for dev
  //deploy to dev
}

on_pull_request to: master, {
  build()
  api_testing_for prod
}
