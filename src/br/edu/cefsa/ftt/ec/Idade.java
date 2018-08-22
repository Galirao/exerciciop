package br.edu.cefsa.ftt.ec;

import java.util.Scanner;

public class Idade {

		public static void main(String[] args) {
		System.out.println("idade:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe seu ano de nascimento");;
		try {
			System.out.println("sua idade é:  "+(2018 - scanner.nextInt()));
			}catch (Exception e) {
				System.err.println("e caraio");
				e.printStackTrace();
				}
		scanner.close();
		}
}
