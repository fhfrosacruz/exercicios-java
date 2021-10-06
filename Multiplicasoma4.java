import java.io.*;
import java.util.Scanner;

public class Multiplicasoma4{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		
		
		int[]  entrada = new int[4];
	
		
		
		for (int counter=0; counter< 4; counter++){
			
		System.out.println("Digite um numero inteiro:");
		entrada [counter] = input.nextInt();
			
			}
		
				int mult= entrada[0]*entrada[1];
				int mult1= entrada[0]*entrada[2];
				int mult2= entrada[0]*entrada[3];
				int soma= entrada[0]+entrada[1];
				int soma1= entrada[0]+entrada[2];
				int soma2= entrada[0]+entrada[3];
			
			
			for (int counter=0; counter< 4; counter++){
			
			System.out.printf("os numeros são: %d %d\n",counter, entrada[counter]);}
			System.out.printf("soma é: %d\n %d\n %d\n  e a multiplicação é: %d\n %d\n %d ",soma, soma1, soma2, mult, mult1, mult2);
				}
						}

		