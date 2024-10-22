package Singleton;

import Singleton.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseClient {

    public static void main(String[] args) {
        DataBase db = DataBase.getInstancia();


        try (Connection conexion = db.getConexion();
             Statement statement = conexion.createStatement()) {
            System.out.println("============================"+"\n"
                    + "TESTEO DE LA FUNCIONALIDAD"
                    +"\n"+"============================");
            // Consulta para obtener todos los registros de la tabla usuarios
            String query = "SELECT * FROM usuarios";
            ResultSet resultSet = statement.executeQuery(query);

            // Mostrar los registros
            while (resultSet.next()) {
                int idUsuario = resultSet.getInt("id_usuario");
                String usuario = resultSet.getString("usuario");
                String mail = resultSet.getString("mail");
                String clave = resultSet.getString("clave");
                String tipoUsuario = resultSet.getString("tipo_usuario");
                String fechaRegistro = resultSet.getString("fecha_registro");

                System.out.println("ID: " + idUsuario + ", Usuario: " + usuario + ", Mail: " + mail +
                        ", Clave: " + clave + ", Tipo Usuario: " + tipoUsuario +
                        ", Fecha Registro: " + fechaRegistro);
            }

            System.out.println("============================"+"\n"
                    + "TESTEO DEL PATRON SINGLETON"
                    +"\n"+"============================");

            //accion que levanta un error ya que el constructor es PRIVADO
            // Singleton.DataBase db2 = new Singleton.DataBase();




            //se vuelve a referenciar pero sigue siendo el mismo espacio en memoria
            DataBase db3 = DataBase.getInstancia();
            System.out.println("db: " + db);
            System.out.println("db3: " + db3);

            // Verificar que db y db3 son la misma instancia
            if (db == db3) {
                System.out.println("db y db3 son la misma instancia.");
            } else {
                System.out.println("db y db3 son diferentes instancias.");
            }

        } catch (Exception e) {

            System.out.println("⚠ ⚠ ⚠ ERROR EN LA CONEXIÓN A LA DB ⚠ ⚠ ⚠");
        }




    }
}
