import java.util.ArrayList;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> PrimeNumbers= new ArrayList<Integer>();
		
		
		for (int i =2;i<=550;i++) {
			boolean Prime = true;
//i
//will be divided by 2 ->i-1 if %=0 then not prime
// an example take 11 and divide it by numbers beginning at 2 and ending at 10
			
			for (int j=2; j<i;j++) {
				if (i%j==0) {
					Prime= false;
					break;
					}
			}
//adds primes to array list
			if (Prime) {
				PrimeNumbers.add(i);
			}
		}
		
		
		
		System.out.println("Hello!");
		System.out.println("The Prime Numbers Between 1-100 Are: \n"+ PrimeNumbers);

	}
	

}
