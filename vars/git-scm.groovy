def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body() 
           
                stage ('Clone') {
                   sh "echo 'Cloning ...'"
                   
                }
                stage ('Build') {
                    sh "echo 'building...'"
                }
  
}
