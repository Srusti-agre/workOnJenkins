pipeline{
    agent any
    stages{
        stage("devops"){
            steps{
                echo "hello devops"
            }
        }
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