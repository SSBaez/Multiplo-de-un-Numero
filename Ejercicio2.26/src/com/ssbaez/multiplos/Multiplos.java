package com.ssbaez.multiplos;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1,
			numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicaci�n que lee dos enteros, y determina si el primero es un m�ltiplo del segundo"
							+ " e imprime el resultado\n");
		System.out.print("Ingrese el primer n�mero entero: ");
		numero1 = input.nextInt();
		System.out.print("Ingrese el segundo n�mero entero: ");
		numero2 = input.nextInt();
		
		if(numero1%numero2 == 0){
			System.out.println(numero2 + " es multiplo de " + numero1);}
		
		else{
			System.out.println(numero2 + " NO es multiplo de " + numero1);
		}
		
	}

}
