pipeline {
    agent any
    stages {
        stage("info") {
            steps {
                sh """
                    pwd
                    whoami
                    uptime
                    echo $JOB_NAME
                    echo $BUILD_ID
                """
            }
        }
    }
}