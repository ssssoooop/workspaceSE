
public class WhileUse {

	public static void main(String[] args) {
		
		System.out.println(">> 1~10사이의 정수 출력(10회출력)");
		
		int i=0;
		while(i<10) {
			System.out.print((i+1)+" ");
			i++;
		}
		//System.out.print("\n");
		System.out.println();
		System.out.println(">> 1~10사이의 정수 출력(10회출력)");
		i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의 정수중에서 홀수출력");
		
		i=1;
		while(i<=100) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의 정수중에서 4의배수출력");
		i=1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("1900년도부터 2022까지의연도중에서 윤년을 출력하세요");
		/*
		 * Quiz :
		 *  - 1900년도부터 2022까지의연도중에서 윤년을 출력하세요
		 */
		int year=1900;
		while(year<=2022) {
			if((year%4==0 && year%100!=0)||(year%400==0)) {
				System.out.print(year+"\t");
			}
			year++;
		}
		System.out.println();
		System.out.println(">> 1~100사이의 정수중에서 짝수와 홀수의 합[누적]");
		i=1;
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		while(i<=100) {
			if(i%2==1){
				//홀수
				oddTot = oddTot+i;
			}else {
				//짝수
				evenTot= evenTot+i;
			}
			
			//tot = tot+i;
			tot+=i;//연산후 대입 연산자
			
			i++;
			
		}
		System.out.println("1~100사이의 정수중에서 홀수합:"+oddTot);
		System.out.println("1~100사이의 정수중에서 짝수합:"+evenTot);
		System.out.println("1~100사이의 정수합:"+tot);
	
		
		
	}

}
