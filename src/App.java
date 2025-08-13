import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa para realizar calculos de la ecuacion lineal");

        // declarar objeto para leer datos por consola
        Scanner lector=new Scanner(System.in); 

        // leer los datos de entrada
        System.out.println("Coordenadas del primer punto");
        System.out.print("x ?");
        double x1=lector.nextDouble();
        System.out.print("y ?");
        double y1=lector.nextDouble();

        System.out.println("Coordenadas del segundo punto");
        System.out.print("x ?");
        double x2=lector.nextDouble();
        System.out.print("y ?");
        double y2=lector.nextDouble();

        // Proceso
        double distancia=Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));

        // Salida
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
