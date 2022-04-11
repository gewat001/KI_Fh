package de.fh.stud.p2;

import de.fh.pacman.enums.PacmanTileType;

import java.util.ArrayList;
import java.util.List;

public class Knoten {


	/*
	 * TODO Praktikum 2 [1]: Erweitert diese Klasse um die notwendigen
	 * Attribute, Methoden und Konstruktoren um die möglichen verschiedenen Weltzustände darstellen und
	 * einen Suchbaum aufspannen zu können.
	 */
	public PacmanTileType[][] world_state;
	public Knoten parentNote;
	public int posX;
	public int posY;

	public Knoten(PacmanTileType[][] world_state, int posX, int posY){
		this.world_state = produceView(world_state);
		this.posX = posX;
		this.posY = posY;
		this.world_state[this.posX][this.posY] = PacmanTileType.PACMAN;
	}

	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 2 [2]: Implementiert in dieser Methode das Expandieren des Knotens.
		 * Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten) zurückgeben.
		 */
		List<Knoten> noteList = new ArrayList<>();

		return null;
	}

	public PacmanTileType[][] produceView(PacmanTileType[][] oldWorldState){
		PacmanTileType[][] newView = new PacmanTileType[oldWorldState.length][];
		for(int x = 0; x < newView.length; x++){
			newView[x] = new PacmanTileType[oldWorldState[x].length];
			for(int y = 0; y < newView[x].length; y++){
				newView[x][y] = oldWorldState[x][y];
			}
		}
		return newView;
	}

	public boolean wallCheck(int X, int posY){
		return world_state[posX][posY] != PacmanTileType.WALL;
	}
}
