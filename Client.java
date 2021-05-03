package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Socket socket = new Socket ("127.0.0.1",9090); 	//127.0.0.1 is the local host address. socket port 9090 as long as greater than 1024
		
		PrintWriter pw = new PrintWriter (socket.getOutputStream(), true);	//printwriter exports content to the location socket.getOutputStream, flush is true means it sends as soon as you run the printline.
		BufferedReader key = new BufferedReader (new InputStreamReader(System.in)); 
		
		String input = "";
		while (!input.equals("exit")) {
			System.out.println("\ninput your message to the server");
			System.out.print("> ");
			input = key.readLine();
			pw.println(input);
			}
		
		System.out.println("you are now disconnected.");
		
		
		socket.close();
		pw.close();
		System.exit(0);
	
	
	}
}
