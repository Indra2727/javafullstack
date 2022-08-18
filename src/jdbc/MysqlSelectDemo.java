package jdbc;
import java.sql.*;
public class MysqlSelectDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/javafullstack";
        String username = "root";
        String password = "Password";
        final String SELECT_QUERY = "select * from emp;";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(SELECT_QUERY);
        System.out.println("Id "+ " Name "+" Job "+ " MGR "+" Hiredate ");
        while (rs.next()){
            System.out.print(rs.getInt(1)+"  ");
            System.out.print(rs.getString(2)+"  ");
            System.out.print(rs.getString(3)+"  ");
            System.out.print(rs.getString(4)+"  ");
            System.out.println(rs.getDate(5)+"  ");
        }
    }
}
