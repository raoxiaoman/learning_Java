package com.raohui;
import java.sql.*;
class JDBCTest{
    private Connection connection;
    public JDBCTest(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            System.out.println("驱动加载成功！");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql:"+"//127.0.0.1:3306/test?serverTimezone=UTC&characterEncoding=utf-8","root","raohui123");
            System.out.println("数据库连接成功！");
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void test(){
        System.out.println("-------test_select---------");
        try {
            Statement sql = connection.createStatement();
            ResultSet resultSet = sql.executeQuery("select * from student");
            while(resultSet.next()){
                String sno = resultSet.getString("sno");
                String sname = resultSet.getString("sname");
                String sex = resultSet.getString("sex");
                Integer sage = resultSet.getInt("sage");
                System.out.println("sno:"+sno+",sname:"+sname+",sex:"+sex+",sage:"+sage);
            }
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public void test_pre(){

        System.out.println("-------test_select_join---------");
        PreparedStatement sql = null;
        try {
            sql = connection.prepareStatement("select student.sname,sc.cno,sc.grade from student join sc on student.sno = sc.sno where student.sname = ?");
            sql.setString(1,"饶辉");
            ResultSet resultSet = sql.executeQuery();
            while(resultSet.next()){
                String sno = resultSet.getString(1);
                String sname = resultSet.getString(2);
                Integer grade = resultSet.getInt(3);
                System.out.println("sno:"+sno+",sname:"+sname+",grade:"+grade);
            }

            sql  = connection.prepareStatement("insert into sc values(?,?,?)");
            sql.setString(1,"20113");
            sql.setInt(2,5);
            sql.setInt(3,100);
            sql.executeUpdate();

            System.out.println("-------after insert---------");
            sql = connection.prepareStatement("select student.sname,sc.cno,sc.grade from student join sc on student.sno = sc.sno where student.sname = ?");
            sql.setString(1,"饶辉");
            resultSet = sql.executeQuery();
            while(resultSet.next()){
                String sno = resultSet.getString(1);
                String sname = resultSet.getString(2);
                Integer grade = resultSet.getInt(3);
                System.out.println("sno:"+sno+",sname:"+sname+",grade:"+grade);
            }

            sql = connection.prepareStatement("update sc set grade = ? where sno = ? and cno = ?");
            sql.setInt(1,95);
            sql.setString(2,"20113"); 
            sql.setInt(3,5); 
            sql.executeUpdate();

            System.out.println("-------after update---------");
            sql = connection.prepareStatement("select student.sname,sc.cno,sc.grade from student join sc on student.sno = sc.sno where student.sname = ?");
            sql.setString(1,"饶辉");
            resultSet = sql.executeQuery();
            while(resultSet.next()){
                String sno = resultSet.getString(1);
                String sname = resultSet.getString(2);
                Integer grade = resultSet.getInt(3);
                System.out.println("sno:"+sno+",sname:"+sname+",grade:"+grade);
            }

            sql = connection.prepareStatement("delete from sc where sno = ? and cno = ?");
            sql.setString(1,"20113"); 
            sql.setInt(2,5); 
            sql.executeUpdate();

            System.out.println("-------after delete---------");
            sql = connection.prepareStatement("select student.sname,sc.cno,sc.grade from student join sc on student.sno = sc.sno where student.sname = ?");
            sql.setString(1,"饶辉");
            resultSet = sql.executeQuery();
            while(resultSet.next()){
                String sno = resultSet.getString(1);
                String sname = resultSet.getString(2);
                Integer grade = resultSet.getInt(3);
                System.out.println("sno:"+sno+",sname:"+sname+",grade:"+grade);
            }

        } catch(Exception e){
            e.printStackTrace();
        }


    }
    public void closeCon(){
        try {
            connection.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
public class App
{
    public static void main( String[] args )
    {
        JDBCTest jdbcTest = new JDBCTest();
        jdbcTest.test();
        jdbcTest.test_pre();
        jdbcTest.closeCon();
    }
}
