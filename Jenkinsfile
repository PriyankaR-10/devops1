pipeline {
    agent any
    tools {
         maven 'maven3'
    }
    stages{
        stage('Build'){
            steps{
                  sh script: 'mvn clean package'
            }
        }
        stage('Upload War To Nexus'){
            steps{ 
                nexusArtifactUploader artifacts: 
                    [
                        [
                            artifactId: 'RestaurantProj', 
                            classifier: '', 
                            file: 'target/RestaurantProj-0.0.1-SNAPSHOT.jar', 
                            type: 'jar'
                        ]
                    ], 
                    credentialsId: '4e22854d-38b6-48e9-b65e-9c796ff36cf9', 
                    groupId: 'com.thbs', 
                    nexusUrl: '18.191.179.163:8081', 
                    nexusVersion: 'nexus3', 
                    protocol: 'http', 
                    repository: 'project', 
                    version: '0.0.1-SNAPSHOT'
            }
        }
    }
 }
