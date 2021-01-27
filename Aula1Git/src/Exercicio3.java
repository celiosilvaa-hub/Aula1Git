import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Criação do Scanner pois será necessário ler 3 valores pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//Mensagem pedindo para digitar o número inicial
		System.out.println("Digite o número inicial: ");
		//Leitura do valor inicial
		int inicio = sc.nextInt();
		
		//Mensagem pedindo para digitar o número inicial
		System.out.println("Digite a quantidade de números que deseja: ");
		//Leitura do valor inicial
		int qtde = sc.nextInt();

		//Mensagem pedindo para digitar o número inicial
		System.out.println("Digite a razão (quantidade a ser somada entre os números): ");
		//Leitura do valor inicial
		int razao = sc.nextInt();
		
		//Construção do comando FOR para fazer a repetição de acordo com a
		//quantidade "qtde" que foi informada
		for(int i=0 ; i<qtde ; i++) {
			//Imprimindo o primeiro valor da sequência
			System.out.print(inicio + " ");
			
			//Atualizando o próximo valor da sequência com a soma da razão
			inicio = inicio + razao;
		}
		
//		//Somente uma mensagem para separar o resultado do for e while
//		System.out.println("\n\nInício do resultado do comando while");
//		//Exemplo utilizando o comando while
//		int controle = 0;
//		while(controle < qtde) { //Enquanto o campo "controle" não chegar na qtde informada
//			//Imprimindo o primeiro valor da sequência
//			System.out.print(inicio + " ");
//			
//			//Atualizando o próximo valor da sequência com a soma da razão
//			inicio = inicio + razao;
//			
//			controle++;
//		}				
	}
}
