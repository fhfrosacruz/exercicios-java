import java.util.Scanner;

public class Escolha18 {
  
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       
       int codigo;
       
       System.out.printf("Escolha uma op��o para o c�digo [1, 2, 3]: \n");
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
        	System.out.printf("TR�S");
        	break;
        	
        default:
        	System.out.printf("op��o invalida");
       }
      
    }
}
