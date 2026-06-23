def call(String imageName, String userVariable, String imageTag) {
    sh """
        docker build -t ${userVariable}/${imageName}:${imageTag} .
    """
}
