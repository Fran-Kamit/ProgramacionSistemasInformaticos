import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nUna empresa que se dedica a la venta de Aceite de Oliva necesita una aplicación en java para gestionar las facturas." +
                "\nEn cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro." +
                "\n" +
                "\nRealizar un menú con la siguiente estructura:" +
                "\n 1. Fracturar" +
                "\n 2. Salir" +
                "\n" +
                "\nEn facturar, solicitar el código, que puede ser (01 de 1 litro, 02 de 3 litros y 03 de 5 litros)" +
                "\nSegún el formato, los precios son: " +
                "\n 1 litro -> 9,99€" +
                "\n 3 litros -> 29,99€" +
                "\n 5 litros-> 49,95€" +
                "\n\n");

        menu();
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
        byte eleccion;
        int precioTotal = 0;
        int contFactura = 0;
        String factura = "", facturaTotal = "";

        do {
            do {
                System.out.print("\n¿Qué desea realizar? 1.Facturar 2.Salir -> ");
                eleccion = sc.nextByte();
            } while (eleccion < 1 || eleccion > 2);

            if (eleccion == 1) {
                contFactura++;
                factura = facturar(contFactura);
                facturaTotal += factura;
            }
        } while(eleccion != 2);

        System.out.println("");
        System.out.println(facturaTotal);
    }

    static String facturar(int contFactura){
        Scanner sc = new Scanner(System.in);
        String factura = ("-----FACTURA " + contFactura + "----- " + "\n");
        byte eleccion;
        int unLitro, tresLitros, cincoLitros;
        int contUnLitro = 0, contTresLitros = 0, contCincoLitros = 0;
        final String COD_UN_LITRO = "01", COD_TRES_LITROS = "02", COD_CINCO_LITROS = "03";
        double totalUnLitro = 0, totalTresLitros = 0, totalCincoLitros = 0, precioTotal = 0;
        final double PRECIO_UN_LITRO = 9.99, PRECIO_TRES_LITROS = 29.99, PRECIO_CINCO_LITROS = 49.95;

        do {
            do {
                System.out.print("\nInserte la opción a añadir. 1. Un litro, 2. Tres litros, 3. Cinco litros. 4. Salir -> ");
                eleccion = sc.nextByte();
            } while (eleccion < 1 || eleccion > 4);

            if (eleccion >= 1 || eleccion <= 3) {
                switch (eleccion){
                    case 1 -> {
                        do {
                            System.out.print("¿Cuántas botellas de 1 litro necesita? ");
                            unLitro = sc.nextInt();
                        } while (unLitro < 0);
                        contUnLitro += unLitro;
                        totalUnLitro += (unLitro * PRECIO_UN_LITRO);
                        factura += ("Código artículo " + COD_UN_LITRO + " - cantidad vendida en litros " + unLitro + " " +
                                "- precio por litro " + PRECIO_UN_LITRO + "€ -> TOTAL " + totalUnLitro + "€\n");
                        precioTotal += totalUnLitro;
                    }
                    case 2 -> {
                        do {
                            System.out.print("¿Cuántas botellas de 3 litros necesita? ");
                            tresLitros = sc.nextInt();
                        } while (tresLitros < 0);
                        contTresLitros += tresLitros;
                        totalTresLitros += (tresLitros * PRECIO_TRES_LITROS);
                        factura += ("Código artículo " + COD_TRES_LITROS + " - cantidad vendida en litros " + contTresLitros * 3 + " " +
                                "- precio por litro " + PRECIO_TRES_LITROS + "€ -> TOTAL " + totalTresLitros + "€\n");
                        precioTotal += totalTresLitros;
                    }
                    case 3 -> {
                        do {
                            System.out.print("¿Cuántas garrafas de 5 litros necesita? ");
                            cincoLitros = sc.nextInt();
                        } while (cincoLitros < 0);
                        contCincoLitros += cincoLitros;
                        totalCincoLitros += (cincoLitros * PRECIO_CINCO_LITROS);
                        factura += ("Código artículo " + COD_CINCO_LITROS + " - cantidad vendida en litros " + contCincoLitros * 5 + " " +
                                "- precio por litro " + PRECIO_CINCO_LITROS + "€ -> TOTAL " + totalCincoLitros + "€\n");
                        precioTotal += totalCincoLitros;
                    }
                }
            }
        }while (eleccion != 4);
        factura += ("\nEl precio total es de " + precioTotal + "€\n\n");
        return factura;
    }
}