
public class Question {
String question;
String vrai_reponse;
Reponse liste_reponses;
int random=(int) ((Math.random()+1)*59);
	
	public Question() {
		Connect("Select * FROM  qcm ");
	}
	
	public void getQuestion() {
		
	}
	
}
