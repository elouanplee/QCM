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
;


public class Menu3 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton btn;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
   

   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu3 frame = new Menu3();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    
    public Menu3() {
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
        
        btn = new JButton("Culture artistique");
        btn.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
   
             }
 });
        btn1 = new JButton("Géographie");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
        btn2 = new JButton("Histoire");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
        btn3 = new JButton("Science et technologie");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
        btn4 = new JButton("Sport");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
   
            }
            });
       
       
        
        btn.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn.setBounds(220, 200, 259, 74);
        contentPane.add(btn);
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn1.setBounds(220, 300, 259, 74);
        contentPane.add(btn1);
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn2.setBounds(520, 200, 259, 74);
        contentPane.add(btn2);
        btn3.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn3.setBounds(520, 300, 259, 74);
        contentPane.add(btn3);
        btn4.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btn4.setBounds(380, 400, 259, 74);
        contentPane.add(btn4);
        
    }
        }
