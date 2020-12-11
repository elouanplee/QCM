import java.util.ArrayList;
import java.util.Scanner;



public class Questionnaire {
	private String nom;
	private ArrayList list_questions= new ArrayList<Question>();
	public int rng =(int) (Math.random()*4+1);
	
	
	public Questionnaire(){
		
	}
	public String GetNom() {
		return nom;
	}
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Veuillez choisir un theme : ");
		String s = sc.next();
		System.out.println("Veuillez choisir une difficulte : ");
		String s1 = sc1.next();
		
		for(int i=0;i<10;i++) {
			

		}
		;
	}

}
