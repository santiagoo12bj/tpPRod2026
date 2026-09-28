package tpProd;

public class DataBaseConnection {
}
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {
        // Inicializa conexión (simulada)
    }
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void query(String sql) {
        System.out.println("Ejecutando query: " + sql);
    }
}
