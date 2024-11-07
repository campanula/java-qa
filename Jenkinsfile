pipeline{
 environment {
 registry = "campanulia/java-app"
        registryCredentials = "DOCKER_LOGIN"
        dockerImage = ""
    }
    agent any
        stages {
            stage ('Build Docker Image'){
                steps{
                    script {
                        dockerImage = docker.build('image', '-f src/main/java/org/lbg/salesapp/Dockerfile .')
                    }
                }
            }

            stage ("Push to Docker Hub"){
                steps {
                    script {
                        docker.withRegistry('', registryCredentials) {
                            dockerImage.push("${env.BUILD_NUMBER}")
                            dockerImage.push("latest")
                        }
                    }
                }
            }

            stage ("Clean up"){
                steps {
                    script {
                        sh 'docker image prune --all --force --filter "until=48h"'
                           }
                }
            }
        }
}