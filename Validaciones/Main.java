import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String[] validacion = {"DNI/NIE", "NombreUsuario", "Contraseña", "Email", "Matrícula", "Teléfono", "URL",
            "Solo letras", "Solo números", "Código Postal", "Fecha", "IP", "Tarjeta de crédito", "Cuenta bancaria",
            "ISBN"};

    public static void main(String[] args) {
        /**
         * Validaciones:
         *
         * - DNI/NIE
         * - NombreUsuario
         * - Contraseña
         * - Email
         * - Matrícula
         * - Teléfono
         * - URL
         * - Solo letras
         * - Solo números
         * - Código postal
         * - Fecha (dd/mm/aaaa)
         * - IP
         * - Tarjeta de crédito
         * - Cuenta bancaria
         * - ISBN
         */
        menu();
    }

    static void menu() {
        byte opcion;
        do {
            opcion = -1;

            System.out.println("\n\tMenú de validaciones");
            System.out.println("******************************");
            System.out.println(" 1. DNI/NIE");
            System.out.println(" 2. NombreUsuario");
            System.out.println(" 3. Contraseña");
            System.out.println(" 4. Email");
            System.out.println(" 5. Matrícula");
            System.out.println(" 6. Teléfono");
            System.out.println(" 7. URL");
            System.out.println(" 8. Sólo letras");
            System.out.println(" 9. Sólo números");
            System.out.println(" 10. Código Postal");
            System.out.println(" 11. Fecha");
            System.out.println(" 12. IP");
            System.out.println(" 13. Tarjeta de crédito");
            System.out.println(" 14. Cuenta bancaria");
            System.out.println(" 15. ISBN");
            System.out.println(" 0. Salir");
            System.out.println("******************************\n");
            System.out.print("Indique su opción -> ");

            do {
                try {
                    opcion = sc.nextByte();
                    if (opcion < 0 || opcion > 15) {
                        System.out.print("Opción no válida. Introduzca otra opción -> ");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Opción no válida. Debe introducir un número -> ");
                    sc.next();
                }
            } while (opcion < 0 || opcion > 15);

            switch (opcion){
                case 0 -> {
                    System.out.println("Saliendo del programa......");
                }
                case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 -> {
                    boolean resultado = ejecutarValidacion(textoValidar(opcion), opcion);
                    System.out.println(validacion[opcion-1] + " es " + resultado);
                }
            }
        } while (opcion != 0);
    }

    //Método común para la lectura del texto a validar
    static String textoValidar (byte opcion){
        System.out.print("Indique " + validacion[opcion -1]);
        if (opcion == 11){
            System.out.print(" (dd/mm/aaaa) -> ");
        } else {
            System.out.print(" -> ");
        }
        String texto = new Scanner(System.in).nextLine();
        return texto;
    }

    static boolean ejecutarValidacion (String texto, byte opcion){
        boolean exito = false;

        switch (opcion) {
            case 1 -> {
                if (texto.matches("\\d{8}[A-HJ-NP-TV-Za-hj-np-tv-z]")) {//Compara el texto escrito con la expresión regular
                    String letraDNI[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                    int numero = Integer.parseInt(texto.substring(0,8));
                    int posicion = numero % 23;
                    if (texto.substring(8,9).equalsIgnoreCase(letraDNI[posicion])){
                        exito = true;
                    }
                }
            }
            case 2 -> exito = texto.matches("^[a-zA-Z0-9]{3,16}$");//Solo aceptamos letras y números entre 3 y 16 dígitos
            case 3 -> exito = texto.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[.!@ñÑ_%&$=\\*]).{8,16}$"); //Valida que tenga entre 8 y 16 caracteres y especiales
            case 4 -> exito = texto.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
            case 5 -> exito = texto.matches("^[0-9]{4}[A-Z]{3}$");
            case 6 -> exito = texto.matches("^\\+?[0-9]{6,}$");
            case 7 -> exito = texto.matches("^(http|https)://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$");
            case 8 -> exito = texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]+$");
            case 9 -> exito = texto.matches("^\\d+(\\.\\d+)?$");
            case 10 -> exito = texto.matches("^\\d{5}$");
            case 11 -> {
                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               try{
                    LocalDate fecha = LocalDate.parse(texto,f);
                    if(texto.equals(fecha.format(f))) {
                        exito = true;
                    }
               } catch (DateTimeParseException e) {
                   exito = false;
               }
            }
            case 12 -> exito = texto.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            case 13 -> exito = texto.matches("^\\d{16}$");
            case 14 -> exito = texto.matches("^\\d{20}$");
            case 15 -> exito = texto.matches("^\\d{9}[0-9X]$");
        }
        return exito;
    }
}