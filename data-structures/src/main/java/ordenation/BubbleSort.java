package ordenation;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String args[]) {
		int[] vet = { 8, 9, 3, 5, 1 };

		System.out.println("Vetor desordenado: ");
		System.out.println(Arrays.toString(vet));

		System.out.println("Vetor organizado:");
		sort(vet);
		System.out.println(Arrays.toString(vet));
	}

	public static void sort(int vet[]) {
		int aux = 0;
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}
}
