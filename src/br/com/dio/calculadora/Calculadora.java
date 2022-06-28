package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("digite el primer numero");
		a = scan.nextInt();
		System.out.println("digite el segundo numero");
		b = scan.nextInt();
		
		int soma = soma (a,b);
		int resta = resta (a,b);
		int multiplicacion = multiplicacion  (a,b);
		int division = division (a,b);
		
		System.out.println("soma" + soma);
		System.out.println("resta" + resta);
		System.out.println("multiplicacion" + multiplicacion);
		System.out.println("division" + division);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int division(int a, int b) {
		return a / b;
	}
	public static int multiplicacion(int a, int b) {
		return a * b;
	}
}
