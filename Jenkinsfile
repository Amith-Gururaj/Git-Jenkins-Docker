pipeline {
    agent any
    
//     environment {
        
//         dockerImage = ''
//         imagename = "harsh8848/springboot-jenkins-pipeline-docker"
//         registryCredential = '50bdcf62-5759-4334-b661-a7fd2b19887b'
       
//     }
   

    stages {
        stage('Build') {
            steps {
              
               // bat 'mvn -Dmaven.test.failure.ignore=true clean' 
                bat 'mvn compile' 
                echo 'Compiling Project....'
                echo 'Compiled Successfully'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                echo 'Testing.....'
                echo 'Tested Successfully'
            }
        }
        
        stage('Install') {
            steps {
              
               // bat 'mvn -Dmaven.test.failure.ignore=true clean' 
                bat 'mvn install' 
                echo 'installing Project....'
                echo 'installed Successfully'
            }
        }
        
          stage('Packaging') {
            steps {
                bat 'mvn package'
                echo 'Packaging.....'
                echo 'JAR file  Successfully created'
            }
        }
        
        
       // docker build . -t app-springboot
        
//        stage('Building image') {
//             steps{
//                 script {
//                      dockerImage = docker.build imagename 
//                 }
//             }
//         }
        
        
//         stage('Deploy Image') {
//              steps{
//                 script {
//                     docker.withRegistry( '', registryCredential ) {
//                     dockerImage.push("$BUILD_NUMBER")
//                    // dockerImage.push('latest')
//                      }
//                  }
//         }
//      }
        

        
    
            
//             stage('Run docker compose ') {
//              steps{
//                 script {
//                     //bat "docker-compose up"
//                      bat "docker-compose -f docker-compose.yml up"
//                     //docker.withRegistry( '', registryCredential ) {
//                     //dockerImage.push("$BUILD_NUMBER")
//                    // dockerImage.push('latest')
                    
//                      }
//                  }
//              }
            
            
         
    }
}
