import java.util.Scanner;

public class Notasmedia{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		
		System.out.printf("Digite o numero de alunos:");
		int n=input.nextInt();
		int[] alunos=new int[n];
		int media=0;
		
		
		for(int contador=0;contador<=n; contador++){
			System.out.printf("Digite a nota do aluno: \n");
			alunos[contador]=input.nextInt();
			if(alunos[contador]>=7){
				media=media++;
			}
		}
		
		int mediafinal=media/n;
		System.out.printf("A media dos alunos com nota maior que 7 é: %d \n", mediafinal);
	}
}