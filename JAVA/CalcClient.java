import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//Socket생성 
			socket = new Socket("192.168.0.23",9999);
			
			//num1,num2,opcode 입력받는다 : Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.println("첫 번째 정수를 입력하세요 :");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.println("두 번째 정수를 입력하세요 :");
			int num2 = Integer.parseInt(scanner.nextLine());
			System.out.println("연산자를 입력하세요 : ");
			String opcode = scanner.nextLine();
			
			//CalcDTO 객체를 생성하고 서버로 송신 : 출력스트림
			//outputStream → OutputStreamWriter → BufferedWriter
							//PrintWriter ▶ObjectOutputStream : 객체출력(객체의 직렬화)
			CalcDTO dto = new CalcDTO(num1,num2, opcode);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(dto);
			
			//스트림종료
			scanner.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("CalcClient Exception!!!");
		}finally {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}
	}//main()
}
