pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage ('Name'){
            steps{
                echo 'Sakthivel'
            }
        }
        stage ('College'){
            steps{
                echo 'KEC'
            }
        }
        stage ('Department'){
            steps{
                echo 'CSE'
            }
        }
    }
}
