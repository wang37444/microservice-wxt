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
	       		sh 'mvn clean package docker:build'
	       }
		}
    }

}
