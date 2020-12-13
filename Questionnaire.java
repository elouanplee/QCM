import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class Questionnaire {
	private String Q;
	private static ArrayList list_questions= new ArrayList<String>();
	private static ArrayList list_rep= new ArrayList<String>();
	private static ArrayList list_rep2= new ArrayList<String>();
	private static ArrayList list_rep3= new ArrayList<String>();
	private static ArrayList list_rep4= new ArrayList<String>();
	public int rng =(int) (Math.random()*4+1);
	
	
	public Questionnaire(){		
	}

	//public ArrayList<String> Question{
		
	//}
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		try{
			// TODO Auto-generated method stub
			// Etablissement de la connexion et appel des methodes pour récupérer les Questions et les réponses aux questions
			Connect test= new Connect();
			list_questions=test.getQuestion();
			list_rep=test.getReponse();
			list_rep2=test.getReponse2();
			list_rep3=test.getReponse3();
			list_rep4=test.getReponse4();
			System.out.println(list_questions);
			System.out.println(list_rep);
			System.out.println(list_rep2);
			System.out.println(list_rep3);
			System.out.println(list_rep4);
			
			//System.out.println(test.getQuestion());
			//System.out.println(test.getReponse());
				
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
