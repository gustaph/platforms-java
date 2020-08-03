package application;

import entities.Module;

public class UI {
	
	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";
		
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	
	public static void printModulo(Module mod, String[][] mat) {
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == "1")
					System.out.print(ANSI_BLUE_BACKGROUND + ANSI_BLUE + "- " + ANSI_RESET);
				else if(mat[i][j] == "2")
					System.out.print(ANSI_RED_BACKGROUND + ANSI_RED + "- " + ANSI_RESET);
				else
					System.out.print(ANSI_WHITE_BACKGROUND + "- " + ANSI_RESET);
			}
			System.out.println();
		}
		System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLACK + 
							"[MODULE LEVEL]: " + mod.getDificulty()
							+ ANSI_RESET + "\n");
	}
}
