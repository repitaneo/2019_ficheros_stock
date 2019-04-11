package com.marcos.ficheros_stock.out;

import java.util.ArrayList;
import com.marcos.ficheros_stock.beans.Producto;



public class Salida {

	
	public void imprimirListaProductos(ArrayList<Producto> lista) {
		
		
		for(Producto p:lista) {
			
			System.out.println("******************");
			System.out.println("ID\t ["+p.getId()+"]");
			System.out.println("Nombre\t ["+p.getNombre()+"]");
			System.out.println("Cantidad ["+p.getCantidad()+"]");
			System.out.println("Precio\t ["+p.getPrecio()+"]");
		}
		System.out.println("******************");
		System.out.println("Se han imprimido "+lista.size()+" elementos");
	}
}
