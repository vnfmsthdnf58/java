package java0513;

public class ex08_01_forproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 1; i <= 4; i++) {
			for(int j = 3; j>= i; j--) { // for(int j = 1; j <= 4-i; j++) 응용가능.
			System.out.print(" ");	
			}	
			for(int k = 1; k <= i*2-1; k++) { // for(int k = 1; k <= 2*i -1; k++) 응용가능
				System.out.print("*");
			}
			for(int j = 3; j>= i; j--) { // for(int j = 1; j <= 4-i; j++) 응용가능.
				System.out.print(" ");
			
}
			System.out.println("");
} 
}
}

