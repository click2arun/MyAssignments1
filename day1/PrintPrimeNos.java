package week1.day1;

public class PrintPrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5, count = 0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is a Prime No");
		}
		
		else
		{ 
			System.out.println(n+" is not a Prime No");
		}	
	}

}
