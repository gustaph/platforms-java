package entities;

import java.util.Random;

public class Platform {
	
	private Module module;
	
	// last, penultimate, antepenultimate lines
	private static int[] pos = new int[]{5,6,7};
	private int[] tams, saltos;
	private int rPos, rTam, rSal;
	
	public Platform(Module module) {
		this.module = module;
	}
	
	public Module getModule() {
		return module;
	}
	
	public String[][] setPlatform(String[][] mat){
		int aux=0;
		
		if (module.getDificulty() == 1) {
			pos = new int[]{5,6,7};
			tams = new int[]{4,5};
			saltos = new int[]{0};
			
			rPos = new Random().nextInt(pos.length);
			rTam = new Random().nextInt(tams.length);
			rSal = new Random().nextInt(saltos.length);
		}
		else if(module.getDificulty() == 2) {
			pos = new int[]{5,6,7};
			tams = new int[]{3,4};
			saltos = new int[]{0,1};
			
			rPos = new Random().nextInt(pos.length);
			rTam = new Random().nextInt(tams.length);
			rSal = new Random().nextInt(saltos.length);
		}
		else{
			pos = new int[]{5,6,7};
			tams = new int[]{1,2,3};
			saltos = new int[]{-1,0};
			
			rPos = new Random().nextInt(pos.length);
			rTam = new Random().nextInt(tams.length);
			rSal = new Random().nextInt(saltos.length);
		}
		
		for (int j=0; j<module.getColumn(); j++) {
			if (aux < tams[rTam]) {
				mat[pos[rPos]][j] = "1";
			}
			else { // jump or dash
				rTam = new Random().nextInt(tams.length);
				rPos = new Random().nextInt(pos.length);
				rSal = new Random().nextInt(saltos.length);
				j += saltos[rSal]; aux=0;
			}
			aux++;
		}
		return mat;
	}
}
