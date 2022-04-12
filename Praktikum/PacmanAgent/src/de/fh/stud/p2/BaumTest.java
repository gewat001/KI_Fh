package de.fh.stud.p2;

import de.fh.pacman.enums.PacmanTileType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaumTest {
	public static final int MAX_KNOTEN = 10;
	public static int start = 0;



	public static void main(String[] args) {
		//Anfangszustand nach Aufgabe
		PacmanTileType[][] view = {
				{PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.EMPTY,PacmanTileType.DOT,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.DOT,PacmanTileType.WALL,PacmanTileType.WALL},
				{PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL,PacmanTileType.WALL}
		};
		//Startposition des Pacman
		int posX = 1, posY = 1;
		/*
		 * TODO Praktikum 1 [3]: Baut hier basierend auf dem gegebenen
		 * Anfangszustand (siehe view, posX und posY) den Suchbaum auf.
		 */


	}



//	private static void PrintView(Knoten knoten) {
//		System.out.println("id#" + knoten.id + " (parent:#" + (knoten.parent != null ? knoten.parent.id : -1) + ")");
//		for (int x = 0; x < knoten.worldView.length; x++) {
//			for (int y = 0; y < knoten.worldView[x].length; y++) {
//				System.out.print(symbolMap.get(knoten.worldView[x][y]) + " ");
//			}
//			System.out.println();
//		}
//		System.err.println();
//	}
}
