import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Gabriel
 *
 */
public class Debercopy {
	/*
	 * Problema del rio: Hay un L 🐺, unas C y unas U 🍇  que quieren cruzan de un lado del río al otro extremo. Las reglas son:
	 * -si esta solo el L con la C  (marcha la C )
	 * - si la C esta solo con las U (marchan las U)
	 */
	/**
	 * Esta funcion sirve para verificar si se gana o pierde
	 * @param string con los elementos de la orilla
	 * @param string con los elementos al otro lado del rio
	 * @return una variable boolean que cierra o continua la repeticion
	 */
	public static boolean verificarVoD(String[] lado1, String[] lado2) {
		boolean bandera2 = true;
		if (lado1[0].equals(" ") && ((lado1[1].equals("L")) && (lado1[2].equals("C")))
				|| (lado2[0].equals(" ") && (lado2[1].equals("L")) && (lado2[2].equals("C")))) {
			System.out.println("El Lobo se comio a la Caperucita, Perdiste!!");
			return false;
		} else if ((lado1[0].equals(" ") && (lado1[2].equals("C")) && (lado1[3].equals("U")))
				|| (lado2[0].equals(" ") && (lado2[2].equals("C")) && (lado2[3].equals("U")))) {
			System.out.println("La Caperucita se comio las Uvas, Perdiste!!");
			return false;
		}
		if ((lado2[0].equals("O")) && (lado2[1].equals("L")) && (lado2[2].equals("C"))
				&& (lado2[3].equals("U"))) {
			System.out.println("Lograste pasar a todos, Felicidades ganaste!!");
			bandera2 = false;
		}
		return bandera2;
	}

	/**
	 * Esta funcion sirve para pasar o regresar a alguien en un bote
	 * @param ladoOrilla
	 * @param ladoRio
	 * @param ser        elegido
	 */
	public static void transporte(String[] ladoOrilla, String[] ladoRio, String palabraEscrita) {
		String[] bote = { " ", " ", " ", " " };
		switch (palabraEscrita) {
		case "O":
			ladoRio[0] = ladoOrilla[0];
			ladoOrilla[0] = bote[0];
			break;
		case "L":
			ladoRio[1] = ladoOrilla[1];
			ladoOrilla[1] = bote[1];
			break;
		case "C":
			ladoRio[2] = ladoOrilla[2];
			ladoOrilla[2] = bote[2];
			break;
		case "U":
			ladoRio[3] = ladoOrilla[3];
			ladoOrilla[3] = bote[3];
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		//Declaracion de variables
		Scanner ingresoDatos = new Scanner(System.in);
		String[] lado1 = { "O", "L", "C", "U" };
		String[] lado2 = { " ", " ", " ", " " };
		String palabraEscrita;
		boolean bandera = true;
		//Problema
		System.out.println("Contigo estan " + Arrays.toString(lado1));
		while (bandera == true) {
			System.out.println("Escriba el nombre de que objeto/persona va a subir al bote");
			palabraEscrita = ingresoDatos.nextLine().toUpperCase();
			transporte(lado1, lado2, palabraEscrita);
			System.out.println("En la orilla estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			System.out.println("**Desea regresar con alguien? SI/NO**");
			palabraEscrita = ingresoDatos.nextLine().toLowerCase();
			if (palabraEscrita.equals("si")) {
				System.out.println("Escriba el nombre de que objeto/persona va a regresar ");
				palabraEscrita = ingresoDatos.nextLine().toLowerCase();
				transporte(lado2, lado1, palabraEscrita);
			}else {
				System.out.println("**No regreso nadie en el bote**");
			}
			System.out.println("En orilla estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			bandera = verificarVoD(lado1, lado2);
		}
	}
}