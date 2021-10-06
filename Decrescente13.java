import java.io.*;
import java.util.Scanner;


public class Decrescente13 {
        
  
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
     
     int a, b, c;
     int um=0, dois=0, tres=0;
     
     System.out.printf("Digite um numero:");
     a=input.nextInt();
      System.out.printf("Digite um numero:");
      b= input.nextInt();
       System.out.printf("Digite um numero:");
       c= input.nextInt();
       
       if(a>b && a>c){um=a;}
              if(b>c){dois=b;
                         tres=c;}
                                   else{dois=c;
                                            tres=b;
                                                     }
             
       	if(b>a && b>c){um=b;}
       	     if(a>c){dois=a;
       	               tres=c;}
       	                      else{dois=c;
       	                             tres=a;
       	                                     }
       	     
       	  if(c>a && c>b){um=c;}
       	      if(a>b){dois=a;
       	                 tres=b;}
       	                        else{dois=b;
       	                               tres=a;
       	                                       }
       	      
       	  
       	
       
       System.out.printf("Os numeros digitados em ordem decrescente são: %d, %d, %d", um, dois, tres);
       
       }
       
     
  }

