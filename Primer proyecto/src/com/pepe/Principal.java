package com.pepe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import com.pepe.animales.Animal;
import com.pepe.animales.Mascota;
import com.pepe.animales.Planta;
import com.pepe.animales.SerVivo;
import com.pepe.genericas.UnaClaseGenerica;

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
		if(resultado > 50 ) 
		System.out.println("Es mayoría");
			
			
		
		
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
		
		if("abc" == "xyz")
			System.out.println();
		
		if("abc".equals("xyz"))
			System.out.println();
		
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
		
		//Herencia
		System.out.println("Herencia ");
		com.pepe.animales.Mascota perro = new com.pepe.animales.Mascota();
		perro.moverse();
		perro.setNombreEspecie("Perro");
		perro.setNombrePropio("Rintintin");
		System.out.println("El perro es: " + perro);
		
		Object objeto = perro;
		Object[] arregloObjetos = new Object[3];
		arregloObjetos[0] = perro;
		arregloObjetos[1] = "hola";
		arregloObjetos[2] = false;
		
		for(int i = 0; i < 3; i++)
			System.out.println("El objeto es: " + arregloObjetos[i]);
		
		Animal an = new Mascota();
		an.setNombreEspecie("perro");
		Mascota ms = (Mascota)an;
		
		ms.setNombrePropio("Snoopy");
		System.out.println("La mascota es: " + ms);
		Animal an2 = ms;
		System.out.println("El animal es: " + an2);
		//Mascota mmm = new Animal();//No funcviona
		
		//Agregando interfaces
		System.out.println("Interfaces ");
		Mascota masc = new Mascota();
		masc.respirar();
		
		Planta coca = new Planta();
		
		SerVivo[] ser = {masc, coca};
		
		ser[0].respirar();
		
		SerVivo unSer = coca;
		List<String> listita = new LinkedList<String>();
		listita.add("uno");
		listita.add("dos");
		listita.add("tres");
		listita.remove(1);//removiendo "dos"
		listita.remove("dos");
		
		for(String elemento : listita)
			System.out.println(elemento);
		
		for(int i = 0 ; i < listita.size(); i++)
			System.out.println(listita.get(i));
		
		
		//Estructuras de datos
		//Listas: uno despues de otro
		//Colas: (FIFO - First In, First Out)
		//Pilas: (LIFO - Last In, First Out)
		
		//INFIX: X + Y
		//PREFIX: + X Y
		//POSTFIX: X Y +
		
		// 3 + 7 * ( 5 / 6 + 2 )
		
		
		/*
		 * 3 Y +
		 * 3 [7 * ( 12 / 6 + 2 )] +
		 * 3 7 ( 5 / 6 + 2 ) * +
		 * 3 7 W 2 + * +
		 * 3 7 5 6 / 2 + * +
		 * 
		 * POSTFIX:
		 * PILA: 31
		 * MANO: +
		 * A:  3 
		 * B: 28 
		 * RES: 31
		 * 
		 * 
		 * */
		Scanner leer2 = new Scanner(System.in);
		System.out.println("INFIX a POSTFIX\nIntroduzca una expresion aritmetica:");
		String infix = leer2.nextLine();
		
		String postfix = convertirInfixApostfix(infix);
		System.out.println("Postfix: " + postfix);
		int resultadoOp = operarPostfix(postfix);
		System.out.println("Resultado: " + resultadoOp);
		
		//Clases genéricas
		List miLista = new ArrayList();
		miLista.add(15);
		miLista.add(postfix);
		miLista.add(masc);
		
		List<String> miListaDeCadenas = new ArrayList<String>();
		miListaDeCadenas.add("ccc");
		miListaDeCadenas.add(masc + "");
		
		List<Mascota> listaMas = new LinkedList<Mascota>();
		listaMas.add(masc);
		listaMas.add(new Mascota(4,"Perro","Snoopy", false));
		
		for(Mascota m : listaMas)
			System.out.println(m);
		new Mascota().comer();
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(72011111, "Pepe");
		mapa.put(72011111, "Sofia");
		mapa.put(2353535, "Pepe");
		
		
		System.out.println(mapa.size());
		System.out.println(mapa.get(2353535));
		System.out.println(mapa.get(72011111));
		
		UnaClaseGenerica<Integer,Mascota> clase1 = new UnaClaseGenerica<Integer,Mascota>();
		clase1.setObjetos(23,listaMas.get(1));
		System.out.println(clase1.getObjeto(23));
		
		System.out.println(UnaClaseGenerica.devolverModificado(masc));
		
		Queue<Mascota> cola = new LinkedList<Mascota>();
		cola.add(new Mascota());//añadimos a la cola
		Mascota a =cola.poll();//extraemos de la cola
	}
	
	private static int operarPostfix(String postfix) {
		/*
		 * si son numeros -> a la pila
		 * si son operadores --> operamos con numeros de la pila
		 * 
		 * 
		 * */
		String[][][] cubo = new String[3][3][8];
		String[][] tablero = new String[4][3];
		/*
		 * [][][] [][][] [][][]
		 * [][][] [][][] [][][]
		 * [][][] [][][] [][][] 
		 * [][][] [][][] [][][]
		 * 
		 * [][][][]
		 * [][][][]
		 * [][][][]
		 * 	 * */
		
		Stack<Integer> pila = new Stack<Integer>();
		String[] tokens = postfix.trim().split(" ");// "3 4 +"
		for(String token : tokens) {
			switch(token) {
			case "+": case "-": case "*": case "/": case "%": case "^":
				int r = 0, x , y;
				y = pila.pop();
				x = pila.pop();
				switch(token) {
					case "+":
						r = x + y;
					break;
					case "-":
						r = x - y;
					break;
					case "*":
						r = x * y;
					break;
					case "/":
						r = x / y;
					break;
					case "%":
						r = x % y;
					break;
					case "^":
						r = (int)Math.pow(x, y);
					break;
				}
				
				pila.push(r);
				
				
				break;
				
				
			default://es numero
				pila.push(Integer.parseInt(token));
				break;
			}
			
		}
		return pila.pop();
	}

	private static String convertirInfixApostfix(String infix) {
		String post = "";
		infix += " )";
		String[] tokens = infix.split(" ");// 3, +, 5, )
		Stack<String> pila = new Stack<String>();
		pila.push("(");
		int indice = 0;
		
		
		/*
		 * INFIX -> POSTFIX
		 * 
		 * 1. Agregamos un paréntesis de cierre a la expresión.
		 * 2. Agregamos un paréntesis de apertura a la pila.
		 * 3. Recorremos elemento a elemento nuestro infix.
		 * 4. Mientras la pila no este vacía, sacamos  a la mano el primer elemento de la expresión:
		 * 	si en la mano hay un número: lo ponemos en la expresión postfix
		 *  si en la mano hay un paréntesis apertura: ponemos en la  pila
		 *  si en la mano hay un operador:
		 *  	si en la cima de la pila hay un operador:
		 *  		si el op de la pila es mayor o igual, lo sacamos y ponemos en postfix
		 *  	repetimos hasta que no hayan operadores o hasta que el op sea menor
		 *  	finalmente poner el operador de la mano en la pila.
		 *  si en la mano hay un paréntesis cierre: sacamos los elementos de la pìla, uno a uno,
		 *    y los concatenamos a postfix, esto hasta encontrar un paréntesis de apertura.
		 * 
		 * 
		 * */
		String mano = ""; 
		while(pila.size() > 0) {
			mano = tokens[indice++];
			switch(mano) {
			case "(":
				pila.push(mano);
				break;
			case ")":
				String elem = pila.pop();
				while(!elem.equals("(")) {
					post += " " + elem;
					elem = pila.pop();
				}
				break;
			case "+": case "-": case "*": case "/": case "%": case "^":
				while(esOperador(pila.peek())) {
					if(esOperadorMayor(pila.peek(),mano)) {
						post += " " + pila.pop();
					}
					else
						break;
				}
				pila.push(mano);
				break;
			default://es un numero
				post += " " + mano;
				break;
			}
		}
		
		
		return post;
	}

	private static boolean esOperadorMayor(String op1, String op2) {
		/*
		 * ^
		 * / % *
		 * + -
		 * */
		if("+-".contains(op1))
			return false;
		if(op2.equals("^"))
			return false;
		if("/*%".contains(op1)&&"/*%^".contains(op2))
			return false;
		return true;
	}

	private static boolean esOperador(String simbolo) {
		// ( 1...9000 + -...
		String operadores = "+-*/%^";
		return operadores.contains(simbolo);
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
		expresion = "abc";
		System.out.println(
				"Estoy en el metodo hallarIntegralDeEcuacion y r es: " + r);
	}
}
