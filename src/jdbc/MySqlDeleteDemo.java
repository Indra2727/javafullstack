package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class MySqlDeleteDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/javafullstack";
        String username = "root";
        String password = "Password";

        final String QUERY = "delete from emp where empno = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            ps = con.prepareStatement(QUERY);
            ps.setInt(1,121);
            int no = ps.executeUpdate();
            System.out.println(no + " row/s affected");
        } catch (ClassNotFoundException | SQLException  e) {
            System.out.println(e.getMessage());
        }finally {
            con.close();
            ps.close();
        }
    }
}
