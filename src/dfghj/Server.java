package dfghj;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket serversocket = null;
	private int port;
	
	public Server(int port){
		this.port = port;
	}
	
	public void start() throws IOException{
		System.out.println("�������񣬶˿ں�"+port);
		serversocket = new ServerSocket(port);
		
		Socket client = null;
		while(true){
			client = serversocket.accept();
			System.out.println(" ���ӳɹ�");
		}
	}
	
	
	public static void main(String[] args){
	   Server  mys = new Server(2345);
	   try {
		mys.start();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
}

