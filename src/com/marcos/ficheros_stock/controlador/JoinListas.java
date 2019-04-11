package com.marcos.ficheros_stock.controlador;

import java.util.ArrayList;

import com.marcos.ficheros_stock.beans.*;

public class JoinListas {

	
	public static ArrayList<Producto> join(	ArrayList<Producto> lista1, 
											ArrayList<Producto> lista2) {
		
		ArrayList<Producto> listaJuntada = new ArrayList<Producto>();
		
		// recorro la lista 1 y 
		for(Producto p:lista1) {
			
			Producto coincidente = buscarCoincidencias(p,lista2);
			
			if(coincidente!=null) {
				// hay coincidencia en la lista 2
				Producto anadir = new Producto();
				anadir.setId(p.getId());
				anadir.setNombre(p.getNombre());
				anadir.setCantidad(p.getCantidad()+coincidente.getCantidad());
				anadir.setPrecio(p.getPrecio());
				
				listaJuntada.add(anadir);
				lista2.remove(coincidente);
			}
			else {
				// no hay coincidencia en la lista 2
				listaJuntada.add(p);
			}
		}
		
		
		
		for(Producto p:lista2) {
		
			listaJuntada.add(p);
		}

		
		
		
		return listaJuntada;
	}
	
	
	
	
	
	
	private static Producto buscarCoincidencias(	Producto buscado,
											ArrayList<Producto> listaBuscar) {
		
		int i = 0;
		boolean encontrado = false;
		while((i<listaBuscar.size())&&(encontrado == false)) {
			
			if(listaBuscar.get(i).getId().equals(buscado.getId())) {
				
				encontrado = true;
			}
			else i++; 
		}

		if(encontrado == true) {
			
			return listaBuscar.get(i);
		}
		else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
}
