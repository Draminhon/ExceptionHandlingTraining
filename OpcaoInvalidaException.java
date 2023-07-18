package com.murilo.training;

public class OpcaoInvalidaException extends Exception {


		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
		return "Entrada invalida, tente novamente!";
		}

}
