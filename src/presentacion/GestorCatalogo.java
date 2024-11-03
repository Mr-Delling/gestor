package presentacion;

import dominio.Producto;

// Interfaz para gestionar el catálogo de productos
public interface GestorCatalogo {

    // Agrega un producto al catálogo
    void agregarProducto(Producto producto);

    // Modifica un producto existente en el catálogo
    void modificarProducto(int indice, Producto producto);

    // Lista todos los productos en el catálogo
    void listarProductos();
}
