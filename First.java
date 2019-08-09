import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
        // Creo el objeto Scanner
        Scanner userIn = new Scanner(System.in);

        // Creo la variable de titulo, no lo escribo directamente en el "print", ya que nesectio saber su "Lenght"
        String msgTitle = "*Bienvenido al sistema vacacional de Coca Cola (No pepsi gas weyyyyy >:u)*";

        // Uso la funcion "stringMultiply" que cree abajo, le intuducto el caracter a repetir, y lo repito segun el largo el titulo
        String borderTitle = stringMultiply("*", msgTitle.length());

        // imprimo el borde superior de arsteriscos, luego el titulo, y posteriormente el borde inferior
        System.out.println("\n" + borderTitle);
        System.out.println(msgTitle);
        System.out.println(borderTitle + "\n");

        // Pido el nombre del empleado y uso el objeto escaner anteriormente creado para la entrada del usuario, hago lo mismo con la clave de departamento
        System.out.print("Nombre del empleado: ");
        String name = userIn.nextLine();

        System.out.print("Clave de departamento : ");
        int dept = userIn.nextInt();

        // solo existen tres departementos, si ingresa uno inexistente, el programa no va mas
        if (dept >= 1 && dept <= 3) {

            // creo el caracter "ñ", e igualmente pido los años de antiguedad
            String nWithAcentMark = "\u00f1";
            System.out.print("Antiguedad (A" + nWithAcentMark + "os) : ");
            int antiquity = userIn.nextInt();

            // variable para almacenar los dias de vacaciones
            int vacDays = 0;

            // Selecciono segun el departemento
            switch (dept) {
                
                // Segun el departemento, y segun la antiguedad del empleado, seteo los dias de vacaciones
                case 1: 
                    if (antiquity <= 1) vacDays = 6;
                    else if (antiquity <= 6) vacDays = 14;
                    else vacDays = 20;
                break;

                case 2: 
                    if (antiquity <= 1) vacDays = 7;
                    else if (antiquity <= 6) vacDays = 15;
                    else vacDays = 22;
                break;

                case 3: 
                    if (antiquity <= 1) vacDays = 10;
                    else if (antiquity <= 6) vacDays = 20;
                    else vacDays = 30;
                break;

            }

            // imprimo la informacion solicitada
            System.out.println("El trabajador \"" + name + "\" tiene derecho a " + vacDays + " dias de vacaciones al a" + nWithAcentMark + "o \n");

        }

        // mensaje de departemento inexistente
        else System.out.println("Error: Departamento inexistente \n");

        // Cierro el scaner (Hay que cerrarlo)
        userIn.close();

    }

    // Multiplicador de palabras, entradas, la palabra y el numero de veces a repetir
    public static String stringMultiply(String s, int n){

        // Creo un objeto "dummie" para contruir la palabra
        StringBuilder sb = new StringBuilder();

        // agreto al objeto constructor el palabra n veces, el numero dado
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }

        // Retorno la palabra ya repetida
        return sb.toString();
    }
}