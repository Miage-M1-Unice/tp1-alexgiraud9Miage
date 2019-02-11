package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class Liste3 
{
	public static void main( String[] args ){
		Liste3 app = new Liste3();
		app.findPathContent(".");
	}

	@SuppressWarnings("unused")
	public void findPathContent(String path) {
		File file = new File(path);
		
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				boolean resultat = false;

				File f = new File(dir + "\\" + name);

				if(f.isDirectory() || name.toLowerCase().endsWith(".java")) {
					resultat = true;
				}

				return resultat;
			}
		};

		File[] listeFile = file.listFiles(filter); 


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
