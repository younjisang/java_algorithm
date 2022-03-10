import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x1, y1, r1, x2, y2, r2;
		double D, S;
		
		for(int i = 0; i < t; i++)
		{
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			
			S = r1 > r2 ? r1 - r2 : r2 - r1;
			D = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			
			if(r1 == r2 && D == 0) System.out.println("-1");
			else if(D == r1 + r2 || D == S) System.out.println("1");
			else if(r1 > D + r2 || r2 > D + r1 || D > r1 + r2) System.out.println(0);
			else if(D < r1 + r2 && S < D)System.out.println("2");
		}
	}

}
