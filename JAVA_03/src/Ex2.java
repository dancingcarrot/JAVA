import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean boolA;
	int x,y;
	System.out.print("ù��° ���� �Է� : ");
	x=sc.nextInt();
	System.out.printf("x ���� : %d\n",x);
	System.out.print("�ι�° ���� �Է� : ");
	y=sc.nextInt();
	System.out.printf("y ���� : %d\n",y);
	boolA=x > y;
	System.out.printf("����� %d > %d = %b\n",x,y,boolA);
	System.out.printf("���ϱ� ����� %d + %d = %d\n", x,y,x+y);
}
}
