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
    		System.out.printf("\nEsses numeros s�o iguais");}
    			else{
    			 
    				System.out.printf("\nEsses numeros n�o s�o iguais");}
    				    	
    	if(num1>num2){
    		System.out.printf("\nO primeiro numero � maior que o segundo numero digitado");}
    			
    			else{
    			
    				System.out.printf("\nO segundo numero � maior que o primeiro numero digitado");}
    				
        
}
}
