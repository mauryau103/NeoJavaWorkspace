import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
		Socket socket;	
		DataInputStream inputStream;
		DataOutputStream outputStream;
		BufferedReader br;
		public TcpServer() {
			System.out.println("Connection Establishment with Client");		
			try(ServerSocket ss=new ServerSocket(2020);    ){
				System.out.println("Server is waiting for client request...... ");
				socket=ss.accept();
				System.out.println("Connection Established...........");
				inputStream=new DataInputStream(socket.getInputStream());
				outputStream=new DataOutputStream(socket.getOutputStream());
				br=new BufferedReader(new InputStreamReader(System.in));
				chat();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void chat() throws IOException{
			while(true){
				String messagefromClient=inputStream.readUTF();
				System.out.println("From Client:"+messagefromClient);
				String serverMessage=br.readLine();
				outputStream.writeUTF(serverMessage);
				System.out.println("To Client:"+serverMessage);
			}
		}
		public static void main(String[] args) {
			TcpServer server=new TcpServer();
			
		}
}