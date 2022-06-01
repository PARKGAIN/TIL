import java.util.Scanner;
public class Question03Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 :");
		int x = Integer.parseInt(scanner.nextLine()); 
		System.out.println("두번째 정수를 입력하세요 :");
		int y = Integer.parseInt(scanner.nextLine()); 
		
		System.out.println(add(x,y));
		System.out.println(sub(x,y));
		System.out.println(mul(x,y));
		System.out.println(div(x,y));
		
	}//main()
	
	public static int add(int x,int y) {
		return x+y;
	}//add()
	public static int sub(int x,int y) {
		return x-y;	//결과가 음수?
	}//sub()
	
	public static int mul(int x, int y) {
		return x*y;
	}//mul()
	
	public static int div(int x, int y) {
		return x/y;
	}
}
