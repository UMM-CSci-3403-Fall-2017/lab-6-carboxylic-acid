package echoserver;
import java.net.*;
import java.io.*;

public class EchoServer{
	public static void main(String[] args){
		try{
			ServerSocket SSocket= new ServerSocket(6013);
			while(true){
				int alive;
				byte[] readBuff = new byte[1];
				//Need socket from user
				Socket user = SSocket.accept();
				
				//Need more handshaking
				InputStream inuser = user.getInputStream();
				OutputStream outuser = user.getOutputStream();
				
				//keeping the info alive from the User and reads into the stream.
				while(inuser.read(readBuff)!=-1){
					outuser.write(readBuff);
					outuser.flush();
					}
					//Closeing the Socket
					user.close();
			}
		}
		//If not true
		catch(IOException NoGo){
			System.err.println(NoGo);
			}
	}
}