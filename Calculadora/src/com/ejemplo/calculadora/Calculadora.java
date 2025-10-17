package com.ejemplo.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double n1,n2;
		System.out.println("Introduce un número: ");
		n1=sc.nextDouble();
		System.out.println("Introduce otro número: ");
		n2=sc.nextDouble();
		
	}
	public static double Sumar(double n1,double n2) {
		return n1+n2;
	}

}
