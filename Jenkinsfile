
pipeline {
  agent any

  stages {
    stage ('Clone') {
      steps {
        checkout scm
       }
    }
  
    stage('Compile') {
      steps {
        withMaven(maven: 'Maven 3.6.0') {
          sh 'mvn clean compile'
        }
      }
    }
  }
}

