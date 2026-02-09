package jdbc;

import java.sql.*;

public class Jdbc_Insert {

    private static String url = "jdbc:mysql://localhost:3306/stu";
    private static String user = "root";
    private static String pass = "root123";


    public static void main(String[] args) {

        String sql = "insert into student (id,name,registernumber,phoneno,dept) values(?, ?, ?, ?, ?)";

        try
                (Connection co = DriverManager.getConnection(url, user, pass);
                 PreparedStatement ps = co.prepareStatement(sql)) {

            ps.setInt(1, 5);
            ps.setString(2,"amsu");
            ps.setString(3,"c2s25564");
            ps.setInt(4,45546546);
            ps.setString(5,"cs");



            ps.setInt(1, 15);
            ps.setString(2,"masss");
            ps.setString(3,"c2s25564");
            ps.setInt(4,478786546);
            ps.setString(5,"bcom");

            ps.setInt(1, 7);
            ps.setString(2,"sudha");
            ps.setString(3,"c2s25564");
            ps.setInt(4,478786546);
            ps.setString(5,"bcom");
            ps.addBatch();

            ps.setInt(1, 8);
            ps.setString(2,"mani");
            ps.setString(3,"c2s25564");
            ps.setInt(4,478786546);
            ps.setString(5,"bcom");


            int[] rows = ps.executeBatch();

            System.out.println(rows + "Added Sucessfully");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


