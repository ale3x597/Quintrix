import java.io.*;
import java.net.*;
import java.util.logging.Handler;



public class SocketListener {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(4999);
		while(!server.isClosed()) {
			Socket s = server.accept();
			Thread thread = new Handler(s);
			thread.start();
		}
	}
	
	private static final class Handler extends Thread {
		private Socket s;
		public Handler(Socket s) {
			this.s = s;
		}
		public void run() {
			try {
				handleConnections(s);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		private void handleConnections(Socket s2) throws IOException {
			System.out.println("Connected!");
			
			InputStreamReader in = new InputStreamReader(s.getInputStream());
			BufferedReader buff= new BufferedReader(in);
			
		}
	}
	}
	
	

