import java.util.Scanner;

public class ArithTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 입력하세요 : ");
		int input1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력하세요: ");
		int input2=sc.nextInt();
		
		int sum=input1+input2;
		int sub=input1-input2;
		int multi=input1*input2;
		int div=input1/input2;
		int mod=input1%input2;
		
		System.out.printf("첫번째 정수: %d + 두번째 정수: %d = %d\n",input1, input2, sum);
		System.out.printf("첫번째 정수: %d - 두번째 정수: %d = %d\n",input1, input2, sub);
		System.out.printf("첫번째 정수: %d * 두번째 정수: %d = %d\n",input1, input2, multi);
		System.out.printf("첫번째 정수: %d / 두번째 정수: %d = %d\n",input1, input2, div);
		System.out.printf("첫번째 정수: %d %% 두번째 정수: %d = %d\n",input1, input2, mod);
	}

}
