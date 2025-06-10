import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int contadorId = 1;

        while (true){
            System.out.println("Registro de nuevo producto");

            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Marca: ");
            String marca = scanner.nextLine();

            System.out.println("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            Producto producto = new Producto(contadorId++, nombre, marca, precio);
            productos.add(producto);

            System.out.println("Desea ingresar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")){
                break;
            }
        }

        //Mostrar productos con Iterator
        System.out.println("\nProductos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()){
            Producto p = iterator.next();
            System.out.println(p);
        }
    }
}