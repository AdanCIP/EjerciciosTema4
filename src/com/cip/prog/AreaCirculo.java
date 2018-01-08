package com.cip.prog;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc_radio = new Scanner(System.in);	//Se crea lector de radio	
		
		System.out.print("Introducir radio: ");	//Mensaje para introducir datos
		double radio = sc_radio.nextDouble();
			
		System.out.println("El área del circulo es: " + Math.PI*Math.pow(radio, 2));
		
		sc_radio.close();
	}

}
