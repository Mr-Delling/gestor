package aplicacion;

import dominio.CatalogoProducto;
import dominio.Vehiculo;
import presentacion.GestorCatalogo;

// Clase principal que ejecuta el programa de gestión del catálogo
public class Main {

    // Método principal que inicia la ejecución del programa
    public static void main(String[] args) {

        // Crear el gestor del catálogo
        GestorCatalogo catalogo = new CatalogoProducto();

        // Crear algunos vehículos y agregarlos al catálogo
        Vehiculo vehiculo1 = new Vehiculo("Toyota Corolla", 20000, "Sedán compacto", "Toyota", 2020);
        Vehiculo vehiculo2 = new Vehiculo("Ford Mustang", 35000, "Deportivo", "Ford", 2022);
        
        // Agregar vehículos al catálogo
        catalogo.agregarProducto(vehiculo1);
        catalogo.agregarProducto(vehiculo2);

        // Listar productos en el catálogo
        System.out.println("Catálogo de productos:");
        catalogo.listarProductos();

        // Modificar un vehículo existente
        Vehiculo vehiculoModificado = new Vehiculo("Toyota Camry", 22000, "Sedán mediano", "Toyota", 2021);
        catalogo.modificarProducto(0, vehiculoModificado);

        // Listar productos después de la modificación
        System.out.println("\nCatálogo después de modificación:");
        catalogo.listarProductos();
    }
}
