package com.pepe;

import java.util.Scanner;

import com.pepe.animales.Animal;

public class Principal {
	static int num1, num2;
	public static void main(String[] args) {
		System.out.print("Hola mundo");
		System.out.println("Chau mundo");
		
		//Variables
		int numerito;//definición de variable
		numerito = 12;//asignación de valor a variable
		
		float otroNumero = 3.1416f;
		double otrito = 3.1416;
		
		boolean interruptor = false;//true
		String unTexto = "Este es un mensaje";
		
		//Operaciones con variables
		int resultado = numerito + 15;
		float resultado2 = numerito + otroNumero;//int + float
		resultado2 = resultado;
		otrito = numerito + 20;
		resultado = (int)12.9;
		resultado = (int)resultado2 + (int)otrito;// 10.9 + 10.8 => 10+10 = 20
		resultado = (int)(resultado2 + otrito);// 10.9 + 10.8 = 21.7 = 21
		System.out.println(resultado);
		String otroTexto = "Hola a todos";
		String res = unTexto + " " + otroTexto;
		System.out.println(res);
		interruptor = !interruptor;
		System.out.println(interruptor);
		
		//Condicionales
		//Si resultado es mayor que 50, entonces que muestre: "Es mayoria"
		System.out.println("Por favor, introduce un numero:");
		Scanner leer = new Scanner(System.in);
		resultado = leer.nextInt();
		if(resultado > 50) {
			
			System.out.println("Es mayoría");
		}
		
		System.out.println("Fin de la condicional");
		
		//Condicional completa: si-entonces-sino
		
		if(resultado > 50) {
			num1 = 1;
			System.out.println("Es mayoría muchacho");
		}else {
			System.out.println("No es mayoría muchacho");
			num1 = 30;
			num2 = num1 * 4;
			System.out.println("Ya se que es minoria pero toma: " + (num1 + num2));
			if(num1 - num2 <0) {
				//no hace nada
			}
		}
		
		System.out.println("Fin de la condicional");
		System.out.println("Valor de num1: " + num1);
		hallarIntegralDeEcuacion("xyz", 12);
		hallarIntegralDeEcuacion("xyz", resultado);
		hallarIntegralDeEcuacion("xyz", 33);
		hallarIntegralDeEcuacion("xyz", resultado * 2);
		
		
		//Usando objetos de la clase Animal
		Animal mascota1 = new Animal();
		System.out.println("Mi animal es: " + mascota1);
		mascota1.comer();
		mascota1.setCantidadPatas(2);
		mascota1.setNombreEspecie("Loro");
		System.out.println("Mi animal es: " + mascota1.getNombreEspecie());
		
		System.out.println("Mi animal es: " + mascota1);
		
		Animal mascota2 = new Animal();
		mascota2.setCantidadPatas(2);
		mascota2.setNombreEspecie("Loro");
		
		if(mascota1.equals(mascota2))
			System.out.println("Efectivamente, son iguales.");
		else
			System.out.println("No son para nada iguales.");
		
		
		//Otro ejemplo
		Animal mascota3 = mascota1;
		
		mascota1.setNombreEspecie("Colibri");
		if(mascota1.equals(mascota3))
			System.out.println("Efectivamente, son iguales.");
		else
			System.out.println("No son para nada iguales.");
		
		//Pâsando un animal por referencia (a un método)
		System.out.println("Mi animal es: " + mascota3);
		haciendoAlgoConUnObjeto(mascota3);
		System.out.println("Mi animal es: " + mascota3);
		
	}
	
	private static void haciendoAlgoConUnObjeto(Animal mm) {
		Animal aux = new Animal();
		aux.setNombreEspecie("NOMBRE");
		
		mm.setNombreEspecie("Silla");
		mm.setCantidadPatas(9);
		System.out.println("Mira esta mnascota rara: " + mm);
		mm = new Animal();
		mm = aux;
	}

	public static void hallarIntegralDeEcuacion(String expresion, int x) {
		int r = num1 + num2;
		System.out.println(
				"Estoy en el metodo hallarIntegralDeEcuacion y r es: " + r);
	}
}
