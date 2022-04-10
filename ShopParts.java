import com.mysql.cj.x.protobuf.MysqlxPrepare;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShopParts {
    private JPanel Main;
    private JTextField txtBrand;
    private JTable table1;
    private JButton buyButton;
    private JTextField txtid;
    private JTextField txtModel;
    private JTextField txtYear;
    private JTextField txtPart;
    private JButton searchButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("ShopParts");
        frame.setContentPane(new ShopParts().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Connection con;
    PreparedStatement pst;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/parts", "root", "");
            System.out.println("Successssss");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public ShopParts() {
        connect();
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
