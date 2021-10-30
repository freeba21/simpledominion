package sk.uniba.fmph.dcs;

public class Game {
    /*Responsibilities
-- Manages turns
-- Know if it is play or buy phase
*/
    public boolean playCard(int handIdx) {
        return false;
    }

    public boolean endPlayCardPhase() {
        return false;
    }

    public boolean buyCard(int buyCardIdx) {
        return false;
    }

    public boolean endTurn() {
        return false;
    }
}
