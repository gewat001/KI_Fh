package de.fh.stud.p2;

import de.fh.pacman.enums.PacmanTileType;

import java.util.*;

public class Knoten {


	/*
	 * TODO Praktikum 2 [1]: Erweitert diese Klasse um die notwendigen
	 * Attribute, Methoden und Konstruktoren um die möglichen verschiedenen Weltzustände darstellen und
	 * einen Suchbaum aufspannen zu können.
	 */
	public PacmanTileType[][] world_state;
	public Knoten parentNote;
	public PacmanPosition position;

	static final Map<Movement, PacmanPosition> movement = new HashMap<Movement, PacmanPosition>(){{
		put(Movement.GO_EAST, new PacmanPosition(1,0));
		put(Movement.GO_SOUTH, new PacmanPosition(0, -1));
		put(Movement.GO_WEST, new PacmanPosition(-1, 0));
		put(Movement.GO_NORTH, new PacmanPosition(0, 1));
		// Muss wait auch abgebildet werden?
	}};

	public Knoten(PacmanTileType[][] world_state, PacmanPosition pos){
		this.world_state = produceView(world_state);
		this.position = pos;
		this.world_state[pos.x][pos.y] = PacmanTileType.PACMAN;
	}

	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 2 [2]: Implementiert in dieser Methode das Expandieren des Knotens.
		 * Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten) zurückgeben.
		 */
		List<Knoten> noteList = new ArrayList<>();
		Iterator noteIterator = movement.entrySet().iterator();

		while(noteIterator.hasNext()){
			Map.Entry mapEntry = (Map.Entry)noteIterator.next();
			if(wallCheck(position.change((PacmanPosition) mapEntry.getValue()))){
				Knoten note = new Knoten(produceView(world_state), position.change((PacmanPosition)mapEntry.getValue()));
				note.world_state[position.x][position.y] = PacmanTileType.EMPTY;
				note.parentNote = this;
				noteList.add(note);
			}
		}
		System.out.println("-->");
		return noteList;
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

	public boolean wallCheck(PacmanPosition pos){
		return world_state[pos.x][pos.y] != PacmanTileType.WALL;
	}
}
