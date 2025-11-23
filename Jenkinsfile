pipeline {
    agent any

    stages {
        stage('GetProject') {
            steps {
                git (
                    url: 'https://github.com/naoisemcgarrigle/CT5171_SpringWar.git',
                    branch: 'master'
                )
            }
        }
        stage('Build') {
            steps {
                sh "mvn clean:clean"
                sh "mvn dependency:copy-dependencies"
                sh "mvn compiler:compile"
            }
        }
        stage('Package') {
            steps {
                sh "mvn package"
            }
        }
    }
}