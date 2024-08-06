package student8706_crud.utility;



public class ConnectionFactory {
	
	//Singleton Class
	private static ConnectionFactory connectionFactory = null ;
	
	private ConnectionFactory() {
		
	}
	
	public ConnectionFactory getConnection() {
		if(connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory ;
	}
	public static connectionFactory 
}
