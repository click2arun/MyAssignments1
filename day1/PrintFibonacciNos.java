package week1.day1;

public class PrintFibonacciNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int f1, f2=0,f3=1;
		for (int i=1;i<=11; i++) {			
			System.out.println(f3 +" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
		}

	}

}
