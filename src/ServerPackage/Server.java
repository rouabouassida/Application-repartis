package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//création de l'objet ServerSocket
			ServerSocket ss =new ServerSocket(1234);
			//un serveur pas encore connecter 
			System.out.println("je suis un serveur en attente la connexion d'un client");
			// attendre la connexion de un client 
			Socket s= ss.accept();
			InputStream is =s.getInputStream();
			OutputStream os =s.getOutputStream();
			System.out.println("j'attend un nombre");
			//lire le nàombre donner par le client 
			int nb=is.read();
			//calculer la resultat
			int res=nb*5;
			//envoyer la res ou client
			os.write(res);
			// fermeture de la Socket
			s.close();
		}
				catch (IOException e) {
					e.printStackTrace();
					
				}

		 
			
		
			
		

	}

	private static OutputStream getOutputStream() {
		// TODO Auto-generated method stub
		return null;
	}

}
