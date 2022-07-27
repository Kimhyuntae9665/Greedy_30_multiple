import java.util.Arrays;
import java.util.Scanner;

public class Greedy_30_Reference {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String input = in.next(); // string �� �ޱ� ���� next() ���
		
		
		int[] N = new int[input.length()];
		int sum=0;
		boolean isZero = false;
		
		for(int i=0;i<input.length();i++) {
			N[i] = Integer.parseInt(input.charAt(i)+""); //parseInt�� string�� int�� ��ȯ 
			//Integer.parseInt(string)�ε� parseInt(char + "") ==> parseInt(string) ���� �ٲ� error ���� 
			
			sum+=N[i];
			if(N[i]==0)
				isZero = true;
		}
		
		Arrays.sort(N); //���� �������� ���� 
		
		if(sum%3==0 && isZero) {
			for(int i=N.length-1;i>=0;i--) {
				System.out.print(N[i]);// �������� ��� 
			}
		}
		
		else {
			System.out.println(-1);
		}

	}

}
