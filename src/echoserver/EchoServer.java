package echoserver;
import java.net.*;
import java.io.*;

public class EchoServer {
	public static void main(string[] agruments){
		try{
			ServerSocket SSocket= new ServerSocket(6013);
			while(true){
				int alive;
				//Need socket from user
				Socket user = SSocket.accept();
				
				//Need more handshaking
				InputStream inUser = user.getInputStream();
				OutputStream outUser = user.getOutputStream();
				
				//keeping the info alive from the User
				while((alive = inUser.read())!=-1){
					inClient.write(alive);
					//Useing flush to write out any data that remains in the 
					//stream
					//, happens to be a common comand for the wiiner of the 
					//sorting compuitution this year
					outUser.flush();
				}
				inUser.close();
				outUser.close();
				user.close();
					
			}
			//If not true
			catch(IOException NoGo){
				System.err.println(NOGo);
			}
		}
	}
}