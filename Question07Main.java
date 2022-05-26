import java.util.Scanner;

public class Question07Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력 하세요");
		int dan =Integer.parseInt(scanner.nextLine());
		System.out.println(dan+"단을 출력합니다.");
		
		for (int i = 1; i <=9; i++) {
			System.out.println(dan+"x"+i+"= " +dan*i);
		}//for
		
		scanner.close();
	}//main()
}//class
