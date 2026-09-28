package tpProd;

public class PromocionMain {
}
public class AdapterTest {
    public static void main(String[] args) {
        SistemaPromocionesExterno sistemaExterno = new SistemaPromocionesExterno();
        Promocion promocion = new PromocionAdapter(sistemaExterno);
        promocion.aplicarPromocion();
    }
}
