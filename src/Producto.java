import java.util.Random;

public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    //Constructor
    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo(nombre, marca);
    }

    //Metodo para generar el codigo del producto
    private String generarCodigo(String nombre, String marca){
        String parteNombre = nombre.length() >= 3?
                nombre.substring(0, 3): nombre;
        String parteMarca = marca.length() >= 2?
                marca.substring(0, 2): marca;
        int numeroAleatorio = new Random().nextInt(900) + 100; //numero de 3 digitos
        return (parteNombre + parteMarca + numeroAleatorio).toUpperCase();
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getMarca() {
        return marca;
    }
    public double getPrecio() {
        return precio;
    }

    //Metodo para mostrar los datos del producto
    @Override
    public String toString() {
        return "ID: " + id +
                ", codigo:'" + codigo + '\'' +
                ", nombre:'" + nombre + '\'' +
                ", marca:'" + marca + '\'' +
                ", precio: $" + precio +
                '}';
    }
}
