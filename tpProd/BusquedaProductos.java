package tpProd;

public class BusquedaProductos {
}
class BusquedaProductos {
    public void buscar(String criterio) {
        System.out.println("Buscando productos con: " + criterio);
    }
}

class GestionVenta {
    public void seleccionarProducto(String producto) {
        System.out.println("Producto seleccionado: " + producto);
    }
    public void realizarPago(double monto) {
        System.out.println("Pago realizado por: $" + monto);
    }
}

class EmisionTicket {
    public void emitir() {
        System.out.println("Ticket emitido, gracias por su compra.");
    }
}

class ProcesoVentaFacade {
    private BusquedaProductos busqueda;
    private GestionVenta venta;
    private EmisionTicket ticket;

    public ProcesoVentaFacade() {
        busqueda = new BusquedaProductos();
        venta = new GestionVenta();
        ticket = new EmisionTicket();
    }

    public void realizarVenta(String criterioBusqueda, String productoSeleccionado, double monto) {
        busqueda.buscar(criterioBusqueda);
        venta.seleccionarProducto(productoSeleccionado);
        venta.realizarPago(monto);
        ticket.emitir();
    }
}
