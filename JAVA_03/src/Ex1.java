import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("byte �� ������ �Է�");
		Byte bt=sc.nextByte();   //-128~127
		System.out.println("����Ʈ���� �������� : "+bt );
		System.out.print("int �� ������ �Է�");
		int it=sc.nextInt();  //-2147483648 ~2147483648
		System.out.println("int�� �������� : " +it);
		System.out.print("����[A~Z] / [a~z] ���߿��� �Է��ϼ���.");
		int oneChar=System.in.read();
		System.out.println((char)oneChar);
		
		
		
		
	
		/*int a1=3;
		int b1=4;
		
		int sum=0;
		sum=a1+b1;
		
		System.out.println(sum);*/
	}

}
