import java.util.Scanner;

public class TriOperTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("��ü�������α׷� �����Է�:");
		int sub1=sc.nextInt();
		System.out.print("���翵�� �����Է�:");
		int sub2=sc.nextInt();
		System.out.print("���갳�� �����Է�:");
		int sub3=sc.nextInt();
		
		int total=sub1+sub2+sub3;
		int avg=total/3;
		String result =(avg>=70)?"�հ�":"���հ�";
		
		System.out.printf("\n����=%d, ���=%d, ���=%s\n", total, avg, result);

	}

}
