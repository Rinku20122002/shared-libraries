def call(String image, String imageTag) {

    withCredentials([
        usernamePassword(
            credentialsId: 'DHcredential',
            usernameVariable: 'username',
            passwordVariable: 'password'
        )
    ]) {

        sh """
            docker login -u ${username} -p ${password}
            docker image tag ${image}:${imageTag} ${username}/${image}:${imageTag}
            docker push ${username}/${image}:${imageTag}
        """
    }
}
