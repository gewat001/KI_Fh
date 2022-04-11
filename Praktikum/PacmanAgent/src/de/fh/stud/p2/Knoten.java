package de.fh.stud.p2;

import de.fh.pacman.enums.PacmanTileType;

import java.util.List;

public class Knoten {

	public PacmanTileType[][] world_state;
	public Knoten[] expandableNotes;
	public int posX;
	public int posY;

	public Knoten(PacmanTileType[][] world_state, int posX, int posY){
		this.world_state = world_state;
		this.posX = posX;
		this.posY = posY;
	}

	public PacmanTileType[][] findExpandableNotes(){
		PacmanTileType[][] notes = null;

		return notes;
	}

	/*
	 * TODO Praktikum 2 [1]: Erweitert diese Klasse um die notwendigen
	 * Attribute, Methoden und Konstruktoren um die möglichen verschiedenen Weltzustände darstellen und
	 * einen Suchbaum aufspannen zu können.
	 */

	public List<Knoten> expand() {
		/*
		 * TODO Praktikum 2 [2]: Implementiert in dieser Methode das Expandieren des Knotens.
		 * Die Methode soll die neu erzeugten Knoten (die Kinder des Knoten) zurückgeben.
		 */
		return null;
	}
	
}
