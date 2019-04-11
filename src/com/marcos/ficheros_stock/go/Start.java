package com.marcos.ficheros_stock.go;

import java.util.ArrayList;

import com.marcos.ficheros_stock.beans.Producto;
import com.marcos.ficheros_stock.controlador.JoinListas;
import com.marcos.ficheros_stock.file.FicheroReader;
import com.marcos.ficheros_stock.out.Salida;

public class Start {
	
	
	public static void main (String [ ] args) {
		
		ArrayList<Producto> datos_fichero_1 = FicheroReader.getDatos(FicheroReader.FICHERO_1);
		ArrayList<Producto> datos_fichero_2 = FicheroReader.getDatos(FicheroReader.FICHERO_2);
		ArrayList<Producto> listasJuntas;
		
		listasJuntas = JoinListas.join(datos_fichero_1, datos_fichero_2);
		
		Salida salida = new Salida();
		salida.imprimirListaProductos(listasJuntas);
		
		
		/*
		salida.imprimirListaProductos(datos_fichero_1);
		System.out.println("\n\n");
		salida.imprimirListaProductos(datos_fichero_2);
		 */
		
		
		
		
	}
}
