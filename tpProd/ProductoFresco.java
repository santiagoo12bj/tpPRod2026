package tpProd;

public interface ProductoFresco {
}
interface ProductoFresco {
    void descripcion();
}

interface ProductoEnvasado {
    void descripcion();
}

class Fruta implements ProductoFresco {
    public void descripcion() {
        System.out.println("Producto fresco: Fruta");
    }
}

class Verdura implements ProductoFresco {
    public void descripcion() {
        System.out.println("Producto fresco: Verdura");
    }
}

class Lata implements ProductoEnvasado {
    public void descripcion() {
        System.out.println("Producto envasado: Lata");
    }
}

class Botella implements ProductoEnvasado {
    public void descripcion() {
        System.out.println("Producto envasado: Botella");
    }
}

interface SupermercadoFactory {
    ProductoFresco crearProductoFresco();
    ProductoEnvasado crearProductoEnvasado();
}

class FrescoFactory implements SupermercadoFactory {
    public ProductoFresco crearProductoFresco() {
        return new Fruta();
    }
    public ProductoEnvasado crearProductoEnvasado() {
        return new Botella();
    }
}

class EnvasadoFactory implements SupermercadoFactory {
    public ProductoFresco crearProductoFresco() {
        return new Verdura();
    }
    public ProductoEnvasado crearProductoEnvasado() {
        return new Lata();
    }
}
