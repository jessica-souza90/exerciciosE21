package com.exerciciosifelse;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// 6. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
		// A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: 
		// ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.
		
		int senhaAcesso;
		
		Scanner insereSenhaAcesso = new Scanner(System.in);
		
			System.out.println("Digite sua senha: ");
			senhaAcesso = insereSenhaAcesso.nextInt();
			
			if(senhaAcesso == 1234) {
				System.out.println("ACESSO PERMITIDO");
			} else {
				System.out.println("ACESSO NEGADO");
			} 
			insereSenhaAcesso.close();	
	}
}
