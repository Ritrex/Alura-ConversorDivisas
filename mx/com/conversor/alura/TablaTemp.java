package mx.com.conversor.alura;
import java.util.List;
import java.util.function.Function;

import mx.com.conversor.alura.TablaConversion;
public class TablaTemp{
	

	private TablaConversion<Double,Double> temperaturas;
	
	public TablaTemp() {
		String[] unidadesTemp ={"C","K","F"};
		temperaturas=new TablaConversion<>(unidadesTemp);
		for(String temp: unidadesTemp)
			temperaturas.setConversion(temp, temp, (Double d)->d);
		temperaturas.setConversion("C","K",(Double c)->c+273.15);
		temperaturas.setConversion("K","C",(Double k)->k-273.15);
		temperaturas.setConversion("C", "F",(Double c)->(c*(9.0/5.0))+32);
		temperaturas.setConversion("F", "C", (Double f)->((f-32)*(5.0/9.0)));
		Function<Double,Double> k2f=temperaturas.getConversion("K", "C").andThen(temperaturas.getConversion("C", "F"));
		Function<Double,Double> f2k=temperaturas.getConversion("F", "C").andThen(temperaturas.getConversion("C", "K"));
		temperaturas.setConversion("K", "F",k2f);
		temperaturas.setConversion("F", "K", f2k);
	}

	public TablaConversion<Double, Double> getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(TablaConversion<Double, Double> temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	
}
