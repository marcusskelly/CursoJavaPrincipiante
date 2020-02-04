import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		
		String usuario = "", password = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingresa tu nombre de usuario: ");
		usuario = entrada.nextLine();
		
		System.out.println("ingresa tu contraseña: ");
		password = entrada.nextLine();
		
		if(usuario.equals("marcus") && password.equals("123456")) {
			System.out.println("Inicio de sesion correcto");
		}else {
			System.out.println("Nombre de usuario o contraseña incorrecta");
		}
		
		}
	}

