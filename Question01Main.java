import java.util.Scanner;

public class Question01Main {
	public static void main(String[] args) {
		Question01 q = new Question01();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요");
		double radius = Double.parseDouble(scanner.nextLine());
		q.getRadius(radius);
		System.out.println("반지름 : "+  q.getRadius(radius));
		q.getArea(radius);
		System.out.println("원의 넓이 : " + q.getArea(radius));
		
		System.out.println("Question02");
		q.getRadius(5);
		System.out.println("반지름 : "+  q.getRadius(5));
		q.getArea(5);
		System.out.println("원의 넓이 : " + q.getArea(5));
		
		
	}//main()
}//class
