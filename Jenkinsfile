
pipeline {
  agent any

  stages {
    stage ('Clone') {
      steps {
        checkout scm
       }
    }
  }
  
  stage('Compile') {
    steps {
      withMaven(maven: 'Maven 3') {
        sh 'mvn clean compile'
      }
    }
  }
}

