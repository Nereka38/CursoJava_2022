package html.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPrueba {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. levantar el driver
		Class.forName("com.mysql.jdbc.Driver");
		//2. establecer una conexion
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini_arg", "root", "admin");
		//3. creamos la sentencia
		Statement sql = con.createStatement();
		//4. ejecuto la consulta
		ResultSet rs = sql.executeQuery("select employee_id,first_name, last_name, salary from employees;");
		
		//5. muestro los resultados
		while(rs.next()) {
			System.out.println("id=" + rs.getInt("employee_id"));
			System.out.println("first_name" + rs.getString("first_name"));
			System.out.println("last_name" + rs.getString("last_name"));
			System.out.println("salary" + rs.getFloat("salary"));
			System.out.println("-------------------------------------------");
		}
		
		con.close();
		sql.close();
	}
}
