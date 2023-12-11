def call() {
    sh 'trivy image aksgajjar/youtube:latest > trivyimage.txt'
}
