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
		ServerSocket ss = new ServerSocket (9090); //server socket with port 9090
		System.out.println("waiting for the client...");
		
		Socket client = ss.accept(); 	//a socket object is created to connect server to client.
		System.out.println("you are now connected to the client!");
		
		BufferedReader fb = new BufferedReader (new InputStreamReader(client.getInputStream())); //it reads what it receives from client to the server
		
		String received = "";
		while (!received.equals("exit")) {
		received = fb.readLine();
		
		System.out.println("\nResponse to the client");
		System.out.print("> "+received+"\n");
		
	
		}
		
		System.out.println("Disconnected from the client.");
		ss.close();
		fb.close();	
		client.close();
		
		} catch (Exception e) {		//use try catch due to null.pointer.exception in line 23.
			
		}
	
	
	}
	}	