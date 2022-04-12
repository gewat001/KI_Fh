package de.fh.stud.p2;

public class PacmanPosition {
    public int x;
    public int y;

    public PacmanPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    public PacmanPosition change(PacmanPosition pacPos){
        return new PacmanPosition(this.x + pacPos.x, this.y + pacPos.y);
    }


}
