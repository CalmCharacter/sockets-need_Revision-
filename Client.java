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
	try {	
		Socket socket = new Socket ("127.0.0.1",9090);
		
		PrintWriter pw = new PrintWriter (socket.getOutputStream(), true);
		BufferedReader key = new BufferedReader (new InputStreamReader(System.in));
		
		String input = "";
		while (!input.equals("exit")) {
			System.out.println("input your message to the server");
			System.out.print("> ");
			input = key.readLine();
			pw.println(input);
			
			
		}
		
		socket.close();
		pw.close();
		System.exit(0);
	} catch (Exception e) {
		
	}
	
	}
}
