import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	DataOutputStream outputStream;
	DataInputStream inputStream;
	InetAddress serveraddress;
	BufferedReader br;
	public TcpClient() throws UnknownHostException {
		System.out.println("Connection Establishment");
		serveraddress=InetAddress.getByName("NEOLAP000003030");
		System.out.println(serveraddress);
		System.out.println("Client Establishing Connection with Server");
		try(Socket clientSocket=new Socket(serveraddress,2020)){
			outputStream =new DataOutputStream(clientSocket.getOutputStream());
			inputStream=new DataInputStream(clientSocket.getInputStream());
			//inputStream=new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			br=new BufferedReader(new InputStreamReader(System.in));

			chat();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection gets autoclosed");
		

	}// constructor
	
	public void chat() throws IOException{	
		while(true){
			String clientMessage=br.readLine();
			outputStream.writeUTF(clientMessage);
			System.out.println("To Server:"+clientMessage);
			String messageFromServer=inputStream.readUTF();	
			System.out.println("From Server:"+messageFromServer);
		}
	}
	
	public static void main(String[] args) {
		try {
			TcpClient client=new TcpClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}