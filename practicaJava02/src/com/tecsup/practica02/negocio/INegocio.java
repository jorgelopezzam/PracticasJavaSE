package com.tecsup.practica02.negocio;

public interface INegocio {
	
	public final static String EDUCATIVO = "Escuela";
	public final static String COMERCIAL = "Centro Comercial";
	public final static String TRANSPORTE = "Aviones";
	
	public void inicializar();
	public void procesar();
	public void finalizar();

}
