package entities;

import java.util.Random;

public class Module {
	private static int[] difs = new int[]{1,2,3};
	
	private int dificulty;
	private int row, column;
	private Platform platform = new Platform(this);
	
	public Module() {
	}
	
	public Module(int column) {
		this.column = column;
		dificulty = setDificulty();
		row = 8;
	}

	public int getDificulty() {
		return dificulty;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public Platform getPlatform() {
		return platform;
	}
	
	public int setDificulty() {
		int rand = new Random().nextInt(difs.length);
		return difs[rand];
	}
}
