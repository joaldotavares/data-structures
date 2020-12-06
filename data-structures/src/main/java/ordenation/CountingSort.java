package ordenation;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] vet = { 9, 1, 0, 5, 2 };
		System.out.println("Vetor desordenado:");
		System.out.println(Arrays.toString(vet));

		System.out.println("Vetor ordenado:");
		sort(vet);
		System.out.println(Arrays.toString(vet));
	}

	public static void sort(int[] vet) {
		int max = Arrays.stream(vet).max().getAsInt();
		int min = Arrays.stream(vet).min().getAsInt();
		int range = max - min + 1;
		int count[] = new int[range];
		int output[] = new int[vet.length];
		for (int i = 0; i < vet.length; i++) {
			count[vet[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = vet.length - 1; i >= 0; i--) {
			output[count[vet[i] - min] - 1] = vet[i];
			count[vet[i] - min]--;
		}

		for (int i = 0; i < vet.length; i++) {
			vet[i] = output[i];
		}
	}

}
