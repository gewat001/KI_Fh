package de.fh.stud.p1;

import de.fh.kiServer.agents.Agent;
import de.fh.kiServer.util.Util;
import de.fh.pacman.PacmanAgent_2021;
import de.fh.pacman.PacmanGameResult;
import de.fh.pacman.PacmanPercept;
import de.fh.pacman.PacmanStartInfo;
import de.fh.pacman.enums.PacmanAction;
import de.fh.pacman.enums.PacmanActionEffect;
import de.fh.pacman.enums.PacmanTileType;

public class MyAgent_P1 extends PacmanAgent_2021 {

    /*
     * TODO Praktikum 1: Fügt gemäß der Aufgabenstellung neue Attribute hinzu, falls notwendig.
     */

    /**
     * Die als nächstes auszuführende Aktion
     */
    private PacmanAction nextAction;
    private PacmanAction previousAction;

    public MyAgent_P1(String name) {
        super(name);
    }

    public static void main(String[] args) {
        MyAgent_P1 agent = new MyAgent_P1("MyAgent");
        Agent.start(agent, "127.0.0.1", 5000);
    }

    /**
     * @param percept      - Aktuelle Wahrnehmung des Agenten, bspw. Position der Geister und Zustand aller Felder der Welt.
     * @param actionEffect - Aktuelle Rückmeldung des Server auf die letzte übermittelte Aktion.
     */
    @Override
    public PacmanAction action(PacmanPercept percept, PacmanActionEffect actionEffect) {

        //Gebe den aktuellen Zustand der Welt auf der Konsole aus
        //Util.printView(percept.getView());
        //Nachdem das Spiel gestartet wurde, geht der Agent nach Osten
        if (actionEffect == PacmanActionEffect.GAME_INITIALIZED) {
            nextAction = PacmanAction.GO_EAST;
            previousAction = nextAction;
        }

        /*if(actionEffect == PacmanActionEffect.MOVED_ON_EMPTY_TILE){
            switch (previousAction) {
                case GO_SOUTH:
                    System.out.println("Süden");
                    if (percept.getView()[percept.getPosY()-1][percept.getPosX()] == PacmanTileType.EMPTY) {
                        nextAction = PacmanAction.GO_WEST;
                    }
                    break;
               /* case GO_WEST:
                    if (percept.getView()[percept.getPosX()-1][percept.getPosY()] == PacmanTileType.EMPTY) {
                        nextAction = PacmanAction.GO_NORTH;
                        previousAction = nextAction;
                    }
                    break;
                case GO_NORTH:
                    if (percept.getView()[percept.getPosX()][percept.getPosY()+1] == PacmanTileType.EMPTY) {
                        nextAction = PacmanAction.GO_EAST;
                        previousAction = nextAction;
                    }
                    break;
                case GO_EAST:
                    if (percept.getView()[percept.getPosX()+1][percept.getPosY()] == PacmanTileType.EMPTY) {
                        nextAction = PacmanAction.GO_SOUTH;
                        previousAction = nextAction;
                    }
                    break;
                default:
                    break;
            }
        }*/

        if (actionEffect == PacmanActionEffect.BUMPED_INTO_WALL) {
            switch (previousAction) {
                case GO_EAST:
                    nextAction = PacmanAction.GO_SOUTH;
                    previousAction = nextAction;
                    break;
                case GO_SOUTH:
                    nextAction = PacmanAction.GO_WEST;
                    previousAction = nextAction;
                    break;
                case GO_WEST:
                    nextAction = PacmanAction.GO_NORTH;
                    previousAction = nextAction;
                    break;
                case GO_NORTH:
                    nextAction = PacmanAction.GO_EAST;
                    previousAction = nextAction;
                    break;
                default:
                    break;
            }
        }
        /*
         * TODO Praktikum 1: Erweitert diese action-Methode gemäß der Aufgabenstellung.
         */
        previousAction = nextAction;
        return nextAction;
    }

    @Override
    protected void onGameStart(PacmanStartInfo startInfo) {

    }

    @Override
    protected void onGameover(PacmanGameResult gameResult) {

    }
}
