package week1.day2;

public class LearnFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8; // Number of terms to generate
        int a = 0;
        int b = 1;

        System.out.print(a + ", " + b); // Print the first two terms

        for (int i = 2; i < n; i++) {
            int fibonacci = a + b;
            System.out.print(", " + fibonacci);
            a = b;
            b = fibonacci;
			
		}

	}

}
