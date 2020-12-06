package ordenation;

import java.util.Arrays;

public class QuickSort {

	public static void main(String args[]) {

		int vetor[] = { 6, 35, 68, 10, 3, 9 };
		int n = vetor.length;

		System.out.println("Vetor desordenado: ");
		System.out.println(Arrays.toString(vetor));
		sort(vetor, 0, n - 1);
		System.out.println("Vetor ordenado:");
		System.out.println(Arrays.toString(vetor));
	}

	public static int dividirVetor(int vetor[], int menor, int maior) {
		int aux = vetor[maior];
		int i = (menor - 1);
		for (int j = menor; j < maior; j++) {
			if (vetor[j] < aux) {
				i++;
				int pos = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = pos;
			}
		}

		int pos = vetor[i + 1];
		vetor[i + 1] = vetor[maior];
		vetor[maior] = pos;

		return i + 1;
	}

	public static void sort(int vetor[], int menor, int maior) {
		if (menor < maior) {
			int pi = dividirVetor(vetor, menor, maior);
			sort(vetor, menor, pi - 1);
			sort(vetor, pi + 1, maior);
		}
	}
}
