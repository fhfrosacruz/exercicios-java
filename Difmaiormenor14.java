import java.util.Scanner;

public class Difmaiormenor14 {
        
   
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       int pri;
       int seg;
       int mm=0;
       int nn=0;
       int dif;
      
       
       System.out.printf("Digite um numero:");
       pri=input.nextInt();
       System.out.printf("Digite um numero:");
       seg=input.nextInt();
       
       if(pri>seg){mm=pri;
                   nn=seg;}
                   else{mm=seg;
                        nn=pri;}
                        
                        dif=mm-nn;
                   
       System.out.printf("A diferença entre os numeros digitados é: %d", dif);
       }
       
       
    }

