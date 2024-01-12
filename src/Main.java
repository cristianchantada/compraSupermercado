import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();

        bolsaLacteos.addProducto(new Lacteo("leche", 0.99, 2, 180));
        bolsaLacteos.addProducto(new Lacteo("yogures", 1.20, 8, 220));
        bolsaLacteos.addProducto(new Lacteo("queso", 7.90, 1, 120));
        bolsaLacteos.addProducto(new Lacteo("mantequilla", 2.75, 3, 3));
        bolsaLacteos.addProducto(new Lacteo("batido", 2.65, 4, 350));

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();

        bolsaFruta.addProducto(new Fruta("melocotón", 3.40, 1, "naranja"));
        bolsaFruta.addProducto(new Fruta("plátano", 2.10, 3, "amarillo"));
        bolsaFruta.addProducto(new Fruta("fresa", 2.30, 0.250, "rojo"));
        bolsaFruta.addProducto(new Fruta("sandía", 4.40, 5, "verde"));
        bolsaFruta.addProducto(new Fruta("pera", 2.20, 1.2, "verde"));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();

        bolsaLimpieza.addProducto(new Limpieza("lejía", 0.90, "hipoclorito sódico", 1));
        bolsaLimpieza.addProducto(new Limpieza("limpiador amoniacal", 1.10, "amoníaco", 1));
        bolsaLimpieza.addProducto(new Limpieza("lavavajillas", 4.50, "desengrasate", 1));
        bolsaLimpieza.addProducto(new Limpieza("fregasuelos", 1.80, "lejía limpiadora", 1));
        bolsaLimpieza.addProducto(new Limpieza("limpiacristales", 2.50, "alcohol", 1));

        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaNoPerecibles.addProducto(new NoPerecible("ginebra", 14.99, 1, 999));
        bolsaNoPerecibles.addProducto(new NoPerecible("cerveza", 5.50, 6, 140));
        bolsaNoPerecibles.addProducto(new NoPerecible("vino", 12.90, 1, 180));
        bolsaNoPerecibles.addProducto(new NoPerecible("ron", 13.90, 1, 750));
        bolsaNoPerecibles.addProducto(new NoPerecible("licor", 9.70, 1, 820));


    }
}