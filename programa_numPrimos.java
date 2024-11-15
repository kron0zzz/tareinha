package primos;

public class programa_numPrimos {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("los números primos son: ");
		
		for (int num : numeros) {
			if (esPrimo(num)) {
				System.out.println(num);
			}
		}
	
	}
	
	
	public static boolean esPrimo(int num) {
		if (num <= 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
			return false;
			}
		}
		return true ;
	}
}
