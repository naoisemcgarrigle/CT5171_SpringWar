pipeline {
    agent any
    tools {
        jdk 'jdk21'
    }
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
                sh "java -version"
                sh "javac -version"
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
        stage('Archive') {
            steps {
                archiveArtifacts allowEmptyArchive: true,
                    artifacts: '**/demo*.war'
            }
        }
        stage('Deploy') {
            steps {
                sh "docker build -f Dockerfile -t myapp . "
                sh "docker rm -f \"myappcontainer\" || true"
                sh "docker run --name \"myappcontainer\" -p 8081:8080 --detach myapp:latest"
            }
        }
    }
}