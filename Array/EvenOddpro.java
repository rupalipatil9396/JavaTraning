package ass1;

public class EvenOddpro {
/*An Array Contain different numbers you have to find how many are even, odd, perfect and 
prime*/
	public int isOdd(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}

	
	public int isEven(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public boolean isPerfect(int num) {

		int sum = 1;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				sum += i;
			}

		}
		if (sum == num)
			return true;

		return false;
	}

	public int countPerfect(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPerfect(arr[i])) {
				count++;
			}
		}
		return count;
	}

	public boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	public int countPrime(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 7,10, 21, 103, 49, 5, 16, 9, 78, 45 };
		EvenOddpro number = new EvenOddpro();
		System.out.println("Odd Number" + number.isOdd(arr));
		System.out.println("Even Number" + number.isEven(arr));
		System.out.println("Perfect Number" + number.countPerfect(arr));
		System.out.println("Prime Number" + number.countPrime(arr));
	}

}
