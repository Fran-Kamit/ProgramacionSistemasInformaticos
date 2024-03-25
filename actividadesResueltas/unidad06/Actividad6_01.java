package unidad06;

public class Actividad6_01 {
    public static void main(String[] args) {
        System.out.println(" Escribir un programa que muestre todos los caracteres Unicode " +
                "junto a su code point, cuyo valor\nesté comprendido entre \\u0000 y \\uFFFF.\n");

        principal();
    }

    static void principal(){
        for (int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++){
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u " + xxxx + "-> " + (char)codePoint);
        }
    }
}