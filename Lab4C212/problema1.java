import java.util.Scanner;

public class problema1 {

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
		
		
		// Calculam suma elementelor vectorului
		
		int suma = 0;
		for(int i=0;i<N;i++) {
			suma+=arr[i];
		}
		System.out.print("Suma elementelor vectorului este : " + suma + "\n");
		
		// Calculam daca toate elementele vectorului sunt egale
		
		boolean egale = true;
		for(int i=0;i<N;i++) {
			if(arr[0] != arr[i]) {
				egale = false;
				System.out.print("Elementele vectorului NU sunt egale intre ele.\n");
				break;
			}
		}
		if(egale)
			System.out.print("Elementele vectorului sunt egale intre ele.\n");
		
		// Calculam daca toate elementele vectorului sunt diferite
		
		boolean diferite = true;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N-1;j++) {
				if(arr[i] == arr[j]) {
					diferite = false;
					System.out.print("Elementele vectorului NU sunt diferite intre ele.\n");
					break;
				}	
			}
		}
		if(diferite)
			System.out.print("Elementele vectorului sunt diferite intre ele.\n");
		
		
		// Calculam cate numere pare sunt in vector
		
		int nrpare = 0;
		
		for(int i=0;i<N;i++) {
			if(arr[i]%2==0)
				nrpare++;
		}
		System.out.print("Sunt "+nrpare+" numere pare in vector");
		
		// Calculam daca un numar citit de la tastatura x se afla in vector
		
		int x = sc.nextInt();
		boolean gasit = false;
		for(int i=0;i<N;i++) {
			if(arr[i] == x) {
				gasit = true;
				System.out.print("Numarul "+x+" se afla in vector.");
				break;
			}
		}
		if(!gasit)
			System.out.print("Numarul "+x+" NU se afla in vector.");
	}

}
