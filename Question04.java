public class Question04 {
	public static void main(String[] args) {
		System.out.println(add(5,3));
		System.out.println(sub(9,7));
		System.out.println(mul(8,4));
		System.out.println(div(12,6));
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
	}//div()
}//class
