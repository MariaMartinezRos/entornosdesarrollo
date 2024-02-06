

import java.util.Scanner;

public class Principal {
	public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Inicio de programa.");
    	
    	int numero = 1;
    	
    	numero =pedirInt("Dime una cantidad de usuarios: ");
        Usuario[] usuarios = pedirUsers(numero);
        mostrarUsers(usuarios);
        
    	System.out.println("Fin de programa.");
    }
    public static int pedirInt(String enunciado) {
    	int numero = 1;
    	System.out.print(enunciado);
    	try {
    		numero = Integer.parseInt(teclado.nextLine().trim());
    	}catch(Exception e){
        	System.out.println("ERROR-> "+e.getMessage()+". Escribe un valor válido. ");
    	}
    	return numero;
    }

    public static Usuario[] pedirUsers(int numero) {
        Usuario[] usuarios = new Usuario[numero];

        for (int i = 0; i < numero; i++) {
            usuarios[i] = new Usuario();
            System.out.println("\n    Usuario nº "+ (i+1));
            System.out.print("\tNombre: \t");
            usuarios[i].nombre=teclado.nextLine();
            System.out.print("\tApellidos: \t");
            usuarios[i].apellidos=teclado.nextLine();
            System.out.print("\tGmail: \t\t");
            usuarios[i].gmail=teclado.nextLine();
        }
        return usuarios;
    }

    public static void mostrarUsers(Usuario[] usuarios) {
        System.out.println("\n---------\n\nUsuarios Totales:\n");
        for (int i = 0; i < usuarios.length; i++) {
        	System.out.println("    Usuario nº "+ (i+1));
            System.out.println("\tNombre: \t"+ usuarios[i].nombre);
            System.out.println("\tApellidos: \t"+ usuarios[i].apellidos);
            System.out.println("\tGmail: \t\t"+ usuarios[i].gmail + "\n");
        }
    }
    
}