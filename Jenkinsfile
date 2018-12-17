on_commit to: develop{
  build()
  api_testing(dev)
  //deploy to dev
}
on_commit to: release{
  build()
  api_testing(staging)
  //deploy to staging
}
on_commit to: hotfix{
  build()
  api_testing(hotfix)
  //deploy to hotfix
}

on_pull_request to: develop{
  build()
  api_testing(dev)
  //deploy
}

on_pull_request to: master{
  build()
  api_testing(prod)
}
