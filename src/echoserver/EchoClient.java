package echoserver;
import java.net.*;
import java.io.*;

public class EchoClient {
	public static void main(String[] args){
		try{
			//Opens a socket
			Socket Csocket = new Socket("127.0.0.1", 6013);
			//Orginally had this one name ThisOne but it dosent compille :(
			//so it was changed to in vs ThisOne
			InputStream in = new DataInputStream(System.in);
			OutputStream Sout = Csocket.getOutputStream();

			//Define a stream for the byetes to be handled
			InputStream Sin = Csocket.getInputStream();
			// This is a variable that holds data have bytes to handle binary stuff
			byte[] BufferIn = new byte[1];
			byte[] Bufferout = new byte[1];
			
			while(in.read(BufferIn)!=-1){
				Sout.write(BufferIn);
				Sout.flush();
				Sin.read(Bufferout);
				System.out.write(Bufferout,0,1);
				
			}
			Csocket.close();
		}
		catch(IOException NoGo){
			System.err.println(NoGo);
		}
	}
}
