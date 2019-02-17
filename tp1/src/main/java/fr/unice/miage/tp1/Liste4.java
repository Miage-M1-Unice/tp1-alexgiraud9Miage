package fr.unice.miage.tp1;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Liste4 
{
	public static void main(String[] args) {
		
		// **********************************//
    	// Code relatif à l'éxercice 1.b.1 : //
    	// **********************************//
		
	    Path path = Paths.get(".");
	    SimpleFileVisitor<Path> simplefileVisitor = new SimpleFileVisitor<Path>() {
	      
	      @Override
	      public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)throws IOException {
	        System.out.println(file);
	        return FileVisitResult.CONTINUE;
	      }
	    };

	    try {
	      Files.walkFileTree(path, simplefileVisitor);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	  }
}
