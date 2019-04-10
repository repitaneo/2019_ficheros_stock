package com.marcos.ficheros_stock.go;

import java.util.ArrayList;

import com.marcos.ficheros_stock.beans.Producto;
import com.marcos.ficheros_stock.file.FicheroReader;

public class Start {
	
	
	public static void main (String [ ] args) {
		
		
		
		ArrayList<Producto> datos_fichero_1 = FicheroReader.getDatos(FicheroReader.FICHERO_1);
		System.out.println(datos_fichero_1);
		
		
		
		
	}
}
