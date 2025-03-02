pipeline {
    agent any

    tools {
        
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/iuru2522/maven-test-build.git'

                
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

               
            }

            post {
              
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}