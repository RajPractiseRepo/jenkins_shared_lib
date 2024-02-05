def call() {
   rtUpload (
                serverId: 'Jfrognew',
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
