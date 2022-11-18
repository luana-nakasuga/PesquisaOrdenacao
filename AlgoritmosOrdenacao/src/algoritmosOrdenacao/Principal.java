package algoritmosOrdenacao;

import io.InOut;

public class Principal {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		InsertionSort insertionSort = new InsertionSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		SelectionSort selectionSort = new SelectionSort();
		ShellSort shellSort = new ShellSort();
		
		InOut.msgDeInformacao("BUBBLE SORT", "Executado em " + bubbleSort + "ms.");
		InOut.msgDeInformacao("INSERTION SORT", "Executado em " + insertionSort + "ms.");
		InOut.msgDeInformacao("MERGE SORT", "Executado em " + mergeSort + "ms.");
		InOut.msgDeInformacao("QUICK SORT", "Executado em " + quickSort + "ms.");
		InOut.msgDeInformacao("SELECTION SORT", "Executado em " + selectionSort + "ms.");
		InOut.msgDeInformacao("SHELL SORT", "Executado em " + shellSort + "ms.");
	}

	public int tamanho() {
		String menuTamanho = "1 - 100\n2 - 1000\n3 - 10000\n4 - 100000\n5 - 1000000\n6 - Sair.";
		int opcao = 0;

		do {
			opcao = InOut.leInt(menuTamanho);

			switch (opcao) {
			case 1:
				int[] vet100 = new int[100];
				break;
			case 2:
				int[] vet1000 = new int[1000];
				break;
			case 3:
				int[] vet10000 = new int[10000];
				break;
			case 4:
				int[] vet100000 = new int[100000];
				break;
			case 5:
				int[] vet1000000 = new int[1000000];
				break;
			default:
				InOut.msgDeErro("AVISO", "Opção inválida.");
				break;
			}
		} while (opcao != 6);
		return opcao;

	}

	public void ordem() {

		String menuOrdem = "1 - Ordem aleatória.\n2 - Ordem crescente.\n3 - Ordem decrescente.\n4 - Sair.";
		int opcao = 0;

		do {
			opcao = InOut.leInt(menuOrdem);

			switch (opcao) {
			case 1:
				int[] aleatorio = null;
				for (int i = 0; i < tamanho(); i++) {
					if (i < tamanho()) {
						aleatorio[i] = (int) (1 + (Math.random() * tamanho()));
					}
				}
				break;
			case 2:
				int crescente[] = null;
				for (int i = 0; i < tamanho(); i++) {
					if (i < tamanho()) {
						crescente[i] = i;
					}
				}
				break;
			case 3:
				int aux3 = tamanho() + 1;
				int decrescente[] = null;
				for (int i = 0; i < tamanho(); i++) {
					if (i < tamanho()) {
						decrescente[i] = aux3 - 1;
					}
					aux3--;
				}
				break;
			default:
				InOut.msgDeErro("AVISO", "Opção inválida.");
				break;
			}
		} while (opcao != 4);
	}
}