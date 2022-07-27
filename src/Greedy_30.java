import java.util.Arrays;
import java.util.Scanner;

public class Greedy_30 {
	
	public static String N; //각 자리수 분해해서 더 해야 함으로 숫자를 string으로 받는다
	public static int max_multiple_30;
	public static int arrTotal;
	public static int[] arrInt;

	public static void main(String[] args) {
		  //30의 배수는 가장 뒤에가 0이고 3의 배수는 각 자리 수 더해 3으로 나누어 떨어지면 
		
		Scanner in = new Scanner(System.in);
		
		N = in.next(); //next() 함수는 string을 받을 때 쓰는 함수
		
		arrInt = new int[N.length()];
		
		for(int i=0;i<N.length();i++) {
			
			arrInt[i] = N.charAt(i) -48; //숫자를 분리 하기
			//숫자 분리를 위해 N을 string 으로 받았다
			
			arrTotal+= arrInt[i]; //charAt() 함수는 String의 지정 index의 char를 return
		// -48은 문자 0~9의 십진수 48~58을 0~9로 바꿔준다
		
		}
		
		
		
		Arrays.sort(arrInt); //arrInt를 오름 차순으로 정렬 
		
		if((arrTotal % 3==0)&&(arrInt[0]==0)) { //arrInt의 index 0자리에 0이 없으면 10의배수 30의배수가 절대 될 수 없다 
			for(int i=arrInt.length-1;i>=0;i-- ) {//3의 배수는 모든 자리의 숫자 합이 3으로 나눠 떨어진다
				System.out.print(arrInt[i]);
			}
		}
		
		else {
			System.out.println(-1);
		}
		
		
		
		
		
		
		

	}

}
