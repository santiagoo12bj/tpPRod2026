package tpProd;

public class ProductoFrescoMain {
}
public class AbstractFactoryTest {
    public static void main(String[] args) {
        SupermercadoFactory factory = new FrescoFactory();
        ProductoFresco fresco = factory.crearProductoFresco();
        ProductoEnvasado envasado = factory.crearProductoEnvasado();
        fresco.descripcion();
        envasado.descripcion();

        factory = new EnvasadoFactory();
        fresco = factory.crearProductoFresco();
        envasado = factory.crearProductoEnvasado();
        fresco.descripcion();
        envasado.descripcion();
    }
}
