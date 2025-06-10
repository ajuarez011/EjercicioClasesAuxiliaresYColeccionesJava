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

### Clase Main

La clase `Main` es responsable de la interacción con el usuario para registrar y mostrar productos. Utiliza un `ArrayList` para almacenar los productos y un `Scanner` para leer la entrada del usuario.

#### Atributos
- `productos`: Lista que almacena objetos de la clase `Producto`.
- `scanner`: Objeto para leer la entrada del usuario.
- `contadorId`: Contador para asignar un ID único a cada producto.

#### Flujo del Programa
1. **Registro de Productos**:
   - Solicita al usuario ingresar el nombre, marca y precio de un producto.
   - Crea un nuevo objeto `Producto` y lo agrega a la lista.
   - Pregunta al usuario si desea ingresar otro producto.

2. **Mostrar Productos**:
   - Utiliza un `Iterator` para mostrar los detalles de cada producto registrado.
