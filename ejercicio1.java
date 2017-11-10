import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		//texto="ciervo";
		char caracter;
		String frase=" ";
		int limite=texto.length();
		for (int i=0; i<limite; i++){
			caracter=texto.charAt(i);
			frase=frase+caracter;
			System.out.println(frase);
			
		}
	}

}
