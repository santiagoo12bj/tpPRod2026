package tpProd;

public class DataBaseMain {
}
public class SingletonTest {
    public static void main(String[] args) {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        conn1.query("SELECT * FROM productos");
        System.out.println("¿Misma instancia? " + (conn1 == conn2));
    }
}
