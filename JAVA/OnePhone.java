package com.hanul.phone;

import java.util.Scanner;

public class OnePhone {
	
	protected String phonename;
	protected String color;
	protected String model;
	protected String state;

	
	public OnePhone(String phonename, String color, String model, String state) {
		this.phonename = phonename;
		this.color = color;
		this.model = model;
		this.state = state;
		
	}
	
	public void phonePlay() {
		Scanner scanner = new Scanner(System.in);
		printInfo();
		
		do {		
			System.out.println("전원을 켜시겠습니까?");
			System.out.println("1.네\t2.아니요");
		int menu = Integer.parseInt(scanner.nextLine());
			
			if(menu == 1) {
				powerOn(scanner);
			}else if(menu ==2) {
				powerOff(scanner);
				
			}else {
				System.out.println("잘못입력하셨습니다");
			}//if
	
			
		} while(true);
		
	}//phonePlay()
	
	
	//메뉴바출력
	public void menuBar() {
		System.out.println("======================================================");
		System.out.println("1.전화받기\t2.전화끊기\t3.음성메세지 수신&송신");
		System.out.println("======================================================");
	}//menuBar
	
	
	
	//폰 상태정보
	public void printInfo() {
		System.out.println(phonename +"(색상 :" + color + ", 모델명 : " + model + ", 상태 : " + state + ")가 지급 되었습니다");
	}//printInfo
	
	
	
	//전원이 켜졌을 때 
	public void powerOn(Scanner scanner) {
		System.out.println("전원이 켜졌습니다.");
		menuBar();
		int menubar = Integer.parseInt(scanner.nextLine());
		if(menubar == 1) {
			System.out.println("전화가 와서 전화를 받았습니다.\n나 : 여보세요?\n상대방 : 여보세요?");

		}else if(menubar == 2) {
			System.out.println("전화를 끊습니다");
		}else if(menubar == 3) {
			System.out.println("통화중인 상태가 아닙니다. 음성 전송 & 수신이 불가 합니다.");
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}//powerOn
	
	
	//전원이 꺼졌을 때
	public void powerOff(Scanner scanner) {
		System.out.println("전원이 꺼졌습니다");
		menuBar();
		int menubar = Integer.parseInt(scanner.nextLine());
		if(menubar == 1) {
			System.out.println("전원이 꺼져있어 전화 받기가 불가 합니다.");

		}else if(menubar == 2) {
			System.out.println("전원이 꺼져있어 전화 끊기가 불가 합니다.");
		}else if(menubar == 3) {
			System.out.println("전원이 껴져있어 음성 전송 & 수신이 불가합니다");
		}else {
			System.out.println("다시 입력하세요");
		}//if
	}//powerOff()
		
	
	
	
	
	
	
	
	
	
	
	
	
}//class
