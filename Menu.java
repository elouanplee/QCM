package PQCM;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Menu extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btn;
    private JButton btn1;


   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public Menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblmenu = new JLabel("MENU PRINCIPALE");
        lblmenu.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblmenu.setBounds(320, 52, 500, 50);
        contentPane.add(lblmenu);
        
        btn = new JButton("Inscription");
        btn.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		  if (e.getSource()==btn){
        		  }
                 
                 
                 
                 
             }
             });
        

        btn1 = new JButton("Connexion");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                
                    
               
            }
            });
       
        btn.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn.setBounds(360, 200, 259, 74);
        contentPane.add(btn);
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn1.setBounds(360, 300, 259, 74);
        contentPane.add(btn1);
        
    }
        }