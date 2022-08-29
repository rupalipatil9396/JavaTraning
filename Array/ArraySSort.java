package ass1;
/* WAP to sort array on the basis of unit place. For example we are having following numbers:-
10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9*/
public class ArraySSort {
	public static void main(String[] args) {
		int arr[] = { 101,9,87,170,6,50,40,30 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp1 = arr[i] % 10;
				int temp2 = arr[j] % 10;
				if (temp1 > temp2) {
					int var = arr[i];
					arr[i] = arr[j];
					arr[j] = var;
				}
			}
			System.out.println(arr[i]);
		}
}
}