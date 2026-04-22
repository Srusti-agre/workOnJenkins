pipeline{
    agent any{
        stages{
            stage("blocks"){
                echo "I am Step block"
                script{
                    echo "I am script block"
                }
            }
        }
    }
}