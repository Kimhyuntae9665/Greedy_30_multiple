import java.util.Arrays;
import java.util.Scanner;

public class Greedy_30 {
	
	public static String N; //�� �ڸ��� �����ؼ� �� �ؾ� ������ ���ڸ� string���� �޴´�
	public static int max_multiple_30;
	public static int arrTotal;
	public static int[] arrInt;

	public static void main(String[] args) {
		  //30�� ����� ���� �ڿ��� 0�̰� 3�� ����� �� �ڸ� �� ���� 3���� ������ �������� 
		
		Scanner in = new Scanner(System.in);
		
		N = in.next(); //next() �Լ��� string�� ���� �� ���� �Լ�
		
		arrInt = new int[N.length()];
		
		for(int i=0;i<N.length();i++) {
			
			arrInt[i] = N.charAt(i) -48; //���ڸ� �и� �ϱ�
			//���� �и��� ���� N�� string ���� �޾Ҵ�
			
			arrTotal+= arrInt[i]; //charAt() �Լ��� String�� ���� index�� char�� return
		// -48�� ���� 0~9�� ������ 48~58�� 0~9�� �ٲ��ش�
		
		}
		
		
		
		Arrays.sort(arrInt); //arrInt�� ���� �������� ���� 
		
		if((arrTotal % 3==0)&&(arrInt[0]==0)) { //arrInt�� index 0�ڸ��� 0�� ������ 10�ǹ�� 30�ǹ���� ���� �� �� ���� 
			for(int i=arrInt.length-1;i>=0;i-- ) {//3�� ����� ��� �ڸ��� ���� ���� 3���� ���� ��������
				System.out.print(arrInt[i]);
			}
		}
		
		else {
			System.out.println(-1);
		}
		
		
		
		
		
		
		

	}

}
