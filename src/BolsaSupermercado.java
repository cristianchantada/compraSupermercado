import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    private List<T> productos = new ArrayList<>();

    public void addProducto(T producto){
        this.productos.add(producto);
    }

    public T getproductos(){
        return (T) this.productos;
    }


}
