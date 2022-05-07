public class Test_gugudan {
	public static void main(String[] args) {
		for(int i= 2; i <= 9; i++) {
			for(int j= 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j)+ " ");
			}// for j
			System.out.println();
		}// for i
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i)+ " ");
			}//for j
			System.out.println();
		}//for i
		System.out.println();
		int i =2;
		while (i <= 9) {
			int j= 1;
			while(j <= 9){
				System.out.print(i + "*" + j + "=" + (i*j)+ " ");
				j++;
			}//while j
			i++;
			System.out.println();	
		}//while i
		System.out.println();
		
		i = 1;
		while (i <= 9) {
			int j= 2;
			while(j <= 9) {
				System.out.print(j + "*" + i + "=" + (i*j)+ " ");
				j++;
			}//while j
			i++;
			System.out.println();
		}//while i
		System.out.println();
		i =2;
		do {
			for(int j= 1; j < 10; j++) {
				System.out.print(i+ "*"+ j + "="+ (i*j)+" ");
				}//for
			i++;
			System.out.println();
			} while(i < 10);
		System.out.println();
		i = 1;
		do {
			for(int j = 2; j< 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j)+ " ");
			}//for
			i++;
			System.out.println();
		} while (i < 10);
	
	}//main()
}//class
