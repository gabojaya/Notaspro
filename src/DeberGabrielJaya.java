import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Gabriel
 * @date : 06.dic.2022
 * @version 2.0
 * Hay un lobo, una caperucita y unas uvas que quieren cruzan de un lado del rio al otro extremo.
 * Las reglas son: -si esta solo el lobo con la caperucita  (marcha la caperucita) o si la caperucita esta solo con las uvas (marchan las uvas)
 */
public class DeberGabrielJaya {

	/**
	 * Esta funcion sirve para verificar si gana o pierde
	 * @param string con los elementos de la orilla
	 * @param string con los elementos al otro lado del rio
	 * @return una variable boolean que cierra o continua la repeticion
	 */
	public static boolean verificarVoD(String[] lado1, String[] lado2) {
		boolean bandera2 = true;
		if (lado1[0].equals(" ") && ((lado1[1].equals("lobo")) && (lado1[2].equals("caperucita")))
				|| (lado2[0].equals(" ") && (lado2[1].equals("lobo")) && (lado2[2].equals("caperucita")))) {
			System.out.println("El lobo se comio a la caperucita, Perdiste!!");
			return false;
		} else if ((lado1[0].equals(" ") && (lado1[2].equals("caperucita")) && (lado1[3].equals("uvas")))
				|| (lado2[0].equals(" ") && (lado2[2].equals("caperucita")) && (lado2[3].equals("uvas")))) {
			System.out.println("La Caperucita se comio las uvas, Perdiste!!");
			return false;
		}
		if ((lado2[0].equals("observador")) && (lado2[1].equals("lobo")) && (lado2[2].equals("caperucita"))
				&& (lado2[3].equals("uvas"))) {
			System.out.println("Lograste pasar a todos, Felicidades ganaste!!");
			bandera2 = false;
		}
		return bandera2;
	}
	/**
	 * Esta funcion sirve para pasar o regresar a alguien en un bote
	 * @param ladoOrilla
	 * @param ladoRio
	 * @param elemento_elegido
	 */
	public static void transporte(String[] ladoOrilla, String[] ladoRio, String palabraEscrita) {
		String[] bote = { " ", " ", " ", " " };
		switch (palabraEscrita) {
		case "observador":
			ladoRio[0] = ladoOrilla[0];
			ladoOrilla[0] = bote[0];
			break;
		case "lobo":
			ladoRio[1] = ladoOrilla[1];
			ladoOrilla[1] = bote[1];
			ladoRio[0] = ladoOrilla[0];
			ladoOrilla[0] = bote[0];
			break;
		case "caperucita":
			ladoRio[2] = ladoOrilla[2];
			ladoOrilla[2] = bote[2];
			ladoRio[0] = ladoOrilla[0];
			ladoOrilla[0] = bote[0];
			break;
		case "uvas":
			ladoRio[3] = ladoOrilla[3];
			ladoOrilla[3] = bote[3];
			ladoRio[0] = ladoOrilla[0];
			ladoOrilla[0] = bote[0];
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner ingresoDatos = new Scanner(System.in);
		String[] lado1 = { "observador", "lobo", "caperucita", "uvas" };
		String[] lado2 = { " ", " ", " ", " " };
		String palabraEscrita;
		boolean bandera = true;
		//Problema
		System.out.println("Contigo estan " + Arrays.toString(lado1));
		System.out.println(
				"Se quiere cruzar un rio pero sin que el lobo se coma a la caperucita y la caperucita se coma las uvas");
		while (bandera == true) {
			System.out.println("Escriba el nombre de que objeto/persona va a subir al bote");
			palabraEscrita = ingresoDatos.nextLine().toLowerCase();
			transporte(lado1, lado2, palabraEscrita);
			System.out.println("En la orilla estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			bandera = verificarVoD(lado1, lado2);
			if(bandera==false){
				break;
			}
			System.out.println("**Desea regresar con alguien? SI/NO**");
			palabraEscrita = ingresoDatos.nextLine().toLowerCase();
			if (palabraEscrita.equals("si")) {
				System.out.println("Escriba el nombre de que objeto/persona va a regresar ");
				palabraEscrita = ingresoDatos.nextLine().toLowerCase();
				transporte(lado2, lado1, palabraEscrita);
			}else {
				transporte(lado2, lado1, "observador");
			}
			System.out.println("En orilla estan " + Arrays.toString(lado1));
			System.out.println("Al otro lado del rio estan " + Arrays.toString(lado2));
			bandera = verificarVoD(lado1, lado2);
		}
	}
}
