package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class App 
{
    public static void main( String[] args ){
    	App app = new App();
    	app.findPathContent(".");
    }
    
    @SuppressWarnings("unused")
	public void findPathContent(String path) {
    	File file = new File(path);
    	
    	FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				boolean result = false;
			
				if(name.toLowerCase().endsWith(".java") || dir.isDirectory()) {
					if(name.toLowerCase().endsWith(".java")){
						System.out.println(dir.toString() + "\\"+ name);
					}
					result = true;
				}
				
				return result;
			}
		};

        File[] listeFile = file.listFiles(filter); 
        
        
        if(file != null) {
        	for(File f : listeFile) {
            	if(f.isDirectory()) {
            		findPathContent(f.getPath());
            	}
            	//System.out.println(f.toString());
            }
        }else {
        	System.out.println("Le chemin est invalide !");
        }
        
    }
}
