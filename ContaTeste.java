public class ContaTeste{

	public ContaTeste{
		private String nome, numero;
		private double saldo;
		
		public Conta(String nome, String numero){
			this.nome=nome;
			this.numero=numero;
			saldo=100.00;
		}
		
	}
	
	public void sacar(double valor){
		saldo=saldo-valor;
	}
	public void depositar(double valor){
		saldo=saldo+valor;
	}
	
	public double consultarsaldo(){
		return saldo;
	}
	public String consultarnome(){
		return nome;
	}
	
	public void alternome(String nome){
		this.nome=nome;
	}
	    
	    
	
		public static void main (String args[]){
			
			System.out.printf("vamos criar uma conta\n digite o nome da conta\n");
			
			String nome=input.nextString();
			
			System.out.printf("vamos criar uma conta\n digite o numero da conta\n");
			
			String numero=input.nextString();
			
			ContaTeste c1=new ContaTeste (nome,numero);
			
			do{
				System.out.printf("escolha 1 para sacar um valor\n 2 para depositar um valor \n 3 para consultar o saldo da conta \n 4 para consultar o nome da conta \n 5 para alterar o nome da conta \n');
				
				int esc=input.nextInt();
				
				
				
				
				switch(esc){
				
				       case 1: System.out.printf("Digite um valor para sacar");
				             Double x= input.nextDouble();
				             
				             c1.sacar(x);
				             break;
				       case 2      
				                     
				           }
				 }while(esc!=4);
			
			
		}
		
		
		
		
}		
		
		



