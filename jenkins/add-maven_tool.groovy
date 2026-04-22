pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage("mvn"){
            steps{
                sh "mvn --version"
            }
            post{
                success{
                    echo "success"
                }
                failure{
                    echo "failure"
                }
                always{
                    echo "always"
                }
            }
        }
    }
}