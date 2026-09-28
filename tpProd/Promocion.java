package tpProd;

public interface Promocion {
}
interface Promocion {
    void aplicarPromocion();
}

// Sistema externo no modificable
class SistemaPromocionesExterno {
    public void activarPromocionEspecial() {
        System.out.println("Promoción externa activada");
    }
}

// Adapter que adapta la interfaz externa a Promocion
class PromocionAdapter implements Promocion {
    private SistemaPromocionesExterno sistemaExterno;

    public PromocionAdapter(SistemaPromocionesExterno sistema) {
        this.sistemaExterno = sistema;
    }

    public void aplicarPromocion() {
        sistemaExterno.activarPromocionEspecial();
    }
}
