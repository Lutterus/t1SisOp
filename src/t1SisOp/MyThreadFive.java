package t1SisOp;

public class MyThreadFive implements Runnable {
	private int threadID;
	private int id;
	Matriz matriz;

	public MyThreadFive(int id, Matriz matriz) {
		this.threadID = id;
		this.matriz = matriz;
	}

	@Override
	public void run() {
		if (threadID == 0) {
			int tamanho = (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			for (int i = 0; i < tamanhoI; i++) {
				for (int j = 0; j < tamanho; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else if (threadID == 1) {
			int tamanho1 = (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			for (int i = 0; i < tamanhoI; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		} else if (threadID == 2) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			for (int i = 0; i < tamanhoI; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else if (threadID == 3) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			for (int i = 0; i < tamanhoI; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		} else if (threadID == 4) {
			int tamanho = (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = 0; j < tamanho; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else if (threadID == 5) {
			int tamanho1 = (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		} else if (threadID == 6) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}

		} else if (threadID == 7) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4)	+ (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}

		} else if (threadID == 8) {
			int tamanho = (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = 0; j < tamanho; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			
		} else if (threadID == 9) {
			int tamanho1 = (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}
			
		} else if (threadID == 10) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			
		} else if (threadID == 11) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4)	+ (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}
			
		} else if (threadID == 12) {
			int tamanho = (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = 0; j < tamanho; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
			
		} else if (threadID == 13) {
			int tamanho1 = (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						// mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// System.out.println(mres[i][j]);
					}
				}
			}
			
		} else if (threadID == 14) {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
					for (int k = 0; k < matriz.getM2Size(); k++) {
						// System.out.println("i: " + i + " j: " + j + " k: " + k);
						matriz.setPos(i, j, (matriz.getM1(i, k) * matriz.getM2(k, j)));
						// mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
		} else {
			int tamanho1 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanho2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4)	+ (matriz.getMresSize() / 4);
			int tamanhoI = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			int tamanhoI2 = (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4) + (matriz.getMresSize() / 4);
			for (int i = tamanhoI; i < tamanhoI2; i++) {
				for (int j = tamanho1; j < tamanho2; j++) {
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
