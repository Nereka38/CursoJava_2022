package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcContacto2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		// 2. establecer una conexion
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
		// 3. creamos la sentencia
		Statement sql = con.createStatement();
		// 4. ejecuto la consulta
		ResultSet rs = sql.executeQuery("select * from contacto;");

		// 5. muestro los resultados
		while (rs.next()) {
			System.out.println("nombre: " + rs.getString("nombre"));
			System.out.println("email: " + rs.getString("email"));
			System.out.println("-------------------------------------------");
		}

		con.close();
		sql.close();
	}
}
