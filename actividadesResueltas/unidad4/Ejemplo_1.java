package unidad4;

public class Ejemplo_1 {
    public static void main(String[] args) {
        tresSaludos(1);
        tresSaludos(2);
        tresSaludos(3);
    }
    static void tresSaludos(int veces){
        System.out.println("\n Te voy a saludar " + veces + " veces");
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola");
        }
    }
}