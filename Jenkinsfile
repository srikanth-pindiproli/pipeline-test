
pipeline {
  agent any

  stages {
    stage ('Clone') {
      checkout scm
    }
  }
  
  stage('Compile') {
    withMaven(maven: 'Maven 3') {
      sh 'mvn clean compile'
    }
  }
}

