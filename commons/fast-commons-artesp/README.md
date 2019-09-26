#Introduction
Utilitario utilizado para criação de conexão e sessão com o HornetQ


#Getting Started
A classe JMSUtil contém o método getConnection onde se deve passar o arquivo de propriedades com os dados da conexão com o hornetQ.
A classe JMSUtil contém o método getSession onde se deve passar a conexão para se obter uma sessão.


#Build and Test
A classe JMSTest contém o teste para obtenção da conexão. Esta instancia um arquivo de propriedades de exemplo que esta localizado dentro da pasta properties.

Exemplo:
````
Connection conn = JMSUtil.getConnection(getProp()); //getProp() carrega o arquivo de propriedade com os dados do hornetq.

public Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/HQ.properties");
		props.load(file);
		return props;
	}
````

#Contribute
