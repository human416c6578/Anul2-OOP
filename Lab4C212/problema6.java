import java.util.Scanner;

public class problema6 {

	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		N = sc.nextInt();
		complex[] arr = new complex[N];
		for(int i=0;i<N;i++) {
			System.out.print("arr["+ i +"] = ");
			arr[i] = new complex(sc.nextInt());
		}
		
		int maxim = 0;
		for(int i=0;i<N;i++) {
			if(arr[i].modul() > maxim)
				maxim = arr[i].modul();
		}
		
		System.out.print("Modulul maxim din vector este "+maxim);
	}

}
