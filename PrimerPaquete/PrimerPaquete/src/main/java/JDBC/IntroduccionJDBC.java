package JDBC;

import java.sql.*;

public class IntroduccionJDBC {

    public static void main(String[] args) {
        //paso 1 creamos nuestra conexion a mysql
        String url = "jdbc:mysql://localhost:3306/tests?useSSL=false&serverTimezone=UTC ";
        //paso 2 creamos el objeto de conexion a la base de datos 
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            //paso 3 Creamos un objeto statement 
            Statement instruccion = conexion.createStatement();
            //Paos 4 creamos un query
            String sql = "selelct id_Persona, nombre, apellido, email, telefono from persona172";
            //paso 5 ejecucion del query
            ResultSet resultado = instruccion.executeQuery(sql);
            //paso 6 procesamos el resultado 
            while (resultado.next()) {
                System.out.print("id persona:" + resultado.getInt(1));
                System.out.print(" Nombre:" + resultado.getString(2));
                System.out.print(" Apellido" + resultado.getString(3));
                System.out.print(" Email" + resultado.getString(4));
                System.out.print(" Telefono" + resultado.getString(5));
            }
            //cerrramos cada objeto creado 
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
