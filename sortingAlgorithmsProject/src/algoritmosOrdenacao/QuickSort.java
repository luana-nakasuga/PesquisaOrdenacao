package algoritmosOrdenacao;

//Complexidade:
//Melhor/Medio caso C(n)=0(n log n)
//Pior caso C(n)=0(n^2)
public class QuickSort {
	public static long quick(int[] vet, int esq, int dir) {
		long tempoInicial = System.currentTimeMillis();
		int pivo = esq, i, ch, j;
		for (i = esq + 1; i <= dir; i++) {
			j = i;
			if (vet[j] < vet[pivo]) {
				ch = vet[j];
				while (j > pivo) {
					vet[j] = vet[j - 1];
					j--;
				}
				vet[j] = ch;
				pivo++;
			}
		}
		if (pivo - 1 >= esq) {
			quick(vet, esq, pivo - 1);
		}
		if (pivo + 1 <= dir) {
			quick(vet, pivo + 1, dir);
		}
		long tempo = System.currentTimeMillis() - tempoInicial;
		return tempo;
	}

}
