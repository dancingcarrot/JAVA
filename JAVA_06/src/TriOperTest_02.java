import java.util.Scanner;

public class TriOperTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("객체지향프로그램 점수입력:");
		int sub1=sc.nextInt();
		System.out.print("교양영어 점수입력:");
		int sub2=sc.nextInt();
		System.out.print("전산개론 점수입력:");
		int sub3=sc.nextInt();
		
		int total=sub1+sub2+sub3;
		int avg=total/3;
		String result =(avg>=70)?"합격":"불합격";
		
		System.out.printf("\n총점=%d, 평균=%d, 결과=%s\n", total, avg, result);

	}

}
