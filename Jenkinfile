pipeline {
      agent any
      stages{
      
     stage('cleaning stage')
        {
            steps{
            bat "mvn clean"
            }
        }
        stage('Build') {
         steps{
            bat "mvn clean test"
            }
        }
        stage('Package') {
         steps{
            bat "mvn package"
            }
        }
          
          }
    }
