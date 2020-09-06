pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh 'echo "Building..."'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}