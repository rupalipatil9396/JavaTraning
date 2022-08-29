package ass1;

public class GraterNum {
/* WAP to find third maximum number from list of numbers*/
	public static void main(String[] args) {

		int arr[] = { 98, 1, 22, 81, 41,89 };
		int i, temp, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.println(arr[arr.length - 3]);

	}

}
