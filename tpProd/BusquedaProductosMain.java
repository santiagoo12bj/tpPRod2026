package tpProd;

public class BusquedaProductosMain {
}
public class FacadeTest {
    public static void main(String[] args) {
        ProcesoVentaFacade ventaFacade = new ProcesoVentaFacade();
        ventaFacade.realizarVenta("cereal", "Cereal marca X", 120);
    }
}
