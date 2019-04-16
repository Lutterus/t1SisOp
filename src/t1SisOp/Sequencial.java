package t1SisOp;

public class Sequencial {

	// DIMENSOES DAS MATRIZES
	public static int SIZE = 100;
	// ESTRUTURAS DE DADOS COMPARTILHADA

	public static void main(String[] args) throws InterruptedException {
		
		for (int y = 0; y < 1; y++) {
			Matriz matriz = new Matriz(SIZE);
			// INICIALIZA OS ARRAYS A SEREM MULTIPLICADOS
			
			int k=1;
			k = matriz.setMatriz(SIZE, k);

			// PREPARA PARA MEDIR TEMPO
			long inicio = System.nanoTime();

			// REALIZA A MULTIPLICACAO
			//matriz.multiplica(k);
			Thread t1 = new Thread(new MyThread(0, matriz.getMres(), matriz.getM1(), matriz.getM2(), k, matriz));
			Thread t2 = new Thread(new MyThread(1, matriz.getMres(), matriz.getM1(), matriz.getM2(), k, matriz));
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();

			// OBTEM O TEMPO
			long fim = System.nanoTime();
			double total = (fim - inicio) / 1000000000.0;

			if(!matriz.isCorrect(SIZE, k)) {
				System.err.println("ERRO");
			}

			// MOSTRA O TEMPO DE EXECUCAO
			System.out.println("Tamanho: " + SIZE + ", tempo total: " + total);
			SIZE += 100;

		}

	}

}
