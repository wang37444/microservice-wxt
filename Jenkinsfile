pipeline {
    agent any
    stages {
	    stage('拉取代码'){
	       steps {
	       		git 'https://github.com/wang37444/microservice-wxt.git'
	       }
	    }
	    stage('maven编译'){
	       steps {
	       	dir('./'){
	       		sh 'mvn clean install'
	       	}
	       }
		}
		stage('构建镜像'){
	       steps {
	       	dir('./'){
	       		sh 'sudo docker build -t 10.168.14.40:8101/yrz/microservice-wxt-frontweb:1.0 . -f /home/uaren/.jenkins/workspace/microservice-wxt/microservice-wxt-frontweb/src/main/docker/Dockerfile'
	       	}
	       }
		}
    }

}
