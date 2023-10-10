package ClientPackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//création de l'objet Socket côté client
			Socket socket =new Socket("localhost",1234);
			System.out.println("je suis un client connecté");
			InputStream is =socket.getInputStream();
			OutputStream os =socket.getOutputStream();
			//donner la main pour donner un nombre
			Scanner scanner =new Scanner(System.in);
			System.out.print("donner un nombre =" );
			int nb =scanner.nextInt();
			//envoyer le nombre donner a le serveur 
			os.write(nb);
			//lire la resultat donner d'apres le serveur
			int rep= is.read();
			System.out.println("reponse = "+rep);
			
	}
		catch (IOException e) {
			e.printStackTrace();
			
		}

	}
}
