pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage ("pull the src"){
            steps{
                git branch: 'main' url :'https://github.com/Srusti-agre/workOnJenkins.git'
            }
        }
        stage ("clean"){
            steps{
                sh 'mvn clean'
            }
        }
        stage ("build"){
            steps{
                sh 'mvn package'
            }
        }
    }
}