
public class VarTest1 {
	public static void main(String[] args) {
		// (멤버)변수 선언
		  int x, y, sum;
		  double d1, d2, dsum;
		  char c;
		  boolean b;
		  String s;
		  
		  x=3;
		  y=5;
		  d1=12.34;
		  d2=23.45;
		  c='W';
		  b=true;
		  s="I like java";
		  
		  sum=x+y;
		  dsum=d1+d2;
		  
		  System.out.printf("x= %d,y=%d, 합은  sum= %d\n", x,y,sum);
		  System.out.printf("d1=%.2f, d1=%.2f, 합은 dsum=%.3f\n",d1,d2,dsum);
		  System.out.printf("문자값 c= %c\n", c);
		  System.out.printf("불린값 b= %b\n", b);
		  System.out.printf("문자열 s= %s\n", s);
		  
	}
}
