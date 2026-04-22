pipeline{
    agent any
    stages{
        stage ("without env"){
            steps{
                echo "the job name : $JOBNAME"
                echo "the build_id : $BUILD_ID"
            }
        }
        stage ("with env"){
            steps{
            echo "the job name : ${env.JOB_NAME}"
            echo "the build id : ${env.BUILD_ID}"
        }
    }
}
}