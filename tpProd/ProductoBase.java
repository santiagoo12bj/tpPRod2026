package tpProd;

public class ProductoBase {
}
interface Producto {
    String descripcion();
    double precio();
}

class ProductoBase implements Producto {
    private String nombre;
    private double precio;

    public ProductoBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String descripcion() {
        return nombre;
    }

    public double precio() {
        return precio;
    }
}

// Clase abstracta Decorador
abstract class ProductoDecorator implements Producto {
    protected Producto productoDecorado;

    public ProductoDecorator(Producto producto) {
        this.productoDecorado = producto;
    }

    public String descripcion() {
        return productoDecorado.descripcion();
    }

    public double precio() {
        return productoDecorado.precio();
    }
}

class PackagingEcologico extends ProductoDecorator {
    public PackagingEcologico(Producto producto) {
        super(producto);
    }

    public String descripcion() {
        return productoDecorado.descripcion() + ", con packaging ecológico";
    }

    public double precio() {
        return productoDecorado.precio() + 2.0; // costo extra
    }
}

class DescuentoEspecial extends ProductoDecorator {
    public DescuentoEspecial(Producto producto) {
        super(producto);
    }

    public String descripcion() {
        return productoDecorado.descripcion() + ", con descuento especial";
    }

    public double precio() {
        return productoDecorado.precio() * 0.9; // 10% descuento
    }
}
