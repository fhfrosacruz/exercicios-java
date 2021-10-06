import java.util.Scanner;

public class Notasmedia15 {
  
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       Double notas[]=new Double[4];
       Double recup;
       
       
       for(int cont=0;cont<=3;cont++){System.out.printf("Digite uma nota:");
                                         notas[cont]= input.nextDouble();}  
       
       for(int cont=0;cont<=3;cont++){if(notas[cont]>=7){System.out.printf("Aluno aprovado!!! %.1f \n", notas[cont]);}
                                        else{System.out.printf("Digite a nota da recuperação do aluno: %.1f \n", notas[cont]);
                                        	recup=input.nextDouble();
                                        	notas[cont]=notas[cont]+recup;}
                                        	}
                                        	
                                         
       for(int cont=0;cont<=3;cont++){if(notas[cont]>=7){System.out.printf("Aluno aprovado!!! %.1f \n", notas[cont]);}
                                          else{System.out.printf("Aluno Reporovado:  %.1f \n", notas[cont]);}
      
                                                                                                                       }
       
    }
}
