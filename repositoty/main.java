package repositoty;

public class main {
    public static void main(String[] args) {
        IRepository<Producto> productoRepository = new ProductoRepository();

        // Obtener un producto por su ID
        Producto producto = productoRepository.getById(1);
        System.out.println("Producto encontrado: " + producto.getNombre());

        // Agregar un nuevo producto
        Producto nuevoProducto = new Producto("Nuevo Producto", 100.0);
        productoRepository.add(nuevoProducto);
        System.out.println("Producto agregado con éxito.");

        // Actualizar un producto existente
        producto.setPrecio(120.0);
        productoRepository.update(producto);
        System.out.println("Producto actualizado con éxito.");

        // Eliminar un producto
        productoRepository.delete(producto);
        System.out.println("Producto eliminado con éxito.");
    }
}

