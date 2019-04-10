package com.marcos.ficheros_stock.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.marcos.ficheros_stock.beans.Producto;



public class FicheroReader {

	
	public final static String FICHERO_1 = "stock1.txt";
	public final static String FICHERO_2 = "stock2.txt";
	
	
	
	public static ArrayList<Producto> getDatos(String fichero) {
		
		// el arrayList que pretendo devolver
        ArrayList<Producto> datos = new ArrayList<Producto>();

        
        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(fichero));
 
            // leo el codigo a ver si existe          
            String linea=ficheroEntrada.readLine();
            
            // mientras que las lineas existan
            while(linea!=null){

            	Producto producto = new Producto();
            	
            	// escribo en el bean el codigo
            	producto.setId(linea);

            	// escribo en el bean  el nombre
            	linea=ficheroEntrada.readLine();
            	producto.setNombre(linea);
            	
            	// escribo en el bean  la cantidad
            	linea=ficheroEntrada.readLine();
            	producto.setCantidad(Integer.parseInt(linea));
            	
            	// escribo en el bean  el precio
                linea=ficheroEntrada.readLine();
                producto.setPrecio(Float.parseFloat(linea));
                

                datos.add(producto);
                
                
                // lectura del siguiente artículo
                linea=ficheroEntrada.readLine();
            }
            	
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // devolvemos el arraylist generado
        return datos;
		
	}	
	
	
	
	
	
}
