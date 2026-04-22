pipeline{
    agent any
    stages{
        stage("hello"){
            steps{
                echo "HELLO JENKINS"
            }
        }
    }
}