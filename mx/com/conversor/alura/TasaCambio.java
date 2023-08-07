package mx.com.conversor.alura;

import java.util.function.Function;
import java.math.BigDecimal;

public class TasaCambio{
	private BigDecimal factorconversion;

//	public static <V,T> Function<V,T> crearTasaCambio(Double d){
//		Function<Double,Double> f=()=>{}
//	}
	

//	public TasaCambio(String factorconversion) {
//		super();
//		this.factorconversion = new BigDecimal(factorconversion);
//	}
//	
//	public TasaCambio(BigDecimal factorconversion) {
//		super();
//		this.factorconversion = factorconversion;
//	}
//
//
//	public BigDecimal getFactorconversion() {
//		return factorconversion;
//	}
//	
//	public String getFactorConversion() {
//		return this.factorconversion.toPlainString();
//	} 
//
//	public void setFactorconversion(BigDecimal factorconversion) {
//		this.factorconversion = factorconversion;
//	}
//	
//	public void setFactorconversion(Double newfactor) {
//		this.factorconversion = new BigDecimal(Double.toString(newfactor));
//	}
//	
//	public void setFactorconversion(String nfc) {
//		this.factorconversion = new BigDecimal((nfc));
//	}
//	
//	@Override
//	public BigDecimal apply(BigDecimal cantidaddiv) {
//		
//		try {
//			return this.factorconversion.multiply(cantidaddiv);
//		}catch(NumberFormatException nfe) {
//			nfe.printStackTrace();
//			return null;
//		}
//	}
//	
//	public BigDecimal apply(Double cantidaddiv) {
//		try {
//			return this.factorconversion.multiply(new BigDecimal(Double.toString(cantidaddiv)));
//		}catch(NumberFormatException nfe) {
//			nfe.printStackTrace();
//			return null;
//		}
//		
//		
//	}
//	
//	public BigDecimal apply(String cantidaddiv) {
//		try {
//			return this.factorconversion.multiply(new BigDecimal(cantidaddiv));
//		}catch(NumberFormatException nfe) {
//			nfe.printStackTrace();
//			return null;
//		}
//		
//	}
}
