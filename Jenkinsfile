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
                sh 'make check || true'
                junit '**/target/*.xml'
            }
        }
    }
}