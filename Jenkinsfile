pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''java --version
mvn --version
mvn install'''
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

  }
}