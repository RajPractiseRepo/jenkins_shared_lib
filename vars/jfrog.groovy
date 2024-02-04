def call() {
   rtUpload (
                serverId: 'jfrog-server',
                spec: '''{
                      "files": [
                        {
                          "pattern": "*.jar",
                           "target": "example-repo-local/new-file/"
                        }
                    ]
                }'''
              )
         }
