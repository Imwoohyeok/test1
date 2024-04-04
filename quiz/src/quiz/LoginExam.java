package quiz;

public class LoginExam {

	public static void main(String[] args) {
		
		Login a = new Login();
		
		boolean a1 = a.loginCheck("dladngur", "1234", "임우혁");
		
		// 계정있는지 확인방법
		// 바로 환영창확인
		a.doLogin();	//상속
		
		
		
		
	}

}
