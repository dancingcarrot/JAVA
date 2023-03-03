import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("byte 형 정수값 입력");
		Byte bt=sc.nextByte();   //-128~127
		System.out.println("바이트형의 정수값은 : "+bt );
		System.out.print("int 형 정수값 입력");
		int it=sc.nextInt();  //-2147483648 ~2147483648
		System.out.println("int의 정수값은 : " +it);
		System.out.print("문자[A~Z] / [a~z] 이중에서 입력하세요.");
		int oneChar=System.in.read();
		System.out.println((char)oneChar);
		
		
		
		
	
		/*int a1=3;
		int b1=4;
		
		int sum=0;
		sum=a1+b1;
		
		System.out.println(sum);*/
	}

}
