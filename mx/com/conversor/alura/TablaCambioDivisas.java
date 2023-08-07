package mx.com.conversor.alura;
import mx.com.conversor.alura.TasaCambio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.com.conversor.alura.TablaConversion;
public class TablaCambioDivisas {
	
	private TablaConversion<Double,Double> tabladivisas;
	
	public TablaCambioDivisas(String[] listadivisas) {
		tabladivisas=new TablaConversion<>(listadivisas);
	}
	
	public TablaCambioDivisas(List<String> listadivisas) {
		tabladivisas=new TablaConversion<>(listadivisas);
	}
	
	public TablaCambioDivisas() {
		String[] divisas= {"MXN","USD","JPY","GBP","KRW","EUR"};
		this.tabladivisas=new TablaConversion<>(divisas);
//		BigDecimal factConv;
//		this.tabladivisas.setConversion("MXN","USD",(BigDecimal bd)->(factConv*bd));
	}
	
	
	
	

}
