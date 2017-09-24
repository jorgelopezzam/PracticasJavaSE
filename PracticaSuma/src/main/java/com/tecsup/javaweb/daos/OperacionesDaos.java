package com.tecsup.javaweb.daos;

public class OperacionesDaos {

	private double resultado;

	public double suma(int numeroUno, int numeroDos) {

		resultado = numeroUno + numeroDos;

		return resultado;

	}

	public double resta(int numeroUno, int numeroDos) {

		resultado = numeroUno - numeroDos;

		return resultado;

	}

	public double multiplicacion(int numeroUno, int numeroDos) {

		resultado = numeroUno * numeroDos;

		return resultado;

	}

	public double division(int numeroUno, int numeroDos) {

		resultado = numeroUno / numeroDos;

		return resultado;

	}

}
