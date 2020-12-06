package ordenation;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		int [] vet = { 9, 1, 0, 5, 2};
		System.out.println("Vetor desordenado:");
		System.out.println(Arrays.toString(vet));

		System.out.println("Vetor ordenado:");
		sort(vet);
		System.out.println(Arrays.toString(vet));

	}
	
	public static void sort(int[] vetor) {

		int aux = 0;

		for (int i = 0; i < vetor.length; i++) {
			aux = i;
			for (int j = i; j < vetor.length; j++) {
				if (vetor[j] < vetor[aux]) {
					aux = j;
				}
			}
			int temp = vetor[i];
			vetor[i] = vetor[aux];
			vetor[aux] = temp;
		}
	}

}

