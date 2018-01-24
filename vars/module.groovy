stage ('Clone') {
                   sh "echo 'Cloning ${config.projectName} ...'"
                }
                stage ('Build') {
                    sh "echo 'building ${config.projectName} ...'"
                }
