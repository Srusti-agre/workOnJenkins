pipeline{
    agent any{
        stages{
            stage("clean"){
                steps{
                    echo "mvn clean"
                }
            }
            stage("default"){
                steps{
                    echo "mvn package"
                }
            }
            stage("site"){
                steps{
                    echo "mvn site"
                }
            }
        }
    }
}