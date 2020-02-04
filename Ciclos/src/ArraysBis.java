import java.util.Scanner;

public class ArraysBis {

	public static void main(String[] args) {
		
		int longitud = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos numeros deseas ingresar");
		longitud= entrada.nextInt();
		
		int numeros[]= new int[longitud];
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println("Dame el valor #" + (i+1));
			numeros[i] = entrada.nextInt();
	}
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println("[" + numeros[i] + "]");
		}
	}
}
