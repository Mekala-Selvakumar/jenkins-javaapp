pipeline {
    agent any

    tools {
        jdk 'open_JDK17'         // Must match the name configured in Jenkins Global Tools
    //    maven 'Maven 3.9.9'  // Must match the configured Maven version
       maven 'MVN'
    }

    stages {
        stage('Checkout') {
            steps {
                echo '📥 Checking out source code...'
                git 'https://github.com/Mekala-Selvakumar/jenkins-javaapp.git'  // Replace with your Git repo URL
            }
        }

        stage('Build') {
            steps {
                echo '🔨 Running Maven build...'
                sh 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                echo '🧪 Running unit tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo '📦 Packaging application...'
                sh 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
    }
}
