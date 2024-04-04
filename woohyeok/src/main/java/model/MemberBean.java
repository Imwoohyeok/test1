package model;

public class MemberBean {
	// DTO 작성(DB 와 java 데이터 교환)
	
	private String id;
	private String pw;
	private String phone;
	private String hobby;
	private String job;
	private String age;
	
	//기본 생성자
	public MemberBean() {
		
	}
	// 오버로딩
	public MemberBean(String id, String pw, String phone, String hobby, String job, String age) {
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.hobby = hobby;
		this.job = job;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
