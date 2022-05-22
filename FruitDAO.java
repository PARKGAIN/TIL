package com.hanul.fruit;

import java.text.DecimalFormat;

public class FruitDAO {
	//디포트 생성자 메소드 : 생성자 메소드가 없을 경우 JVM 자동제공
	public FruitDAO() {}
	
	private FruitDTO[] fruit; //멤버변수로 만들어줌
	
	public FruitDAO(FruitDTO[] fruit) {
		this.fruit = fruit;

	}
	
	public void getPrice() {	
			for (int i = 0; i < fruit.length; i++) {
				
				//int cost = book[i].getCost();
				//int qty = book[i].getQty();
				//int price = cost * qty;
				//book[i].setPrice(price);
				
				fruit[i].setPrice(fruit[i].getCost() * fruit[i].getQty());
			}
	}
	
	//가격 내림차순 정렬
	public void PriceDescSort() {
		for (int i = 0; i < fruit.length; i++){
			for(int j = i+1; j<fruit.length; j++) {
				if(fruit[i].getPrice() < fruit[j].getPrice()) {
					FruitDTO temp = fruit[i];
					fruit[i] = fruit[j];
					fruit[j]=temp;
				}//if
			}//for j
		}//for i
	}//PriceDescSort()
	
	//출력
	public void display() {
		DecimalFormat df = new DecimalFormat("###,##0");
		System.out.println("====================================================");
		System.out.println("과일명\t단가\t\t수량\t가격");
		System.out.println("====================================================");
		for (int i = 0; i < fruit.length; i++) {
				System.out.print(fruit[i].getName() + "\t");
				System.out.print(df.format(fruit[i].getCost()) + "￦\t\t");
				System.out.print(fruit[i].getQty() + "\t");
				System.out.print(df.format(fruit[i].getPrice())+"￦\n");
			}//for
			System.out.println("===============================================");
	}//display()


	
}//class
