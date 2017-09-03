package com.tecsup.practica02.negocio;

public abstract class NegocioDefault implements INegocio {

	
	public void inicializar(String negocio) {
		// TODO Auto-generated method stub
		
		System.out.println("Estoy incializando...");
	}
//
//	@Override
//	public void procesar() {
//		// TODO Auto-generated method stub
//		System.out.println("Estoy procesando...");
//	}

	@Override
	public void finalizar() {
		// TODO Auto-generated method stub
		System.out.println("Finalizando.");
	}

}
