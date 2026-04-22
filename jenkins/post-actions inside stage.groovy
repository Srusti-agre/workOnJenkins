pipeline{
    agent any
    stages{
        stage ("DEVOPS"){
            steps{
                "HELLO JENKINS"
            }
            post{
                success{
                    echo "Pipeline completed successfully"
                }
                failure{
                    echo "Pipeline failed—check logs for details"
                }
                always{
                    echo "Deployment finished with warnings, review required"
                }
            }
        }
    }
}