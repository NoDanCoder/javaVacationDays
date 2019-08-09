import java.util.Scanner;

public class First {
    
    // 
    public static void main(String[] args) {
        
        Scanner userIn = new Scanner(System.in);

        String introMsg = "Bienvenido al sistema vacacional de Coca Cola (No pepsi gas weyyyyy >:u)";
        System.out.println("\n" + stringMultiply("*", introMsg.length()));
        System.out.println(introMsg);
        System.out.println(stringMultiply("*", introMsg.length()) + "\n");

        System.out.print("Nombre del empleado: ");
        String name = userIn.nextLine();

        System.out.print("Clave de departamento : ");
        int dept = userIn.nextInt();

        if (dept >= 1 && dept <= 3) {

            String nWithAcentMark = "\u00f1";
            System.out.print("Antiguedad (A" + nWithAcentMark + "os) : ");
            int antiquity = userIn.nextInt();

            int vacDays = 0;

            switch (dept) {
                
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

            System.out.println("El trabajador \"" + name + "\" tiene derecho a " + vacDays + " dias de vacaciones al a" + nWithAcentMark + "o \n");

        }

        else System.out.println("Error: Departamento inexistente \n");

        userIn.close();

    }

    public static String stringMultiply(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
