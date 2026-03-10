public class Producto {
    private String Nombre;
    private double Precio;
    private boolean EnOferta;
    public Producto(String nombre, double precio, boolean enOferta) {
        Nombre = nombre;
        Precio = precio;
        EnOferta = enOferta;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public boolean isEnOferta() {
        return EnOferta;
    }
    public void setEnOferta(boolean enOferta) {
        EnOferta = enOferta;
    }
    
}
