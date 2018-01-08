package com.cip.prog;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc_kg = new Scanner(System.in);	//Se crea lector de Kg
		Scanner sc_cm = new Scanner(System.in);	//Se crea lector de cm
		
		System.out.print("Introducir altura: ");	//Mensaje para introducir datos
		double altura = sc_cm.nextDouble();	
		
		System.out.print("Introducir peso: ");	//Mensaje para introducir datos
		double peso = sc_kg.nextDouble();
		
	
		System.out.printf("Su indice de masa corporal es: %.0f", peso/Math.pow(altura,2));
		
		//================ CONTENIDO EXTRA ========================
		if(peso/Math.pow(altura,2) > 25) {
			System.out.println("\n\tEstás gordito :D");
		} else if (peso/Math.pow(altura,2) < 18) {
			System.out.println("\n\\tMándate un bocadillo");
		}
		//============== FIN CONTENIDO EXTRA =================
		

		sc_cm.close();
		sc_kg.close();

	}

}
