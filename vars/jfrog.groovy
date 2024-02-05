def call() {
   rtUpload (
                serverId: 'Jfrog',
                spec: '''{
                      "files": [
                        {
                          "pattern": "*.jar",
                           "target": "example-repo-local/"
                        }
                    ]
                }'''
              )
         }
