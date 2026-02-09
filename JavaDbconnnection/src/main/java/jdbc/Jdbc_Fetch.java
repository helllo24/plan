package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_Fetch {
  private static  String url ="jdbc:mysql://localhost:3306/stu";
    private static String user = "root";
    private static String pass = "root123";
    public static void main(String[] args) {

        String sql = "select * from student";
try {
    Connection co = DriverManager.getConnection(url, user, pass);
    PreparedStatement ps = co.prepareStatement(sql);

    ResultSet rs = ps.executeQuery();

    while (rs.next()){
        System.out.println(
                rs.getInt("id") + " " +
                 rs.getString("name") + " " +
                        rs.getString("registernumber") + " " +
                        rs.getInt("phoneno") + " " +
                        rs.getString("dept")







        );
    }


}catch (Exception e) {
    throw new RuntimeException(e);
}
    }

}
