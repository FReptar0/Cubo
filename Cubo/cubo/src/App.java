import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cubo cb = new Cubo(0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado del cubo: ");
        cb.setLado(leer.nextDouble());
        System.out.println("El area del cubo es: "+ cb.area());
        System.out.println("El volumen es: "+ cb.volumen());
    }
}