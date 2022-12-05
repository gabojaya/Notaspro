

import java.util.Arrays;
import java.util.Scanner;

public class Deber {

	/**
	 * 
	 * @param lado2
	 * @return
	 */
	public static boolean verificarDerrota(String[] lado1, String[] lado2) {
		boolean bandera2 = true;
		if((lado1[0].equals("observador"))) {
			bandera2 = true;
		}else if ((lado1[1].equals("lobo")) && (lado1[2].equals("caperucita"))) {
			System.out.println("El lobo se comio a la caperucita, Perdiste!!");
			bandera2 = false;
			return bandera2;
		} else if ((lado1[2].equals("caperucita")) && (lado1[3].equals("uvas"))) {
			System.out.println("La Caperucita se comio las uvas, Perdiste!!");
			bandera2 = false;
			return bandera2;
		}
		if((lado2[0].equals("observador"))) {
			bandera2 = true;
		}else if ((lado2[1].equals("lobo")) && (lado2[2].equals("caperucita"))) {
			System.out.println("El lobo se comio a la caperucita, Perdiste!!");
			bandera2 = false;
			return bandera2;
		} else if ((lado2[2].equals("caperucita")) && (lado2[3].equals("uvas"))) {
			System.out.println("La Caperucita se comio las uvas, Perdiste!!");
			bandera2 = false;
			return bandera2;
		}
		if ((lado2[0].equals("observador")) && (lado2[1].equals("lobo")) && (lado2[2].equals("caperucita"))
				&& (lado2[3].equals("uvas"))) {
			System.out.println("Lograste pasar a todos, Felicidades ganaste!!");
			bandera2 = false;
		}
		return bandera2;
	}

	/**
	 * 
	 * @param lado2
	 * @param bandera
	 * @return
	 */
	public static void main(String[] args) {

		String[] lado1 = { "observador", "lobo", "caperucita", "uvas" };
		String[] bote = { "vacio", "vacio", "vacio", "vacio" };
		String[] lado2 = { "vacio", "vacio", "vacio", "vacio" };
		String palabraEscrita;
		boolean bandera = true;
		Scanner ingresoDatos = new Scanner(System.in);
		// Inicio
		System.out.println("Contigo estan " + Arrays.toString(lado1));
		System.out.println(
				"Se quiere cruzar un rio pero sin que el lobo se coma a la caperucita y la caperucita se coma las uvas");
		while (bandera == true) {
			System.out.println("Escriba el nombre de que objeto/persona va a subir al bote");
			palabraEscrita = ingresoDatos.nextLine().toLowerCase();
			switch (palabraEscrita) {
			case "observador":
				lado2[0] = lado1[0];
				lado1[0] = bote[0];
				break;
			case "lobo":
				lado2[1] = lado1[1];
				lado1[1] = bote[1];
				break;
			case "caperucita":
				lado2[2] = lado1[2];
				lado1[2] = bote[2];
				break;
			case "uvas":
				lado2[3] = lado1[3];
				lado1[3] = bote[3];
				break;

			default:
				break;
			}
	
			//Regreso
			System.out.println("En la orilla estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			System.out.println("Desea regresar con alguien? SI/NO");
			palabraEscrita = ingresoDatos.nextLine().toLowerCase();
			if (palabraEscrita.equals("si")) {
				System.out.println("Escriba el nombre de que objeto/persona va a regresar ");
				palabraEscrita = ingresoDatos.nextLine().toLowerCase();
				switch (palabraEscrita) {
				case "observador":
					lado1[0] = lado2[0];
					lado2[0] = bote[0];
					break;
				case "lobo":
					lado1[1] = lado2[1];
					lado2[1] = bote[1];
					break;
				case "caperucita":
					lado1[2] = lado2[2];
					lado2[2] = bote[2];
					break;
				case "uvas":
					lado1[3] = lado2[3];
					lado2[3] = bote[3];
					break;
				default:
					break;
				}
			}
			System.out.println("Contigo estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			// Verificar derrota o victoria
			bandera = verificarDerrota(lado1, lado2);

		}

	}

}
