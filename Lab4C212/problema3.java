import java.util.Scanner;

public class problema3 {

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
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N-1;j++) {
				if(prime(arr[i], arr[j])) {
					System.out.print(arr[i]+", "+arr[j]+"\n");
				}
			}
		}

	}
	
	public static boolean prime(int a, int b) {
		int r = 0;
		while(b > 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a == 1;
	}

}
