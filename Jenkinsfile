// Kalyani, Miloni, Kashish
// This is a Jenkins file, This file includes scripts for image building and uploading to docker hub and then deploying on rancher
pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('docker-pswd')
    }
    stages {
        stage('Timestamp') {
            steps {
                script {
                    // Defining a build timestamp variable
                    env.BUILD_TIMESTAMP = new Date().format("yyyyMMddHHmmss", TimeZone.getTimeZone('UTC'))
                    echo "Build timestamp: ${env.BUILD_TIMESTAMP}"
                }
            }
        }


        stage('Build docker image') {
            steps {
                script {
                    
                    // Securely handling Docker login
                    withCredentials([usernamePassword(credentialsId: 'docker-pswd', 
                                                      usernameVariable: 'DOCKER_USER', 
                                                      passwordVariable: 'DOCKER_PASS')]) {
                        sh """
                            echo "\$DOCKER_PASS" | docker login -u "\$DOCKER_USER" --password-stdin
                        """
                    }

                    def imageName = "mshah32/studentsurvey-microservices:${env.BUILD_TIMESTAMP}"
                    sh "docker build -t ${imageName} -f Dockerfile ."


                    env.IMAGE_NAME = imageName
                }
            }
        }
        

        stage('Push Image') {
            steps {
                script {
                    sh "docker push ${env.IMAGE_NAME}"
                }
            }
        }

        stage('Deployment') {
            steps {
                script {
                    sh "kubectl set image deployment/kshah33-deployment1 container-0=${env.IMAGE_NAME}"
                }
            }
        }
    }
}
