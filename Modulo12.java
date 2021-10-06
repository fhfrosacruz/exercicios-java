import java.io.*;
import java.util.Scanner;

public class Modulo12 {
   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.printf("Digite um numero, para exibir seu módulo");
      float num=input.nextInt();
      
      float mod=num/2;
      
     
       		
       		System.out.printf("O modulo é: %.2f", mod);
       }
    }

