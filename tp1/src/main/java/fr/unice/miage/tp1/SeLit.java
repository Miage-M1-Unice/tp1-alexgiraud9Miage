package fr.unice.miage.tp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;   
  
public class SeLit {  
   void lecture(Scanner source) {  
	   try{
		    FileReader fr = new FileReader(source.next());
			BufferedReader buff=new BufferedReader(fr);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				System.out.println(ligne);
			}
			buff.close(); 
	   }		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}  
   
   void ecriture(String source) throws IOException {
	    FileWriter fw = new FileWriter(source, true);
	   
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		bufferedWriter.write("Voici un nouveau texte");
		bufferedWriter.newLine();
		bufferedWriter.close();
   }
     
	static public void main(String[] args) throws IOException {   
		SeLit seLit = new SeLit();
		
		/*
		 * Exemple de source : .\src\main\java\fr\ unice\miage\tp1\SeLit.java
		 * 
		 */
		
		// Début lecture: 
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		System.out.print("Veuilliez saisir le fichier avec son extension : ");
		
		seLit.lecture(value);
		
		//Début écriture : 
		value = new Scanner(System.in);
		System.out.println("Veuilliez entrer un nom de fichier suivi de son extension : ");
		String valeur = value.nextLine();
		
		seLit.ecriture(valeur);
	}
}  
