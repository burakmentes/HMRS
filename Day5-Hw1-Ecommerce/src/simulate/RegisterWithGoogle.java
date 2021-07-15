package simulate;

public class RegisterWithGoogle{
	private String name;
	private String surname;
	private String email;
	private String pw;
	
	public RegisterWithGoogle(String name, String surname, String email, String pw) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	


}
