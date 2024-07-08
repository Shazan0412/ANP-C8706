package june25;

public class OppPattern {
		public static void main(String[] args) {
			
			int a = 5 ;
			
			for(int i = 0; i<=a; i++) {
				for(int j = 0; j<=j+i-1; j++) {
					System.out.print("* ");
				}
				
				System.out.println();
			}
		}
}
