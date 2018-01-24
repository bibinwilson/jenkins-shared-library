def call(body) {

        def config = [:]
        body.resolveStrategy = Closure.DELEGATE_FIRST
        body.delegate = config
        body() 
           
        stage ('build-artifacts') {
        
             dir('spring-petclinic') {
             
              sh "mvn clean build" 
    
             }               
               }
  
}
