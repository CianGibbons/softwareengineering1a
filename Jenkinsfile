pipeline {
    agent any
    
    stages {
        stage('Checkout Codebase') {
            steps {
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[credentialsId: 'github-ssh-key', url: 'git@github.com:CianGibbons/CT417-Assignment1-StudentRegistrationSystem.git']]]
            }
        }
        stage('Clean and Build') {
            steps {
                
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew --configure-on-demand --rerun-tasks -x check test'
                publishHTML([reportDir: 'build/reports/tests/test', reportFiles: 'index.html', reportName: 'HTML Report', keepAll: true, allowMissing: false, alwaysLinkToLastBuild: false,])
            }
        }
    }
}