import java.io.*;
import java.net.*;


public class SocketListener {

	public static void main(String[] args) {
		
	}
	
	public void ClientListener (String address, int port) {
		try {
			Socket socket = new Socket (address, port);
			System.out.println("Connected");
			
			DataInputStream message = new DataInputStream(System.in);
		}
		catch (UnknownHostException e) {
			System.out.println("Unknown Host Exception");
		}
		catch(IOException i) {
			System.out.println("IO Exception");
		}
	}

}
