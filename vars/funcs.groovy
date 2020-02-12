String getImageNameWithTag(String REGISTRY, String APP_NAME) {
  return "${REGISTRY}/${APP_NAME}:${getDateCommit()}"
}

String getDateCommit() {
  return getReturnedValue("git log -n 1 --pretty=format:%cd --date=format:%Y%m%d%H%M")
}

String getReturnedValue(String timestamp) {
  sh([script: timestamp, returnStdout: true]).trim()
}
