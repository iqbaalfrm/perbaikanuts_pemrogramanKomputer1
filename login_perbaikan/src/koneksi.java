
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IQBAL
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/datalogin", "root", "");
            stm = con.CreateStatment();
        }catch (Exception e){
            JOptionpane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
        }
    }
}
