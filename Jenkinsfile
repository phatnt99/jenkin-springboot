node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/phatnt99/jenkin-springboot.git'
  }

  stage("Compilation") {
    sh "./mvnw clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "chmod +x -R ${env.WORKSPACE}"
      sh "./mvnw test -Punit"
    }
    stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}