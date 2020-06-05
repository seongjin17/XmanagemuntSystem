
public class teacher extends People {
	private String subject;

	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void people() {		
		super.people();
		System.out.println("°ú¸ñ"+this.subject);
		
	}
}
