def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body() 
           
        stage ('Clone') {
                   sh "echo 'Cloning ...'"
                   git 'https://github.com/spring-projects/spring-petclinic.git'
                }
                stage ('Build') {
                    sh "echo 'building...'"
                }
  
}
