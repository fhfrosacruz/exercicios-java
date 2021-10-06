import java.util.Scanner;

public class Escolha18 {
  
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       int codigo;
       
       System.out.printf("Escolha uma opção para o código [1, 2, 3]: \n");
       codigo=input.nextInt();
       
      
       switch (codigo)
       	{
       	case 1:
       		System.out.printf("UM");
       		break;
       
        case 2:
        	System.out.printf("DOIS");
        	break;
        
        case 3:
        	System.out.printf("TRÊS");
        	break;
        	
        default:
        	System.out.printf("opção invalida");
       }
      
    }
}
