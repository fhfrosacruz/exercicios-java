import java.io.*;
import java.util.Scanner;






public class Relacionamentonumeros10 {
        
  
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
    	
    	int num1;
    	int num2;
    	
    	System.out.printf("Digite um numero inteiro:");
    	num1 = input.nextInt();
    	System.out.printf("Digite um numero inteiro:");
        num2 = input.nextInt();
        
        System.out.printf("Os numeros digitados: %d e %d", num1, num2);
    	
    	if(num1==num2){
    		System.out.printf("\nEsses numeros são iguais");}
    			else{
    			 
    				System.out.printf("\nEsses numeros não são iguais");}
    				    	
    	if(num1>num2){
    		System.out.printf("\nO primeiro numero é maior que o segundo numero digitado");}
    			
    			else{
    			
    				System.out.printf("\nO segundo numero é maior que o primeiro numero digitado");}
    				
        
}
}
