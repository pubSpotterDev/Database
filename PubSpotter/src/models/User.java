package models;

public class User {

	private String email,name,gender, dob;

	private int id, points;

	public User(int id, String email, String name, String dob, String gender, int points) {

		this.email = email;
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.dob = dob;		
		this.points = points;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {

		return "User [email=" + email + ", name=" + name + ", gender=" + gender + ", id="

				+ id + ", dob=" + dob + ", points=" + points + "]";
	}
}