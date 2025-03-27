import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String nombre;
        int estadoCivil;

        System.out.print("ingrese el nombre de la persona ");
        nombre = scanner.next();
        System.out.println("ingrese el valor correspondiente al estado: 1.Soltero, 2.Casado, 3.Separado, 4.Viudo, 5.Union libre");
        estadoCivil = scanner.nextInt();

        switch (estadoCivil) {
            case 1:
            System.out.println(nombre+" Esta solter@");
                break;

            case 2:
            System.out.println(nombre+" Esta casad@");
                break;
            
            case 3:
            System.out.println(nombre+" Esta separad@");
                break;

            case 4:
            System.out.println(nombre+" Esta viud@");
                break;

            case 5:
            System.out.println(nombre+" Esta en union libre");
                break;
        
            default:
            System.out.println("Estado civil no valido");
                break;
        }
    }
    
}