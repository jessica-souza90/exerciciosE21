package com.exerciciosifelse;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// 6. Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. 
		// A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens: 
		// ACESSO PERMITIDO caso a senha seja v�lida. ACESSO NEGADO caso a senha seja inv�lida.
		
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
