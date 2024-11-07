pipeline {
    environment {
        registry = "campanulia/java-app"
        registryCredentials = "DOCKER_LOGIN"
        dockerImage = ""
    }
    agent any
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image with the correct registry name
                    dockerImage = docker.build("${registry}:${env.BUILD_NUMBER}", '-f src/main/java/org/lbg/salesapp/Dockerfile .')
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    docker.withRegistry('', registryCredentials) {
                        // Push the image with both the build number and latest tags
                        dockerImage.push("${env.BUILD_NUMBER}")
                        dockerImage.push("latest")
                    }
                }
            }
        }

        stage('Clean up') {
            steps {
                script {
                    sh 'docker image prune --all --force --filter "until=48h"'
                }
            }
        }
    }
}
