package tpProd;

public class DecoratorTest {
}
public class DecoratorTest {
    public static void main(String[] args) {
        Producto producto = new ProductoBase("Cereal", 10.0);
        System.out.println(producto.descripcion() + " - Precio: " + producto.precio());

        producto = new PackagingEcologico(producto);
        System.out.println(producto.descripcion() + " - Precio: " + producto.precio());

        producto = new DescuentoEspecial(producto);
        System.out.println(producto.descripcion() + " - Precio: " + producto.precio());
    }
}
