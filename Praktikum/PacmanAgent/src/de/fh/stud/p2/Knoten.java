package de.fh.stud.p2;

import de.fh.pacman.enums.PacmanTileType;

import java.util.*;

public class Knoten {

	public  static final Map<Direction, PositionChange> movementMap = new HashMap<Direction, PositionChange>() {{
		put(Direction.GO_NORTH, new PositionChange(-1, 0));
		put(Direction.GO_EAST, new PositionChange(0, 1));
		put(Direction.GO_SOUTH, new PositionChange(1, 0));
		put(Direction.GO_WEST, new PositionChange(0, -1));
		put(Direction.WAIT, new PositionChange(0, 0));
	}};

	public static final int MAX = 10;
	public static int start = 0;

	public PacmanTileType[][] worldView;
	public Position pos;

	public Knoten parentKnoten;
	public Knoten[][] childKnoten;

	public Knoten(PacmanTileType[][] worldView, Position pos) {
		this.worldView = worldView;
		this.pos = pos;
		this.worldView[pos.x][pos.y] = PacmanTileType.PACMAN;
	}

	/*
	 * TODO Praktikum 1 [1]: Erweitert diese Klasse um die notwendigen
	 * Attribute, Methoden und Konstruktoren um die möglichen verschiedenen Weltzustände darstellen und
	 * einen Suchbaum aufspannen zu können.
	 */

	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 1 [2]: Implementiert in dieser Methode das Expandieren des Knotens.
		 * Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten) zurückgeben.
		 */
		List<Knoten> noteList = new ArrayList<>();
		// Die einzelnen Bewegungsmöglichkeiten prüfen
		for(Map.Entry<Direction, PositionChange> entry : movementMap.entrySet()){
			if(worldView[(pos.x + entry.getValue().x)][pos.y + entry.getValue().y] !=PacmanTileType.WALL){
				//Knoten newNote = new Knoten()
			}
		}

		return null;
	}

	private boolean checkBounds(Position position) {
		return worldView[position.x][position.y] != PacmanTileType.WALL;
	}

	public PacmanTileType[][] makeNewWorld(PacmanTileType[][] old, Position oldPos, PositionChange change){
		PacmanTileType[][] newWorld = new PacmanTileType[old.length][old[0].length];
		for(int i = 0; i < old.length; i++){
			for(int j = 0; j < old[i].length; j++){
				newWorld[i][j] = old[i][j];
			}
		}
		newWorld[oldPos.x][oldPos.y] = PacmanTileType.EMPTY;
		newWorld[oldPos.x + change.x][oldPos.y + change.y] = PacmanTileType.PACMAN;
		return null;
	}

	private PacmanTileType[][] getNewView(PacmanTileType[][] oldView){

		return null;
	}
}
