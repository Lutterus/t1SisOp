package t1SisOp;

public class MyThread implements Runnable {
	private int threadID;
	private int[][] mres;
	private int[][] m1;
	private int[][] m2;
	private int k;
	private int id;
	Matriz matriz;

	public MyThread(int id, int[][] mres, int[][] m1, int[][] m2, int k, Matriz matriz) {
		this.threadID = id;
		this.mres = mres;
		this.m1 = m1;
		this.m2 = m2;
		this.k = k;
		this.id = id;
		this. matriz = matriz;
	}

	@Override
	public void run() {
		if(id==0) {
			System.out.println("aaaaaa");
			for (int i = 0; i < (mres.length)/2; i++) {
				for (int j = 0; j < (mres[0].length)/2; j++) {
					mres[i][j] = 0;
					for (k = 0; k < m2.length; k++) {
						//System.out.println("i: " + i +  " j: " + j + " k: " + k);
						matriz.setPos(i, j, (m1[i][k] * m2[k][j]));
						//mres[i][j] += m1[i][k] * m2[k][j];
					}
				}
			}
		}else {
			System.out.println("bbbbbb");
			for (int i = (mres.length)/2; i < mres.length; i++) {
				for (int j = (mres[0].length)/2; j < mres[0].length; j++) {
					mres[i][j] = 0;
					for (k = 0; k < m2.length; k++) {
						//System.out.println("i: " + i +  " j: " + j + " k: " + k);
						//mres[i][j] += m1[i][k] * m2[k][j];
						matriz.setPos(i, j, (m1[i][k] * m2[k][j]));
						//System.out.println(mres[i][j]);
					}
				}
			}
		}
		

	}
}
