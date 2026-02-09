package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_update {

    private static String url = "jdbc:mysql://localhost:3306/stu";
            private static  String user = "root";
                    private static  String pass ="root123";

    public static void main(String[] args) {

        String sql = "update student set dept = ? where id = ?";

        try {
            Connection co = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = co.prepareStatement(sql);{

                ps.setString(1,"tamil");
                ps.setInt(2,3);


                int rows = ps.executeUpdate();

                System.out.println(rows + "Updated");


            }


        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }


}









