import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		
		String minusculas = "abcdefghijklmnñopqrstuvwxyz";
		String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//int mayus=texto.length();
		int sumamayus=0;
		int sumaminus=0;
		String car;
		
		
		for (int i=0; i<texto.length(); i++){ 
			car=texto.substring(i,i+1);
			
			if (mayusculas.indexOf(car)!=-1){
				sumamayus++;}
				
			if (minusculas.indexOf(car)!=-1){
				sumaminus++;}		
			 
		
				
			
				
			}
		System.out.println("hay " + sumamayus + " mayúsculas y " + sumaminus + " minusculas");
	
	}
	}
	
	

	
	


