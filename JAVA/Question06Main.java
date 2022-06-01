import java.util.Arrays;
import java.util.Scanner;

public class Question06Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("문자열을 입력해주세요 :");
		String str = scanner.nextLine();
		
		String[] arr =str.split("");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		int arr2 =Integer.parseInt(arr[i]);
		sum += arr2;
		}//for
		scanner.close();
		System.out.println(sum);
	}//main()
}//class
