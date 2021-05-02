package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {	
		ServerSocket ss = new ServerSocket (9090);
		System.out.println("waiting for the client...");
		
		Socket client = ss.accept(); 
		System.out.println("you are now connected to the client!");
		
		BufferedReader fb = new BufferedReader (new InputStreamReader(client.getInputStream()));
		
		String received = "";
		while (!received.equals("exit")) {
		received = fb.readLine();
		
		System.out.println("Response to the client");
		System.out.print("> "+received+"\n");
		
	
		}
		
		ss.close();
		fb.close();	
		client.close();
		
		} catch (Exception e) {
			
		}
	}
	}	


