package fr.unice.miage.tp1;

import java.io.File;

public class App 
{
    public static void main( String[] args ){
    	findPathContent(".");
    }
    
    @SuppressWarnings("unused")
	public static void findPathContent(String path) {
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
