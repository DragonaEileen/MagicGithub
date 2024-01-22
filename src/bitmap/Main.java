package bitmap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		System.out.println("Hello, Github Desktop!");
		
		/* Declaraciones */
			/* Valor que seguirá la proporción aurea */
		double bAurea;
		
			/* Valor 1 a comprobar si es aureo */
		double magic1;
		
			/* Valor 2 a comprobar si es aureo */
		double magic2;
		
		/* Apertura de Scanner */
		Scanner sc = new Scanner(System.in);

		/* Pedimos numero magico */
		System.out.println("Introduce número mágico 1:");
		magic1 = sc.nextDouble();
		
		System.out.println("Introduce número mágico 2:");
		magic2 = sc.nextDouble();
		
		/* Comprobamos que número mágico es aureo */
		System.out.println("Los números son aureos:" + MagicMethods.combrobarMagia(magic1, magic2));
		
		/* Comprobamos apartir de un número */
		System.out.println("Para un 10, su segundo segmento sería: " + MagicMethods.buscaAU(10));
		
		/* Cierre Scanner */
		sc.close();
		
		
	}

}
