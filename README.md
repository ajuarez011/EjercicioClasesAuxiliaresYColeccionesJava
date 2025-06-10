# Sistema de Gestión de Productos

Este programa en Java proporciona un sistema simple para gestionar una lista de productos. Consta de dos clases principales: `Producto` y `Main`.

## Clases

### Clase Producto

La clase `Producto` representa un producto con los siguientes atributos:
- `id`: Un identificador único para el producto.
- `codigo`: Un código generado para el producto.
- `nombre`: El nombre del producto.
- `marca`: La marca del producto.
- `precio`: El precio del producto.

#### Constructor
```java
public Producto(int id, String nombre, String marca, double precio)
