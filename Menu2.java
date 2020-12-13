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


public class Menu2 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btn;
    private JButton btn1;
    private JButton btn2;
    

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu2 frame = new Menu2();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public Menu2() {
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
        
        btn = new JButton("Facile");
        btn.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
   
             }
 });
        btn1 = new JButton("Moyen");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
        btn2 = new JButton("Difficile");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
     
       
        
        btn.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn.setBounds(360, 200, 259, 74);
        contentPane.add(btn);
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn1.setBounds(360, 300, 259, 74);
        contentPane.add(btn1);
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn2.setBounds(360, 400, 259, 74);
        contentPane.add(btn2);
        
    }
        }