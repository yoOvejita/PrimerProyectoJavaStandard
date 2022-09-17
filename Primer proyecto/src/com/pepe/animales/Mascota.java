package com.pepe.animales;

public class Mascota extends Animal implements SerVivo {
	String nombrePropio;
	boolean vacunadoContraRabia;
	
	public Mascota() {
		
	}
	public Mascota(int cantPatas, String nombreEsp, String nombrePropio, boolean vacunado) {
		super(cantPatas,nombreEsp);
		this.nombrePropio = nombrePropio;
		vacunadoContraRabia = vacunado;
	}
	public String getNombrePropio() {
		return nombrePropio;
	}
	public void setNombrePropio(String nombrePropio) {
		this.nombrePropio = nombrePropio;
	}
	public boolean isVacunadoContraRabia() {
		return vacunadoContraRabia;
	}
	public void setVacunadoContraRabia(boolean vacunadoContraRabia) {
		this.vacunadoContraRabia = vacunadoContraRabia;
	}
	
	public String toString() {
		String txt = "";
		txt = "Una mascota "+ nombreEspecie + " que cuenta con " + cantidadPatas + " patas y responde al no,mbre de " + nombrePropio;
		return txt;
	}
	@Override
	public void respirar() {
		System.out.println("Estoy respirando porque soy un ser vivo");
		
	}
	@Override
	public int tiempoDeVida() {
		return 20;
	}
	
	public boolean comparar(Mascota otro) {
		return cantidadPatas == otro.cantidadPatas;
	}
	
}
