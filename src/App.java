import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa para realizar calculos de la Ecuacion Lineal ");

        //declarar objeto
        Scanner lector = new Scanner(System.in);

        //leer datos
        System.out.println("Coordenadas del primer punto ");
        System.out.print("x? ");
        double x1 = lector.nextDouble();
        System.out.print("y? ");
        double y1 = lector.nextDouble();

        System.out.println("Coordenadas del primer punto ");
        System.out.print("x? ");
        double x2 = lector.nextDouble();
        System.out.print("y? ");
        double y2 = lector.nextDouble();

        //proceso
        double distancia=Math.sqrt(Math.pow(y2-y1,2) + Math.pow(x2-x1,2));
        double pendiente=(y2-y1)/(x2-x1);
        double b = y1-(pendiente*x1);

        //salida
        System.out.println("La distancia entre los puntos es " + distancia);
        if(pendiente<0)
        {
            System.out.println("y = "+pendiente+"x "+b);
        } else {
            System.out.println("y = "+pendiente+"x +"+b);
        }

    }
}
