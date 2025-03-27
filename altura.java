import java.util.Scanner;
public class altura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float edad=0, estdoCivil=0, estatura=0, sexo=0,
        acumuladorEstatura=0, aculadorEdad=0, promedioEstatura=0, preomedioEdad=0,
        porcentajeCumplen=0;
        float contadorPersonasCumplen=0;

        for (int numeroPersona =1; numeroPersona <= 3;  numeroPersona++) {

            System.out.println("ingrese la edad de la persona numero "+numeroPersona);
            edad = scanner.nextInt();
            System.out.println("ingrese el estado civil de la persona numero "+numeroPersona+" 1.soltero 2.casado");
            estdoCivil = scanner.nextInt();
            System.out.println("ingrese la estarura de la persona numero "+numeroPersona);
            estatura = scanner.nextInt();
            System.out.println("ingrese el sexo de la persona numero "+numeroPersona+" 1.Hombre 2.Mujer");
            sexo = scanner.nextInt();
            
            
            if ((edad>=18)&&(estdoCivil==1)&&(estatura>170)&&(sexo==1)) {
               
            contadorPersonasCumplen=contadorPersonasCumplen+1;
            aculadorEdad=edad+aculadorEdad;
            acumuladorEstatura=estatura+acumuladorEstatura;

            }
        }
        
        promedioEstatura=acumuladorEstatura/contadorPersonasCumplen;
        preomedioEdad=aculadorEdad/contadorPersonasCumplen;
        porcentajeCumplen=(contadorPersonasCumplen/3)*100;

        System.out.println("El porcentaje de personas que cumplen la condicion es "+porcentajeCumplen+"%");
        System.out.println("El promedio de edad de las personas que cumplen es "+preomedioEdad);
        System.out.println("El promedo de estatura de las personas que cumplen "+promedioEstatura);
    }
}