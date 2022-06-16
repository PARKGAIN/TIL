package pack05.test;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;

public class Trip {
	public static void main(String[] args) {
		String url = "https://api.odcloud.kr/api/15040858/v1/uddi:bb1c1776-7f9d-4636-8c2f-c798acc528f7";
		//?page=1&perPage=10&serviceKey=WyPrQ2fAPHW7oFWDByjt%2FMn7VU5XJglbkQ6hmzgIH1b8GANjgQJUqKdXz5LJAIoWAjJu%2FJ1GRZQLNza6l70InA%3D%3D
		String doc = null;
		try {
			doc = Jsoup.connect(url)
					.data("page", "1")
					.data("perPage", "10")
					.data("serviceKey","WyPrQ2fAPHW7oFWDByjt/Mn7VU5XJglbkQ6hmzgIH1b8GANjgQJUqKdXz5LJAIoWAjJu/J1GRZQLNza6l70InA==")
					.timeout(5000)
					.userAgent("Chrome")
					.ignoreContentType(true)
					.execute()
					.body();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(doc);		
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObj;
		try {
			jsonObj = (JSONObject) jsonParser.parse(doc); //API 어떤 데이터 종류를 Json 형태로 바꿔주는 API => Gson 사용
			//System.out.println(jsonObj.toString());
			
			JSONArray dataArray = (JSONArray)jsonObj.get("data");//중괄호 안에 있으면 get으로 가져오고 대괄호 안에 있는 것은 Array로 가져오기
			for (int i = 0; i < dataArray.size(); i++) {
				//System.out.println(dataArray.get(i));
				JSONObject obj = (JSONObject) dataArray.get(i);
				//System.out.println(obj.toString());
				System.out.println("course : " +obj.get("course")+"\t");
				System.out.println("course_title : " + obj.get("course_title")+"\t");
				System.out.println("end_date : " + obj.get("end_date")+"\t");
				System.out.println("start_date : "+obj.get("start_date")+"\t");
				System.out.println("reg_date : "+obj.get("reg_date")+"\t");
				System.out.println("title : "+obj.get("title")+"\t");
				//JSONArraty <=Elements <= JSONObject
				//전부 따로 출력할 수 있게 내가 사용하는 변수타입에 담고 출력해보기
			}
			
			
			String test = jsonObj.get("perPage")+"";
			System.out.println(test);
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main()
}
