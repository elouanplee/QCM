

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;




public class Connect {
    private String url = "jdbc:mysql://localhost:3306/qcm"; //partie connexion
    private String user = "root";
    private String passwd = "root";
    private String tableau[] = new String[11];
    public int rnd =(int) (Math.random()*19+1);
    
    /**
     * 
     * @param requete
     */
    public Connect() {
        try {
        	Scanner sc = new Scanner(System.in);
    		Scanner sc1 = new Scanner(System.in);
    		
    		System.out.println("Veuillez choisir un theme : ");
    		String s = sc.next();
    		System.out.println("Veuillez choisir une difficulte : ");
    		String s1 = sc1.next();


            Connection conn = DriverManager.getConnection(url, user, passwd);
             System.out.println("Connexion effective !");

            Statement state = (Statement) conn.createStatement();//création objet statement pour recupérer résultat
            ResultSet result = state.executeQuery(" Select * from qcm where theme==s and Difficulte==s1 ");//requete
            ResultSetMetaData resultMeta = (ResultSetMetaData) result.getMetaData();


			   /*   for(int i = 1; i <= resultMeta.getColumnCount(); i++)// prends toutes les lignes set colonnes du tableau
			        System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
			      */

            while (result.next()) {

                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {

                    tableau[i] = (result.getObject(i).toString());
                    // System.out.println(tableau[i]);


                }
            }
            /*    while(result.next()){
			    	  System.out.print("\t" + result.getInt("numHéro") + "\t |"); // affiche seulement numHéro et héro
			    	  System.out.print("\t" + result.getString("héro") + "\t |");
			    	  System.out.println("\n---------------------------------");
			    	}*/

        } catch (Exception e) {
            e.printStackTrace();

        }
        try {

            String requete2 = "Select R1,R2,R3,R4 from objets where Difficulte=";
            Connection conn = DriverManager.getConnection(url, user, passwd);

            Statement state1 = (Statement) conn.createStatement();// création objet statement pour recupérer résultat
            ResultSet result1 = state1.executeQuery(requete2);
            ResultSetMetaData resultMeta = (ResultSetMetaData) result1.getMetaData();

            while (result1.next()) {

                for (int i = 1; i <= 10; i++) {
                    String Tab[] =  new String[10];
                    result1.toString();

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    
  

    public String[] getResult() {
        return tableau;
    }

}
