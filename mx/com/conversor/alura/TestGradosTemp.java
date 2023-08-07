package mx.com.conversor.alura;

import java.util.function.Function;

import mx.com.conversor.alura.TablaConversion;
import mx.com.conversor.alura.TablaTemp;


public class TestGradosTemp {

	public static void main(String[] args) {
		TablaTemp temps= new TablaTemp();
		pruebas(temps);
		
	}
	
	public static void pruebas(TablaTemp tablatemp) {
		TablaConversion<Double,Double> t=tablatemp.getTemperaturas();
		System.out.println("Convirtiendo 100F a C. Se espera 37.77 aprox:"+t.convierte("F", "C", 100.0));
		System.out.println("Convirtiendo 100C a F. Se espera 212 aprox:"+t.convierte("C","F", 100.0));
		System.out.println("Convirtiendo 100K a F. Se espera -279.67 aprox:"+t.convierte("K", "F", 100.0));
		System.out.println("Convirtiendo 100F a K. Se espera 310.928 aprox:"+t.convierte("F", "K", 100.0));
		Double d=2.0;
		Function<Double,Double>f=(Double dd)->d*dd;
		System.out.println("Probando lambda a funcion"+f.apply(2.0));
		
	}
	
	public static Function<Double,Double> crearFunc(){
		return null;
	}
	
	
	
}
