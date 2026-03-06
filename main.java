public class main {
    String Nombre;
    boolean EnOferta;
    public main() {
    }
    public main(String nombre, boolean enOferta) {
        Nombre = nombre;
        EnOferta = enOferta;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public boolean getEnOferta() {
        return EnOferta;
    }
    public void setEnOferta(boolean enOferta) {
        EnOferta = enOferta;
    }
}
