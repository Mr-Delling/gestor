package dominio;

// Clase que representa un tipo de producto específico: Vehículo
public class Vehiculo extends Producto {

    // Atributos específicos de un vehículo
    private String marca; // Marca del vehículo
    private int anio;     // Año de fabricación del vehículo

    // Constructor que inicializa los atributos de un vehículo
    public Vehiculo(String nombreConstructor_, double precioConstructor_, String descripcionConstructor_,
                    String marcaConstructor_, int anioConstructor_) {
        
        // Llama al constructor de la superclase Producto
        super(nombreConstructor_, precioConstructor_, descripcionConstructor_);
        
        // Inicializa los atributos específicos de Vehiculo
        marca = marcaConstructor_;
        anio = anioConstructor_;
    }

    // Getter para obtener la marca del vehículo
    public String getMarca() {
        return marca;
    }

    // Setter para establecer la marca del vehículo
    public void setMarca(String marca_) {
        marca = marca_;
    }

    // Getter para obtener el año de fabricación del vehículo
    public int getAnio() {
        return anio;
    }

    // Setter para establecer el año de fabricación del vehículo
    public void setAnio(int anio_) {
        anio = anio_;
    }

    // Método que devuelve una representación en String del vehículo
    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", descripcion='" + getDescripcion() + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                '}';
    }
}
