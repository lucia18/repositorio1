import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		texto=texto.toUpperCase();
		
		int codigo;
		System.out.println("codificar = 1");
		System.out.println("decodificar = 2");
		codigo=teclado.nextInt();
		
		
		
		
		
		
		
		
		
		System.out.println(texto + codigo);
	}

}
