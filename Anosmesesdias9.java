import java.util.*;
import java.util.Scanner;


public class Anosmesesdias9 {

    public static void main (String args[]) {
    	Scanner input=new Scanner (System.in);
    	
    	
    	System.out.printf("Digite quantos anos voc� tem:");
    	int ano=input.nextInt();
    	System.out.printf("\n Digite quantos meses voc� tem:");
    	int mes=input.nextInt();
    	System.out.printf("Digite quantos dias voce tem:");
    	int dias=input.nextInt();
    	
    	int diastotal=(ano*365)+(mes*30)+dias;
    	
    	System.out.printf("Seus dias totais na Terra s�o: %d dias", diastotal);
    
    	}
    }
    
    
