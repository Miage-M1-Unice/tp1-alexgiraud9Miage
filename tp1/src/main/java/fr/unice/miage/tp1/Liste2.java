package fr.unice.miage.tp1;

import java.io.File;

public class Liste2 
{
    public static void main( String[] args ){
    	// **********************************//
    	// Code relatif à l'éxercice 1.a.2 : //
    	// **********************************//
    	Liste2 liste = new Liste2();
    	liste.findPathContent(".");
    }
    
    @SuppressWarnings("unused")
	public void findPathContent(String path) {
    	File file = new File(path);
        File[] listeFile = file.listFiles();     

        if(file != null) {
        	for(File f : listeFile) {
            	if(f.isDirectory()) {
            		findPathContent(f.getPath());
            	}
            	System.out.println(f.toString());
            }
        }else {
        	System.out.println("Le chemin est invalide !");
        }
    }
}