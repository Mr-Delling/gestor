package dominio;

// Clase abstracta que representa un producto general en el catálogo
public abstract class Producto {
    
    // Atributos básicos de un producto
    private String nombre;        // Nombre del producto
    private double precio;        // Precio del producto
    private String descripcion;   // Descripción del producto

    // Constructor de la clase Producto, inicializa el nombre, precio y descripción
    public Producto(String nombreC_, double precioC_, String descripcionC_) {
        // Asigna los parámetros del constructor a los atributos de la clase
        nombre = nombreC_;
        precio = precioC_;
        descripcion = descripcionC_;
    }

    // Getter para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre del producto
    public void setNombre(String nombre_) {
        nombre = nombre_;
    }

    // Getter para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }

    // Setter para establecer el precio del producto
    public void setPrecio(double precio_) {
        precio = precio_;
    }

    // Getter para obtener la descripción del producto
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para establecer la descripción del producto
    public void setDescripcion(String descripcion_) {
        descripcion = descripcion_;
    }

    // Método abstracto que obliga a las subclases a implementar su propia representación en String
    // Este método debería devolver una representación detallada de los atributos del producto
    public abstract String toString();
}
