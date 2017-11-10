import java.util.Scanner;

public class EjString5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("dame un texto:");
		String texto=teclado.nextLine();
		String pares="";
		String impar="";
		String car;
		for (int i=0; i<texto.length(); i++){ 
			car=texto.substring(i,i+1);
			if ((i+1)%2==0){
				pares=pares.concat(car);
				
			}else{
				impar=impar+car;
			}
			
			
			
			
		}
		System.out.println("las letras pares son " + pares);
		System.out.println("las letras iiiiimpares son " + impar);
		
		
	}

}
