package mx.com.conversor.alura;
import java.util.function.Function;
public class TestFuncFact {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double,Function<Double,Double>> f=tasa->cantidad->tasa*cantidad;
		Double tasa=2.0;
		Function<Double,Double> funcambio=f.apply(3.0);
		
		Function<Double,Double> funcambio2=f.apply(2.0);
		System.out.println("Funcion1: "+funcambio+" divisa al cambio: "+funcambio.apply(3.0));
		System.out.println("Funcion2: "+funcambio2+" divisa al cambio: "+funcambio2.apply(3.0));
	}

}
	