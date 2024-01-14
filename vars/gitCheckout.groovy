def call(body)
{
  def applicationName = config.applicationName ?: 'SAMPLE'

    node("master")
    {
      stage("Checkout source code")
			{
				//step([$class: 'WsCleanup'])
				checkout scm
        		}
     stage("Maven build")
			{
				sh 'mvn clean install'
			}	
     }    
    }
}
