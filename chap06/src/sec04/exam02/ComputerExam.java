package sec04.exam02;

public class ComputerExam {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		// 전달인자 null일때 : NullPointerException
		// 	 	 이유는 :
		// 전달인자 아무것도 없을 때 : 0
		// 		 이유는 :
		
		int result = com.sum2(1);
		System.out.println("result :" + result);

	}

}
