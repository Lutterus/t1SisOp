package t1SisOp;

public class Sequencial {

	// DIMENSOES DAS MATRIZES
	public static int SIZE = 100;
	// ESTRUTURAS DE DADOS COMPARTILHADA

	public static void main(String[] args) throws InterruptedException {

		for (int y = 0; y < 20; y++) {
			Matriz matriz = new Matriz(SIZE);
			// INICIALIZA OS ARRAYS A SEREM MULTIPLICADOS
			matriz.setMatriz(SIZE);

			// PREPARA PARA MEDIR TEMPO
			long inicio = System.nanoTime();

			// REALIZA A MULTIPLICACAO			
			//TESTE 1 sem thread
			// matriz.multiplica(k);
					
			//TESTE 2 com 2 threads
			/*Thread t1 = new Thread(new MyThreadTwo(0, matriz));
			Thread t2 = new Thread(new MyThreadTwo(1, matriz));
			t1.start();
			t2.start();
			t1.join();
			t2.join();*/	
			
			//TESTE 3 com 4 threads
			/*Thread t1 = new Thread(new MyThreadThree(0, matriz));
			Thread t2 = new Thread(new MyThreadThree(1, matriz));
			Thread t3 = new Thread(new MyThreadThree(2, matriz));
			Thread t4 = new Thread(new MyThreadThree(3, matriz));
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t1.join();
			t2.join();
			t3.join();
			t4.join();*/
			
			//TESTE 4 com 8 threads
			/*Thread t1 = new Thread(new MyThreadFour(0, matriz));
			Thread t2 = new Thread(new MyThreadFour(1, matriz));
			Thread t3 = new Thread(new MyThreadFour(2, matriz));
			Thread t4 = new Thread(new MyThreadFour(3, matriz));
			Thread t5 = new Thread(new MyThreadFour(4, matriz));
			Thread t6 = new Thread(new MyThreadFour(5, matriz));
			Thread t7 = new Thread(new MyThreadFour(6, matriz));
			Thread t8 = new Thread(new MyThreadFour(7, matriz));
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();*/
			
			//TESTE 5 com 16 threads
			Thread t1 = new Thread(new MyThreadFive(0, matriz));
			Thread t2 = new Thread(new MyThreadFive(1, matriz));
			Thread t3 = new Thread(new MyThreadFive(2, matriz));
			Thread t4 = new Thread(new MyThreadFive(3, matriz));
			Thread t5 = new Thread(new MyThreadFive(4, matriz));
			Thread t6 = new Thread(new MyThreadFive(5, matriz));
			Thread t7 = new Thread(new MyThreadFive(6, matriz));
			Thread t8 = new Thread(new MyThreadFive(7, matriz));
			Thread t9 = new Thread(new MyThreadFive(8, matriz));
			Thread t10 = new Thread(new MyThreadFive(9, matriz));
			Thread t11 = new Thread(new MyThreadFive(10, matriz));
			Thread t12 = new Thread(new MyThreadFive(11, matriz));
			Thread t13 = new Thread(new MyThreadFive(12, matriz));
			Thread t14 = new Thread(new MyThreadFive(13, matriz));
			Thread t15 = new Thread(new MyThreadFive(14, matriz));
			Thread t16 = new Thread(new MyThreadFive(15, matriz));
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			t6.start();
			t7.start();
			t8.start();
			t9.start();
			t10.start();
			t11.start();
			t12.start();
			t13.start();
			t14.start();
			t15.start();
			t16.start();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			t7.join();
			t8.join();
			t9.join();
			t10.join();
			t11.join();
			t12.join();
			t13.join();
			t14.join();
			t15.join();
			t16.join();
			
			// OBTEM O TEMPO
			long fim = System.nanoTime();
			double total = (fim - inicio) / 1000000000.0;

			if (!matriz.isCorrect(SIZE)) {
				System.err.println("ERRO");
			}

			// MOSTRA O TEMPO DE EXECUCAO
			System.out.println("Tamanho: " + SIZE + ", tempo total: " + total);
			SIZE += 100;

		}

	}

}
