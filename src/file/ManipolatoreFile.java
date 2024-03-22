package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipolatoreFile {

	public static void main(String[] args) {
		//creaFile();
		
		//verificaEsistenzaFile();
		
		//inserisciTesto();
		
		leggiFile();
		
		//eliminaFile();
		
	}

	public static void creaFile() {
		File fileDiTesto = new File("testo.txt");

		try {
			boolean riuscito = fileDiTesto.createNewFile();
			if (riuscito == true) {
				System.out.println("Creazione file riuscita");
			} else {
				System.out.println("Creazione file fallita");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Errore durante la creazione");
		}
		
	}
	
	public static void verificaEsistenzaFile() {
		File f = new File("testo.txt");
		
		if(f.exists()) {
			System.out.println("File Esiste");
		}else {
			System.out.println("File NON Esiste");
		}
	}
	
	public static void leggiFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("testo.txt"));
		
			String linea;
			
			while((linea = reader.readLine())!=null) {
				System.out.println(linea);
			}
			
			reader.close();
		}catch(IOException e) {
			System.out.println("Errore nella lettura");
		}
	}
	
	public static void inserisciTesto() {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("testo.txt", true ));
			
			w.write("\r\nQuesto testo è stato aggiunto ora");
			
			w.close();
			
			System.out.println("Testo Aggiunto");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void eliminaFile() {
		File f = new File("testo.txt");
		
		boolean risposta = f.delete();
		
		if(risposta == true) {
			System.out.println("File eliminato");
		}else {
			System.out.println("Impossibile cancellare il file");
		}
	}
	
	

}
