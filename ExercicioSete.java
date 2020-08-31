package com.exerciciosifelse;
import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		/* As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$0,25 se forem compradas pelo menos doze. 
		 * Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
		 */
		
		int quantidadeMacas;
		double calculaMacas;
		Scanner compraMacas = new Scanner(System.in);
		
		System.out.println("Quantas maçãs deseja comprar? ");
		quantidadeMacas = compraMacas.nextInt();

		if(quantidadeMacas <= 11) {
			calculaMacas = (quantidadeMacas * 0.30);
			System.out.println("Foram compradas " + quantidadeMacas + " maçãs por R$" + calculaMacas + ".");
		} else if (quantidadeMacas >= 12) {
			calculaMacas = (quantidadeMacas * 0.25);
			System.out.println("Foram compradas " + quantidadeMacas + " maçãs por R$" + calculaMacas + ".");
		}
		compraMacas.close();
	}

}
