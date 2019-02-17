package fr.unice.miage.tp1;

import java.io.File;

public class Liste3 
{
	public static void main( String[] args ){
		Liste3 app = new Liste3();
		app.findPathContent(".");
	}

	@SuppressWarnings("unused")
	public void findPathContent(String path) {
		// **********************************//
    	// Code relatif à l'éxercice 1.a.3 : //
    	// **********************************//
		
		File file = new File(path);
		Filter monFilter = new Filter(".java");
		
		File[] listeFile = file.listFiles(monFilter.getFilter()); 


		if(file != null) {
			for(File f : listeFile) {
				if(f.isDirectory()) {
					findPathContent(f.getPath());
				}
				else {
					System.out.println(f.toString());
				}            	
			}
		}else {
			System.out.println("Le chemin est invalide !");
		}

	}
}
