package Redes;

import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.1.32", 5002);
		
		Scanner s = new Scanner(socket.getInputStream());
		
		System.out.println("Status: "+ s.nextLine());
		s.close();
	}

}
