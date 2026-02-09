package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_Delete {

    private static String url = "jdbc:mysql://localhost:3306/stu";
    private static String user = "root";
    private static String pass = "root123";

    public static void main(String[] args) {

        String sql = "delete from student where id=?";
        try {
            Connection co = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = co.prepareStatement(sql);{


            ps.setInt(1, 15);


            int rows = ps.executeUpdate();

            System.out.println(rows + "Delete Successfully");
        }

            }catch(Exception e){
                throw new RuntimeException(e);
            }


        }
    }
