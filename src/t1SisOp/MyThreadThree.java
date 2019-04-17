package t1SisOp;

public class MyThreadThree implements Runnable {
	private int threadID;
	private int id;
	Matriz matriz;

	public MyThreadThree(int id, Matriz matriz) {
		this.threadID = id;
		this.matriz = matriz;
	}

	@Override
	public void run() {
		if (threadID == 0) {
			for (int i = 0; i < matriz.getMresSize() / 2; i++) {
				for (int j = 0; j < (matriz.getMresSize() / 2); j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else if (threadID == 1) {
			for (int i = 0; i < matriz.getMresSize() / 2; i++) {
				for (int j = (matriz.getMresSize() / 2); j < matriz.getMresSize(); j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		} else if (threadID == 2) {
			for (int i = matriz.getMresSize() / 2; i < matriz.getMresSize(); i++) {
				for (int j = 0; j < (matriz.getMresSize() / 2); j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else {
			for (int i = matriz.getMresSize() / 2; i < matriz.getMresSize(); i++) {
				for (int j = (matriz.getMresSize() / 2); j < matriz.getMresSize(); j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		}

	}
}
