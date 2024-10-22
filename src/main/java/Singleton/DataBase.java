package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBase {


    private static DataBase instancia;
    private Connection conexion;
    private DataBase() {
        try {

            String url = "jdbc:mysql://localhost:3306/tinofy";
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DataBase getInstancia() {
        if (instancia == null){

            instancia = new DataBase();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }
}
