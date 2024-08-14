package DesafioAndre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioHackathon {

	public static void main(String[] args) {
		
		List<String>compras= new ArrayList<String>();
		ArrayList<Integer>valores= new ArrayList<Integer>();
		String compra;
		int valor, soma = 0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite zero para finalizar a lista de compra");
		do {
		System.out.println("Informe o produto");
		compra = ler.nextLine();
		compras.add(compra);
		try {
		System.out.println("Informe o valor do produto: " + compra);
		valor = ler.nextInt();
		valores.add(valor);
		}catch (java.util.InputMismatchException erro) {
		System.out.println("Só aceitamos números não aceitamos letras");
		}
		}while(compra.equals("0")== false );
		for(int v: valores) {
		soma +=v;
		}
		for(String c: compras ) {
		System.out.print(c+ " ");
		}
		System.out.println("O valor da sua compra foi de: " + soma);
		ler.close();

	}

}
