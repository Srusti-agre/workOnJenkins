pipeline{
    agent any{
        environment{
            name = "JENKINS"
            domain = "DEVOPS"
        }
        stages{
            stage("name"){
                steps{
                    echo "my name is : $name"
                }
            }
            stage("domain"){
                steps{
                    echo "my domain is : $domain"
                }
            }
        }
    
            }
        }
    