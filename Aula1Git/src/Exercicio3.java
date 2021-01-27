import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Cria��o do Scanner pois ser� necess�rio ler 3 valores pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//Mensagem pedindo para digitar o n�mero inicial
		System.out.println("Digite o n�mero inicial: ");
		//Leitura do valor inicial
		int inicio = sc.nextInt();
		
		//Mensagem pedindo para digitar o n�mero inicial
		System.out.println("Digite a quantidade de n�meros que deseja: ");
		//Leitura do valor inicial
		int qtde = sc.nextInt();

		//Mensagem pedindo para digitar o n�mero inicial
		System.out.println("Digite a raz�o (quantidade a ser somada entre os n�meros): ");
		//Leitura do valor inicial
		int razao = sc.nextInt();
		
		//Constru��o do comando FOR para fazer a repeti��o de acordo com a
		//quantidade "qtde" que foi informada
		for(int i=0 ; i<qtde ; i++) {
			//Imprimindo o primeiro valor da sequ�ncia
			System.out.print(inicio + " ");
			
			//Atualizando o pr�ximo valor da sequ�ncia com a soma da raz�o
			inicio = inicio + razao;
		}
		
//		//Somente uma mensagem para separar o resultado do for e while
//		System.out.println("\n\nIn�cio do resultado do comando while");
//		//Exemplo utilizando o comando while
//		int controle = 0;
//		while(controle < qtde) { //Enquanto o campo "controle" n�o chegar na qtde informada
//			//Imprimindo o primeiro valor da sequ�ncia
//			System.out.print(inicio + " ");
//			
//			//Atualizando o pr�ximo valor da sequ�ncia com a soma da raz�o
//			inicio = inicio + razao;
//			
//			controle++;
//		}				
	}
}
