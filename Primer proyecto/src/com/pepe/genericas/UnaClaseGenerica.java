package com.pepe.genericas;

public class UnaClaseGenerica <T, U>{
	T objetito;
	U objetito2;
	public void setObjeto(T obj) {
		
		objetito = obj;
	}
	public void setObjetos(T obj, U obj2) {
		
		objetito = obj;
		objetito2 = obj2;
	}
	public T getObjeto() {
		return objetito;
	}
	public U getObjeto(T llave) {
		return objetito2;
	}
	
	public static <R> R devolverModificado(R objeto) {
		return objeto;
	}
}
