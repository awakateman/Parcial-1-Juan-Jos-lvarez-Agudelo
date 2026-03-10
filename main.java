import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuántos productos desea ingresar?");
        int n = sc.nextInt();
        sc.nextLine();
        Producto[] p = new Producto[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del producto:");
            double precio = sc.nextDouble();
            sc.nextLine();
            System.out.println("¿Está en oferta? (1=Sí / 0=No");
            int oferta = sc.nextInt();
            sc.nextLine();
            boolean enOferta = (oferta == 1);
            p[i] = new Producto(nombre, precio, enOferta);
        }
        int contador = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].isEnOferta()) {
                System.out.println("------------------------------");
                System.out.println("Productos en oferta:");
                System.out.println("- " + p[i].getNombre() + " ($" + p[i].getPrecio() + ")");
                contador++;
            }
        }
        System.out.println("Total de productos en oferta: " + contador);
    }
}