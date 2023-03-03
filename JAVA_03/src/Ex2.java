import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean boolA;
	int x,y;
	System.out.print("첫번째 정수 입력 : ");
	x=sc.nextInt();
	System.out.printf("x 값은 : %d\n",x);
	System.out.print("두번째 정수 입력 : ");
	y=sc.nextInt();
	System.out.printf("y 값은 : %d\n",y);
	boolA=x > y;
	System.out.printf("결과는 %d > %d = %b\n",x,y,boolA);
	System.out.printf("더하기 결과는 %d + %d = %d\n", x,y,x+y);
}
}
