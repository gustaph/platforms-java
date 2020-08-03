package entities;

import java.util.Random;

public class Enemy {
	
	private static int[] dif2 = new int[]{0,0,0,0,0,0,0,0,0,1}; // 10%
	private static int[] dif3 = new int[]{0,0,0,0,0,0,0,1}; // 12.5%
	private static int rD2, rD3;
	
	private Module module;
	
	public Enemy(Module module) {
		this.module = module;
	}
	
	public Module getModule() {
		return module;
	}
	
	public void addEnemys(Module module, String[][] mat) {
		for (int i=0; i<mat.length; i++) {
			for (int j=1; j<(mat[i].length-1); j++) {
				if (((mat[i][j] == "1") & (mat[i][j+1] == "1")) | ((mat[i][j] == "1") & (mat[i][j-1] == "1"))) {
					rD2 = new Random().nextInt(dif2.length);
					rD3 = new Random().nextInt(dif3.length);
				
					if (((module.getDificulty() == 2) && (dif2[rD2] == 1)) | ((module.getDificulty() == 3) && (dif3[rD3] == 1))) {
						mat[i-1][j] = "2";
						mat[i-2][j] = "2";
					}
				}
			}
		}
	}
}
