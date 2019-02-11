package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;

public class Filter {
	private FilenameFilter filter = null;
	
	public Filter(String nomDuFiltre) {
		this.filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				boolean resultat = false;

				File f = new File(dir + "\\" + name);

				if(f.isDirectory() || name.toLowerCase().endsWith(".java")) {
					resultat = true;
				}

				return resultat;
			}
		};
	}

	public FilenameFilter getFilter() {
		return filter;
	}

	public void setFilter(FilenameFilter filter) {
		this.filter = filter;
	}




}
