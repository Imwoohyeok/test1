package array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력받을 숫자의 개수를 입력하세요");
		int count = scanner.nextInt();
		
		
		int[] num = new int[count];
		int sum = 0;
		double average;
		
		
		System.out.println(count + "개의 정수를 입력하세요");
		for(int i=0; i < count; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		
		average = (double)sum / count;
		
		
		// 최대값, 최소값 찾는 방법
		int max,min;	
		min = num[0];
		max = num[0];
		
		for(int i = 1; i < count; i++) {
			if(num[i] < min) {
				min = num[i];
			}
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + average);
		System.out.println("max :" + max);
		System.out.println("min :" + min);
		
	}

}
