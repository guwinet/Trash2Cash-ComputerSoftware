package TrashToCashSystem;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DatabaseConnection {
    
    public static JFrame frame;
    public static Connection connectionDB(){
        Connection connect = null;
        try{
            //jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //open connection
                connect = DriverManager.getConnection("jdbc:mysql://trashtocash.ct4y4fftuuiu.ap-southeast-2.rds.amazonaws.com:3306/trash_to_cash","cenrolipa","trashtocash");
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(frame, "There's an error while connecting to database.");
            
        }
         return connect;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}