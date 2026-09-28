package tpProd;

public interface Producto {
}
interface Producto {
    void descripcion();
}

class Alimento implements Producto {
    public void descripcion() {
        System.out.println("Producto Alimenticio");
    }
}

class Bebida implements Producto {
    public void descripcion() {
        System.out.println("Producto Bebida");
    }
}

class Electronica implements Producto {
    public void descripcion() {
        System.out.println("Producto Electrónico");
    }
}

abstract class ProductFactory {
    abstract Producto crearProducto();
}

class AlimentoFactory extends ProductFactory {
    public Producto crearProducto() {
        return new Alimento();
    }
}

class BebidaFactory extends ProductFactory {
    public Producto crearProducto() {
        return new Bebida();
    }
}

class ElectronicaFactory extends ProductFactory {
    public Producto crearProducto() {
        return new Electronica();
    }
}
