import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//Client 정보를 질의(Request)
public class EchoClient {
	public static void main(String[] args) {
		//서버에 접속을 시도하여 접속에 성공하면 Socket생성
		//Client Socket: 서버의 IP주소 + 서버의 Port번호
		Socket socket=null;
		try {
			socket = new Socket("192.168.0.23",9999);
			
			//서버로 전송할 메세지를 입력받자 : Scanner
			Scanner scanner = new Scanner(System.in);
			System.out.print("서버로 보낼 메세지를 입력하세요 : ");
			String msg = scanner.nextLine();
			
			//입력받은 메세지를 서버로 송신(출력)하기 위한 준비 : 출력스트림 PrintWriter
			OutputStream os = socket.getOutputStream();				//socket으로부터 기본 출력스트림을 가져온다
			//OutputStreamWriter osw = new OutputStreamWriter(os);	//문자단위(유니코드)를 출력하는 스트림
			//BufferedWriter bw = new BufferedWriter(osw);			//버퍼를 활용 : 속도를 향상
			PrintWriter out = new PrintWriter(os);					//PrintWriter : osw + bw
			
			//메세지를 서버로 송신(출력)
			out.println(msg);
			out.flush();
			
			//서버에서 보낸 메세지를 수신받아 화면에 출력 : 입력스트림 BufferedReader
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);		//버퍼를 활용 : 속도 향상
			String echoMsg = br.readLine();
			System.out.println("서버로부터 받은 메세지 :"+echoMsg);
			
			//스트림 종료
			out.close();
			scanner.close();
		} catch (Exception e) {		//예외처리 코드 구현
			e.printStackTrace();	//예외 발생 시 예외의 원인을 추적하여 상세 출력
			System.out.println("EchoClient Exception!!!");	//예외메세지를
		}finally {
			try {
				socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}//finally
	}//main()
}//class
