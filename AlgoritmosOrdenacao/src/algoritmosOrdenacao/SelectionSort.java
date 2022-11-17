package algoritmosOrdenacao;

//Complexidade:
//Melhor/Medio/Pior caso C(n)=0(n^2)
public class SelectionSort {

	public static long select(int[] vet, int tam) {
		long tempoInicial = System.currentTimeMillis();
		int i, n = 0, j, min, x;
		for (i = 1; i <= n - 1; i++) {
			min = i;
			for (j = i + 1; j <= n; j++) {
				if (vet[j] < vet[min])
					min = j;
			}
			x = vet[min];
			vet[min] = vet[i];
			vet[i] = x;
		}
		long tempo = System.currentTimeMillis() - tempoInicial;
		return tempo;

	}

}
