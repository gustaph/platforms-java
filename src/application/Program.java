package application;

import java.util.Scanner;

import entities.Enemy;
import entities.Module;

public class Program {

	public static void main(String[] args) {
		
		Module mod = new Module();
		Enemy enemy = new Enemy(mod);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> Module size[integer]: ");
		int size = sc.nextInt();
		
		for (int i=0; i<4; i++) {
			mod = new Module(size);
			String[][] mat = new String[mod.getRow()][mod.getColumn()];
			mod.getPlatform().setPlatform(mat);
			enemy.addEnemys(mod, mat);
			UI.printModulo(mod, mat);
		}
		sc.close();
	}
}

