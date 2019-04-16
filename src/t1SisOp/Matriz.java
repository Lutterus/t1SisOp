package t1SisOp;

public class Matriz {
	private int[][] m1;
	private int[][] m2;
	private int[][] mres;
	public Matriz(int SIZE) {
		this.m1 = new int[SIZE][SIZE];
		this.m2 = new int[SIZE][SIZE];
		this.mres = new int[SIZE][SIZE];
	}
	public int setMatriz(int SIZE, int k) {
		k = 1;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (k % 2 == 0)
					m1[i][j] = -k;
				else
					m1[i][j] = k;
			}
			k++;
		}
		k = 1;
		for (int j = 0; j < SIZE; j++) {
			for (int i = 0; i < SIZE; i++) {
				if (k % 2 == 0)
					m2[i][j] = -k;
				else
					m2[i][j] = k;
			}
			k++;
		}
		
		return k;
	}
	public void setPos(int x, int y, int z) {
		this.mres[x][y]+= z;
	}
	public int[][] getM1() {
		return m1;
	}
	public int[][] getM2() {
		return m2;
	}
	public int[][] getMres() {
		return mres;
	}

	public boolean isCorrect(int SIZE, int k) {
		// VERIFICA SE O RESULTADO DA MULTIPLICACAO ESTA CORRETO
					for (int i = 0; i < SIZE; i++) {
						k = SIZE * (i + 1);
						for (int j = 0; j < SIZE; j++) {
							int k_col = k * (j + 1);
							if (i % 2 == 0) {
								if (j % 2 == 0) {
									if (mres[i][j] != k_col)
										return false;
								} else {
									if (mres[i][j] != -k_col)
										return false;
								}
							} else {
								if (j % 2 == 0) {
									if (mres[i][j] != -k_col)
										return false;
								} else {
									if (mres[i][j] != k_col)
										return false;
								}
							}
						}
					}
		return true;
	}
	
	public void multiplica(int k) {
		for (int i = 0; i < mres.length; i++) {
			for (int j = 0; j < mres[0].length; j++) {
				mres[i][j] = 0;
				for (k = 0; k < m2.length; k++) {
					mres[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
	}
}
