package dominio;

import presentacion.GestorCatalogo;
import java.util.ArrayList;
import java.util.List;

// Clase que implementa la interfaz GestorCatalogo para gestionar el catálogo de productos
public class CatalogoProducto implements GestorCatalogo {

    // Lista de productos en el catálogo
    private List<Producto> productos;

    // Constructor que inicializa la lista de productos
    public CatalogoProducto() {
        productos = new ArrayList<>();
    }

    // Implementación del método para agregar un producto al catálogo
    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto); // Agrega el producto a la lista
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Implementación del método para modificar un producto existente
    @Override
    public void modificarProducto(int indice, Producto producto) {
        if (indice >= 0 && indice < productos.size()) {
            productos.set(indice, producto); // Reemplaza el producto en el índice especificado
            System.out.println("Producto modificado en índice " + indice + ": " + producto.getNombre());
        } else {
            System.out.println("Índice inválido. No se pudo modificar el producto.");
        }
    }

    // Implementación del método para listar todos los productos
    @Override
    public void listarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("[" + i + "] " + productos.get(i).toString());
        }
    }
}