package com.hanul.phone;

public class SmartPhone extends DMBPhone{
	public SmartPhone(String phonename, String color, String model, String state) {
		super(phonename, color, model, state);
		
	}

	@Override
	public void printInfo() {
		super.printInfo();
	}

	@Override
	public void menuBar() {
		System.out.println("===================================================================================================================================================");
		System.out.println("1.전화받기\t2.전화끊기\t3.음성메세지 수신&송신\t4.DMB방송켜기&채널변경&끄기\t5.인터넷켜기\t6.인터넷끄기\t7.웹툰앱켜기\t8.웹툰앱끄기");
		System.out.println("===================================================================================================================================================");
	}
	
	
	

}//class
