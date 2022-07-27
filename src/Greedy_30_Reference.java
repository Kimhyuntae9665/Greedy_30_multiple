import java.util.Arrays;
import java.util.Scanner;

public class Greedy_30_Reference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input = in.next(); // string 값 받기 위해 next() 사용
		
		
		int[] N = new int[input.length()];
		int sum=0;
		boolean isZero = false;
		
		for(int i=0;i<input.length();i++) {
			N[i] = Integer.parseInt(input.charAt(i)+""); //parseInt는 string을 int로 변환 
			//Integer.parseInt(string)인데 parseInt(char + "") ==> parseInt(string) 으로 바껴 error 없다 
			
			sum+=N[i];
			if(N[i]==0)
				isZero = true;
		}
		
		Arrays.sort(N); //오름 차순으로 정렬 
		
		if(sum%3==0 && isZero) {
			for(int i=N.length-1;i>=0;i--) {
				System.out.print(N[i]);// 역순으로 출력 
			}
		}
		
		else {
			System.out.println(-1);
		}

	}

}
