pipeline{
  agent any
  tools{
    maven "maven"
  }
  stages{
    stage('scm-checkout') {
      steps{
        git 'https://github.com/Naresh-coder57/practice/new/main/ersinsurance-testapp'
      }
    }
    stage('build') {
      steps{
        sh 'mvn package'
      }
    }
  }
}
