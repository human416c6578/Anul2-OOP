import java.util.Scanner;



public class problema5 {

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
		
		int[][] count = new int[N][2];
		
		for(int i=0;i<N;i++) {
			if(arr[i]%2==0) {
				int idx = search_array(count, arr[i]);
				count[idx][0] = arr[i];
				count[idx][1]++;
			}
		}
		
		int maximId = 0;
		
		for(int i=0;i<N;i++) {
			System.out.print(count[i][0] + " - " +count[i][1]+"\n");
			if(count[maximId][1] > count[i][1])
				maximId = count[i][0];
		}
		
		System.out.print("Numarul par care apare de cele mai multe ori este "+count[maximId][0]);
		

	}
	
	public static int search_array(int[][] arr, int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0] == number)
				return i;
			if(arr[i][0] == 0)
				return i;
		}
		
		return 0;
	}

}
