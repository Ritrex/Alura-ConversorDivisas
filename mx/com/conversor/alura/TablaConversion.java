package mx.com.conversor.alura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
public class TablaConversion <V,T> {
	
	private ArrayList<String> unidades;
	private HashMap<String,HashMap<String,Function<V,T>>> tablaConversiones;
	
	public TablaConversion(String[] listaunidades) {
		this.unidades=new ArrayList<>(Arrays.asList(listaunidades));
		this.tablaConversiones=new HashMap<>();
		for(String unidad: listaunidades) {
			tablaConversiones.put(unidad, new HashMap<String,Function<V,T>>());
		}
	}
	
	public TablaConversion(List<String> listaunidades) {
		this.unidades=new ArrayList<>(listaunidades);
		this.tablaConversiones=new HashMap<>();
		for(String unidad: listaunidades) {
			tablaConversiones.put(unidad, new HashMap<String,Function<V,T>>());
		}
	}

	public ArrayList<String> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<String> unidades) {
		this.unidades = unidades;
		for(String unidad:unidades) {
			this.tablaConversiones.put(unidad, new HashMap<String,Function<V,T>>());
		}
	}
	
	
	public void setUnidad(String nuevaunidad) {
		this.tablaConversiones.put(nuevaunidad, null);
	}
	
	public HashMap<String,Function<V,T>> getConversiones(String unidad){
		if(this.tablaConversiones.containsKey(unidad))
			return this.tablaConversiones.get(unidad);
		return null;
	}
	
	public Function<V,T> getConversion(String unidadinicial,String unidadfinal){
		if(!this.tablaConversiones.containsKey(unidadinicial))
			return null;
		HashMap<String,Function<V,T>> conversiones=this.tablaConversiones.get(unidadinicial);
		if(!conversiones.containsKey(unidadfinal))
			return null;
		return conversiones.get(unidadfinal);
		
	}
	
	public void setConversion(String unidadinicial,String unidadfinal, Function<V,T> conversion) {
		this.tablaConversiones.get(unidadinicial).put(unidadfinal, conversion);
	}

	public HashMap<String, HashMap<String, Function<V, T>>> getTablaConversiones() {
		return tablaConversiones;
	}

	public void setTablaConversiones(HashMap<String, HashMap<String, Function<V, T>>> tablaConversiones) {
		this.tablaConversiones = tablaConversiones;
	}
	
	public T convierte(String unidadinicial, String unidadfinal, V medidaenUI) {
		Function<V,T> funConversion=this.getConversion(unidadinicial, unidadfinal);
		if(funConversion==null)
			return null;
		return funConversion.apply(medidaenUI);
	}
	
	
	
	
}
