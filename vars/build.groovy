//void dockerBuildImage(String app_name, String tag, String args) {
//	sh("docker build --build-arg -t ${app_name}:${tag} .")
//}
//
//
void dockerPushImage(String registry, String username, String passwd, String app_name, String tag) {
  sh("echo ${passwd} | docker login -u ${username} --password-stdin")
  sh("docker push ${registry}/${app_name}:${tag}")
}

void dockerCleanImage(String registry, String app_name, String tag) {
  sh("docker rmi ${registry}/${app_name}:${tag}")
}
