import java.util.Scanner;

public class Entrenum17 {
   
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       
       int num;
       
       System.out.printf("Digite um numero para saber se ele esta entre 0 e 9 \n");
       num=input.nextInt();
       
       if(num>=0 && num<=9){System.out.printf("O Numero %d, esta entre 0 e 9", num);
       }
       else{System.out.printf("O numero digitado não esta entre 0 e 9");
       }
    }
}
