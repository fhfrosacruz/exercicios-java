import java.io.*;
import java.util.Scanner;

public class ConsumoLitros5{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		System.out.printf("Informe o tempo gasto na viagem:");
			double Tempo= input.nextDouble();
		System.out.printf("Informe a velociade m�dia do carro:");
		    double Velm= input.nextDouble();
		
		double Distancia=Tempo*Velm;
		double Litros=Distancia/12;

		System.out.printf("Com o tempo de viagem %.2f horas, h� uma velocidade m�dia de %.2f Km, a distancia percorrida ser� de %.2f Km, e o consumo de combustivel ser� de %.2f litros", Tempo, Velm, Distancia, Litros);


				}
						}

		