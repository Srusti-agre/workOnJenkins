pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage ("pull the src"){
            steps {
                git branch : 'main', url 'https://github.com/Srusti-agre/workOnJenkins.git'
            }
        }
        stage ("Parallel build stages"){
            parallel{
                stage ('Clean and build') {
                    steps {
                        sh 'mvn clean package'
                    }
                }
                stage ('Test and report'){
                    steps {
                        sh 'mvn test site'
                    }
                }
            }
        }
    }
}