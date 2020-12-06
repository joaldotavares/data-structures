package ordenation;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] vet = { 9, 1, 0, 5, 2 };
		System.out.println("Vetor desordenado:");
		System.out.println(Arrays.toString(vet));

		System.out.println("Vetor ordenado:");
		sort(vet);
		System.out.println(Arrays.toString(vet));
	}

	public static void sort(int[] vetor) {
		int aux;
		int i;

		for (int j = 1; j < vetor.length; j++) {
			aux = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = aux;
		}
	}
}
