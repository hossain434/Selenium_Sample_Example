//Jenkins file example
pipeline {
  agent any
    
 tools {'maven'}
    
  stages {
        
    stage('Cloning Git') {
      steps {
        git 'https://github.com/hossain434/Selenium_Sample_Example'
      }
    }
        
    stage('Install dependencies') {
      steps {
        sh 'maven clean'
      }
    }
     
    stage('Test') {
      steps {
         sh 'maven install'
      }
    }      
  }
}
