package dfghj;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private int port;
	private String host;
	
	
	public Client(int port, String host){
		this.port = port;
		this.host = host;
	}
	
	public void connect() throws UnknownHostException, IOException{
		Socket Client = new Socket(host,port);
		System.out.println("连接成功");
	}

	public static void main(String[] argd) throws UnknownHostException, IOException{
		Client client = new Client(2345,"localhost");
		client.connect();
	}
}
