package PROJET;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Inscription extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nom;
    private JPasswordField mdp;
    private JButton btn;
    private String url = "jdbc:mysql://localhost:3306/progpp"; //partie connexion
	private String user = "root";
	private String passwd = "root";

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Inscription frame = new Inscription();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public Inscription() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblconnexion = new JLabel("Nouvelle utilisateur");
        lblconnexion.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblconnexion.setBounds(362, 52, 500, 50);
        contentPane.add(lblconnexion);

        nom = new JTextField();
        nom.setFont(new Font("Tahoma", Font.PLAIN, 32));
        nom.setBounds(407, 151, 228, 50);
        contentPane.add(nom);
        nom.setColumns(10);

        JLabel lblnom = new JLabel("Nom");
        lblnom.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblnom.setBounds(242, 159, 99, 29);
        contentPane.add(lblnom);

        JLabel lblmdp = new JLabel("Mot de passe");
        lblmdp.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblmdp.setBounds(242, 245, 200, 24);
        contentPane.add(lblmdp);
        
        mdp = new JPasswordField();
        mdp.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mdp.setBounds(407, 235, 228, 50);
        contentPane.add(mdp);

        btn = new JButton("Inscription");
        btn.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                String Nom = nom.getText();
                @SuppressWarnings("deprecation")
				String Mdp = mdp.getText();


                try {
                	Class.forName("com.mysql.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,user,passwd);

                    String query = "INSERT INTO personnage values('" + Nom + "','" +Mdp +  "','"+"joueur"+"')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Ce nom existe déjà");
                    } else {
                        JOptionPane.showMessageDialog(null,"Nouveau compte créé avec succés");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btn.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn.setBounds(399, 447, 259, 74);
        contentPane.add(btn);
    }
}