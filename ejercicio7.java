import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		
		String minusculas = "abcdefghijklmnñopqrstuvwxyz";
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeros= "1234567890";
		
		
		int sumamayus=0;
		int sumaminus=0;
		int sumanumeros=0;
		String car;
		
		
		for (int i=0; i<texto.length(); i++){ 
			car=texto.substring(i,i+1);
			
			if (mayusculas.indexOf(car)!=-1){
				sumamayus++;}
				
			if (minusculas.indexOf(car)!=-1){
				sumaminus++;}		
			 
			if (numeros.indexOf(car)!=-1){
				sumanumeros++;}	
				
			
				
			}
		System.out.println("hay " + sumamayus + " mayusculas ");
		System.out.println("hay " + sumaminus + " minusculas ");
		System.out.println("hay " + sumanumeros + " numeros ");
	}

}
