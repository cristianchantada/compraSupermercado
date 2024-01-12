public class NoPerecible extends Producto {

    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.calorias = calorias;
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
