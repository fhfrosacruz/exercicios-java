import java.util.*;
import java.util.Scanner;

public class Vetor4{


	public static void main (String args[]) {
	
		Scanner input=new Scanner (System.in);
			
			int Vetor[]= new int[4];
			int mult[]=new int[4]; 
			int soma[]=new int[4];
			
			for(int counter=0; counter<4;counter++){
				System.out.printf("Digite um numero inteiro:");
				Vetor[counter]=input.nextInt();
			}
			
			for(int counter=1;counter<4;counter++){
				mult[counter]=Vetor[0]*Vetor[counter];
				
			}
			for(int counter=1;counter<4;counter++){
				soma[counter]=Vetor[0]+Vetor[counter];
				
				}
					for(int counter=0; counter<4;counter++){
				System.out.printf("os dados do vetor %d\n", Vetor[counter]);
				}
			for(int counter=1; counter<4;counter++){
				System.out.printf("os dados do vetor multiplicacao sao: %d\n", mult[counter]);
				}
				for(int counter=1; counter<4;counter++){
				System.out.printf("os dados do vetor soma sao: %d\n", soma[counter]);
				}
}

				
}			