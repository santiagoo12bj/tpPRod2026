package tpProd;

public class ProductoMain {
}
public class FactoryMethodTest {
    public static void main(String[] args) {
        ProductFactory factory = new BebidaFactory();
        Producto producto = factory.crearProducto();
        producto.descripcion();

        factory = new AlimentoFactory();
        producto = factory.crearProducto();
        producto.descripcion();
    }
}
