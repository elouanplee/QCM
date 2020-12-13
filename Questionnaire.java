import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class Questionnaire {
	private String Q;
	
	private ArrayList list_questions= new ArrayList<Question>();
	public int rng =(int) (Math.random()*4+1);
	
	
	public Questionnaire(){		
	}

	//public ArrayList<String> Question{
		
	//}
	
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		try{
			// TODO Auto-generated method stub
			Connect test= new Connect();
			System.out.println(test.getQuestion());
			System.out.println(test.getReponse());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

}
