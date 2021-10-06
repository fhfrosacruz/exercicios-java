import java.io.*;
import java.util.Scanner;

public class Estoque1{

public static void main (String args[]){
Scanner input = new Scanner (System.in);
	float min;
	float max;
	float media;	

	System.out.printf("Digite o mumero minimo de pecas do estoque:");
	
	min = input.nextInt();
	System.out.printf("Digite um numero maximo de pecas no estoque:");
	max = input.nextInt();
	media=(min+max)/2;
	System.out.printf("a media de pecas no estoque e: %.2f", media);
					}
			}