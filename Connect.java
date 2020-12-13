

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;



public class Connect {
	private int id;
	private String question;
	private String reponse1;
	private String reponse2;
	private String reponse3;
	private String reponse4;
	private String difficulte;
    static String url = "jdbc:mysql://localhost:3306/qcm"; //partie connexion
    static String user = "root";
    static String passwd = "root";
    public int rnd =(int) (Math.random()*19+1);
    static ArrayList<String> tableau = new ArrayList<String>();
    static ArrayList<String> res = new ArrayList<String>();
    
    
    public void setId(int id) {
        this.id = id;
    }
    public String getQ() {
        return question;
    }
    public void setQ(String question) {
        this.question = question;
    }
    public String getR1() {
        return reponse1;
    }
    public String getR2() {
        return reponse2;
    }
    public String getR3() {
        return reponse3;
    }
    public String getR4() {
        return reponse4;
    }
    public String getDif() {
        return difficulte;
    }
    public void setDif(String difficulte) {
        this.difficulte = difficulte;
    }
    /**
     * 
     * @param requete
     */
    public Connect() {
    	/*
        try {
        	Scanner sc = new Scanner(System.in);
    		Scanner sc1 = new Scanner(System.in);
    		
    		/*System.out.println("Veuillez choisir un theme : ");
    		String s = sc.next();
    		System.out.println("Veuillez choisir une difficulte : ");
    		String s1 = sc1.next();


            Connection conn = DriverManager.getConnection(url, user, passwd);
            

            Statement state = (Statement) conn.createStatement();//création objet statement pour recupérer résultat
            ResultSet result = state.executeQuery(" Select * from qcm where theme=sport and Difficulte=facile ");//requete
            ResultSetMetaData resultMeta = (ResultSetMetaData) result.getMetaData();


			      for(int i = 1; i <= resultMeta.getColumnCount(); i++)// prends toutes les lignes set colonnes du tableau
			        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
			      
            
            	
            //récupère les questions
            while (result.next()) { 
            		 int idQuestion= result.getInt( "idQ" );
             	    String Question = result.getString( "Q" );
             	    String premiereReponse = result.getString( "R1" );
             	    String deuxiemeReponse  = result.getString( "R2" );
             	    String troisiemeReponse  = result.getString( "R3" );
             	    String quatriemeReponse  = result.getString( "R4" );        
             	   for (int i = 1; i <= 10; i++) {
                      tableau.add(Question);
                      res.add(premiereReponse);
                      res.add(deuxiemeReponse);
                      res.add(troisiemeReponse);
                      res.add(quatriemeReponse);
             	   }
            	}
           
            	/*
            	for (int i = 1; i <= resultMeta.getColumnCount(); i++) {

                    tableau[i] = (result.getObject(i).toString());
                    // System.out.println(tableau[i]);

            }
           

        } catch (Exception e) {
            e.printStackTrace();

        }*/
        }
        
    public static ArrayList<String> getQuestion() throws ClassNotFoundException, SQLException {
        Connection conn=DriverManager.getConnection(url, user, passwd);
        java.sql.Statement stm;
        stm = conn.createStatement();
        String sql = "Select QHst From histoire";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<String> question = new ArrayList<>();
        while (rst.next()) {
            String res = new String(rst.getString("QHst"));
            question.add(res);
        }
        return question;
    }
    public static ArrayList<String> getReponse() throws ClassNotFoundException, SQLException {
        Connection conn=DriverManager.getConnection(url, user, passwd);
        java.sql.Statement stm;
        stm = conn.createStatement();
        String sql = "Select R1Hst From histoire";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<String> reponse = new ArrayList<>();
        while (rst.next()) {
            String res = new String(rst.getString("R1Hst"));
            reponse.add(res);
        }
        return reponse;
    }
    public static ArrayList<String> getReponse2() throws ClassNotFoundException, SQLException {
        Connection conn=DriverManager.getConnection(url, user, passwd);
        java.sql.Statement stm;
        stm = conn.createStatement();
        String sql = "Select R2Hst From histoire";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<String> reponse2 = new ArrayList<>();
        while (rst.next()) {
            String res2 = new String(rst.getString("R2Hst"));
            reponse2.add(res2);
        }
        return reponse2;
    }
    
    public static ArrayList<String> getReponse3() throws ClassNotFoundException, SQLException {
        Connection conn=DriverManager.getConnection(url, user, passwd);
        java.sql.Statement stm;
        stm = conn.createStatement();
        String sql = "Select R3Hst From histoire";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<String> reponse3 = new ArrayList<>();
        while (rst.next()) {
            String res3 = new String(rst.getString("R3Hst"));
            reponse3.add(res3);

        }
        return reponse3;
    }
    
    public static ArrayList<String> getReponse4() throws ClassNotFoundException, SQLException {
        Connection conn=DriverManager.getConnection(url, user, passwd);
        java.sql.Statement stm;
        stm = conn.createStatement();
        String sql = "Select R4Hst From histoire";
        ResultSet rst;
        rst = stm.executeQuery(sql);
        ArrayList<String> reponse4 = new ArrayList<>();
        while (rst.next()) {
            String res4 = new String(rst.getString("R4Hst"));
            reponse4.add(res4);
        }
        return reponse4;
    }

    
  

}
