import java.io.*;
import java.util.Scanner;

public class Volumeoleo8{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.printf("Digite o Raio (metade da circunferencia)do objeto:");
			double Raio= input.nextDouble();
		System.out.printf("Digite altura do objeto:");
			double Alt= input.nextDouble();

			double Vol=((3.14159*Raio)*Raio) * Alt;

		System.out.printf("O Volume total do objeto é de: %.5f litros", Vol);
	
				}
						}

		