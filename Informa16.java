import java.util.Scanner;


public class Informa16 {
 
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       
       int maior=0;
       int menor=0;
       int a=0;
       int b=0;
       
       System.out.printf("Digite um numero:");
       a=input.nextInt();
       System.out.printf("Digite um numero:");
       b=input.nextInt();
       
        if(a==b){System.out.printf("Os numeros digitados %d, %d, são iguais", a, b);}
           if(a>b){maior=a;
                   menor=b;}
               else{maior=b;
                    menor=a;}
                     
                    
                     
               
       System.out.printf("O numero maior é: %d \n O numero menor é: %d", maior, menor);
     
    }
}
