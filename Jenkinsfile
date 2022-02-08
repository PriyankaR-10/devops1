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
                  credentialsId: '59b4ac10-1df6-4993-81d3-c4e96b7bddf2', 
                  groupId: 'com.thbs', 
                  nexusUrl: '18.218.174.48:8081', 
                  nexusVersion: 'nexus3', 
                  protocol: 'http', 
                  repository: 'maven-snapshots', 
                  version: '0.0.1-SNAPSHOT'
            }
        }
    }
 }
