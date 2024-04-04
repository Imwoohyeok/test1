package quiz;

public class Login {
	// 문제2번
	/*
	 * 계정만들기
	 * 
	 */
	// 클래스의 필드
	private String id = "dladngur";	// 아이디
	private String pass = "1234"; // 비번
	private String name = "임우혁"; // 이름
	
	
	public String getid() {			// getter로 접근이 제한된 요소에 접근하게 하자
		return this.id; // 필드에 이름을 반환함
	}
	public void setid(String id) {	// setter는 접근이 제한된 요소를 수정할 수 있게 함
		this.id = id;
	}
	
	public String getpass() {			// getter로 접근이 제한된 요소에 접근하게 하자
		return this.pass; // 필드에 이름을 반환함
	}
	public void setpass(String pass) {	// setter는 접근이 제한된 요소를 수정할 수 있게 함
		this.pass = pass;
	}
	
	public String getname() {			// getter로 접근이 제한된 요소에 접근하게 하자
		return this.name; // 필드에 이름을 반환함
	}
	public void sename(String name) {	// setter는 접근이 제한된 요소를 수정할 수 있게 함
		this.name = name;
	}
	

	//회원가입을 수행하는 메소드. 회원가입에 성공하면 true, 실패하면 false를 반환한다.
	public boolean loginCheck(String id, String pass, String name) {
		boolean loginCheck = false;
		if(loginCheck == false) {
			System.out.println("회원가입 성공");			
		} else {
			System.out.println("회원가입 실패");
		}
		return loginCheck;
	}
	
	//계정이 있는지 없는지
	boolean doLogin() {
		boolean doLogin = false;
		boolean loginCheck = true;
		if(doLogin != loginCheck) {
			System.out.println("계정이 있습니다");
			goMain();	//환영창
		} else {
			System.out.println("계정이 없습니다. 회원가입을 해주세요");
		}
		return true;
	}
	
	// 로그인해서 환영합니다 ! 띄우기
	void goMain(){
		boolean goMain = true;
		if(goMain == true) {
			System.out.println("환영합니다!!" + this.name + "님");			
		} else {
			System.out.println("로그인에 실패했습니다.");
		}
	}
}
