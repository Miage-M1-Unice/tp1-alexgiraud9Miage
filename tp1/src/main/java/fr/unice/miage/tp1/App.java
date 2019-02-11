package fr.unice.miage.tp1;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File file = new File(".");
        String listeFile[] = file.list();      
 
        if (listeFile != null) {         
            for (int i = 0; i < listeFile.length; i++) {
                System.out.println(listeFile[i]);
            }
        } else {
            System.err.println("File invalide");
        }
    }
}
