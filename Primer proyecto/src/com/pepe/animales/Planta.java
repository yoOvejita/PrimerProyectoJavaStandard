package com.pepe.animales;

public class Planta implements SerVivo{
	String tipoDeAgua;

	public String getTipoDeAgua() {
		return tipoDeAgua;
	}

	public void setTipoDeAgua(String tipoDeAgua) {
		this.tipoDeAgua = tipoDeAgua;
	}

	@Override
	public void respirar() {
		System.out.println("Respiro por ...");
	}

	@Override
	public int tiempoDeVida() {
		// TODO Auto-generated method stub
		return 40;
	}
	
}
