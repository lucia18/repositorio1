import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		
		System.out.println("elige una operacion");
		int operacion=teclado.nextInt();
		switch (operacion){
		case 1: {
			texto=texto.toLowerCase();
			System.out.println(texto);
		};break;
		case 2: {
			texto=texto.toUpperCase();
			System.out.println(texto);
			
		}
		}
	}

}
