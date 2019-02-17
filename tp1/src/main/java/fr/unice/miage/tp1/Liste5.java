package fr.unice.miage.tp1;

import java.io.File;
import java.util.regex.Pattern;

//**********************************//
// Code relatif à l'éxercice 1.c : //
// **********************************//
public class Liste5 
{
	public static void main( String[] args ){
		Liste5 app = new Liste5();
		
		String regex = ".*\\.class";
		String path = ".";
		app.findPathContent(path, regex);
	}

	@SuppressWarnings("unused")
	public void findPathContent(String path, String regex) {
		
		Pattern p = Pattern.compile(regex);
		
		File file = new File(path);
		Filter_patern_expr_reg monFilter = new Filter_patern_expr_reg(p.pattern());
		
		File[] listeFile = file.listFiles(monFilter.getFilter()); 


		if(file != null) {
			for(File f : listeFile) {
				if(f.isDirectory()) {
					findPathContent(f.getPath(),regex);
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
