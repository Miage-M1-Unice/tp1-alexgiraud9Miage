package fr.unice.miage.tp1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

//**********************************//
// Code relatif à l'éxercice 1.a.3 : //
// **********************************//

public class Filter_patern_expr_reg {
	private FilenameFilter filter = null;
	
	public Filter_patern_expr_reg(final String nomDuFiltre) {
		this.filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				boolean resultat = false;

				File f = new File(dir + "\\" + name);

				if(f.isDirectory() || Pattern.matches(nomDuFiltre, name)) {
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
