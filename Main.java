package operadoresdeatribuicaocumulativaa;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
// Problema Exemplo:Uma operadora de telefonia cobra R$70.00 por um plano básico
// que dá direito a 100 minutos de telefone.Cada Minuto que exceder a franquia de 100 minutos custaR$2.00.
//Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,daí mostrar o valor a ser pago.
	
		Locale.setDefault(Locale.US); //Formatação dos Eua
		Scanner sc=new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 70.0;
		if(minutos >100) {
			conta +=(minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n",conta);
		
		
		sc.close();
		
	}

}
