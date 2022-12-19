package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPrueba {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establecer conexion
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
			// Crear sentenci
			Statement sql = con.createStatement();
			// Ejecutar consulta
			ResultSet res = sql.executeQuery("select * from contactos");
			// Mostrar los resultados
			while (res.next()) {
				System.out.println("nombre = " + res.getString("nombre"));
    			System.out.println("telefono = " + res.getString("telefono"));
    			System.out.println("email = " + res.getString("email"));
				
			}
			sql.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}


