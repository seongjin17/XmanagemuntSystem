import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("초를 입력하세요");
		int time=input.nextInt();
		for(int i=1; i<5; i++){
			if(i==1) {
				int second = time%60;
				System.out.print(second+"s");
			}
			if(i==2) {
				int minute = (time/60)%60;
				System.out.print(minute+"m");
			}
			if(i==3) {
				int hour = (time/60/60)%24;
				System.out.print(hour+"h");
			}	
			if(i==4) {
				int day = (time/60/60/24)%365;
				System.out.print(day+"d");
				if(day>365) {
					System.out.print("1년 이상입니다.");
			    }	
			}
		}
		
	}
}
