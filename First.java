import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
        // Creo el objeto Scanner
        Scanner userIn = new Scanner(System.in);

        // Creo la variable de titulo, no lo escribo directamente en el "print", ya que nesectio saber su "Lenght"
        String msgTitle = "* Bienvenido al sistema vacacional de Coca Cola (No pepsi gas weyyyyy >:u) *";

        // Uso la funcion "stringMultiply" que cree abajo, le intuducto el caracter a repetir, y lo repito segun el largo el titulo
        String borderTitle = stringMultiply("*", msgTitle.length());

        // imprimo el borde superior de arsteriscos, luego el titulo, y posteriormente el borde inferior
        System.out.println("\n" + borderTitle);
        System.out.println(msgTitle);
        System.out.println(borderTitle + "\n");

        // Uso la funcion "getInfoStr" e "getInfoInt" que cree abajo, pido el nombre del empleado y la clave de departamento
        String name = getInfoStr("Nombre del empleado: ", userIn);
        int dept = getInfoInt("Clave de departamento : ", userIn);

        // solo existen tres departementos, si ingresa uno inexistente, el programa no va mas
        if (dept >= 1 && dept <= 3) {

            // creo el caracter "ñ", e igualmente pido los años de antiguedad
            String nWithAcentMark = "\u00f1";
            int antiquity = getInfoInt("Antiguedad (A" + nWithAcentMark + "os) : ", userIn);

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

    // Funcion donde imprimo el mensaje y devuelvo la entrada del usuario, pido el texto y el scanner, (String)
    public static String getInfoStr(String s, Scanner p){
        System.out.print(s);
        String sb = p.nextLine();
        return sb;
    }

    // Igual que la funcion "getInfoStr" solo que es para Int
    public static int getInfoInt(String s, Scanner p){
        System.out.print(s);
        int sb = p.nextInt();
        return sb;
    }
}
