import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		
		String vocales ="aeiou";
		String consonantes ="bcdfghjklmnñpqrstvwxyz";
		String numeros= "1234567890";
		
		int sumavocales=0;
		int sumaconsonantes=0;
		int sumanumeros=0;
		String car;
		
		
		for (int i=0; i<texto.length(); i++){ 
			car=texto.substring(i,i+1);
			
			if (vocales.indexOf(car)!=-1){
				sumavocales++;}
				
			if (consonantes.indexOf(car)!=-1){
				sumaconsonantes++;}		
			 
			if (numeros.indexOf(car)!=-1){
				sumanumeros++;}	
				
			
				
			}
		System.out.println("hay " + sumavocales + " vocales ");
			System.out.println("hay " + sumaconsonantes + " consonantes ");
			System.out.println("hay " + sumanumeros + " numeros ");
	}

}
