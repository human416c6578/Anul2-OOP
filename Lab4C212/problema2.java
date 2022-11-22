import java.util.Scanner;

public class problema2 {

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
		
		// Cautam al doilea numar ca marime din vector
		
		int maximId = 0;
		for(int i=1;i<N;i++) {
			if(arr[i]>arr[maximId])
				maximId = i;
		}
		arr[maximId] = 0;
		
		int maxim = 0;
		for(int i=0;i<N;i++) {
			if(arr[i]>maxim)
				maxim = arr[i];
		}
		
		System.out.print("Al doilea maxim din vector este "+ maxim);
		
	}

}
