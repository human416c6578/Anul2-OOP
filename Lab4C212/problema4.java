import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			System.out.print("arr["+ i +"] = ");
			arr[i] = sc.nextInt();
		}
		
		int[] count = new int[10];
		for(int i=0;i<N;i++) {
			int temp = arr[i];
			int c = 0;
			int div = 1;
			while(temp > 0) {
				c = temp % (div * 10);
				count[c]++;
				temp /= 10;
			}
		}
		
		int maxim = 0;
		
		for(int i=0;i<10;i++) {
			if(count[i] > maxim)
				maxim = i;
			
		}
		System.out.print("Cifra care apare de cele mai multe ori in secventa este "+maxim);

	}

}
