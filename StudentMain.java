import com.hanul.student.StudentDAO;
import com.hanul.student.StudentDTO;

public class StudentMain {
	public static void main(String[] args) {
		StudentDTO[] student = new StudentDTO[3];
		student[0] = new StudentDTO("홍길동", "컴공과", 20220501, 95.4, 90.3);
		student[1] = new StudentDTO("김길동", "전산과", 20220502, 85, 97.8);
		student[2] = new StudentDTO("나길동", "정통과", 20220503, 80.7, 85.6);
		
		StudentDAO dao = new StudentDAO(student);
		dao.getSum();
		dao.getAvg();
		dao.avgDescSort();
		dao.display();
	}//main()
}//class
