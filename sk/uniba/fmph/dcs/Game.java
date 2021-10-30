package sk.uniba.fmph.dcs;

import java.util.LinkedList;

public class Game {
    /*Responsibilities
-- Manages turns
-- Know if it is play or buy phase
*/
    boolean actionPhase, buyPhase;
    Deck deck;
    DiscardPile discardPile;
    Hand hand;
    Turn turn;
    Play play;
    TurnStatus turnStatus;
    int emptyDeck;

    public Game(int empty_decks,int market, int estate, int copper, int smithy, int village, int festival, int laboratory){
        if(market<5) market=5; if(smithy<5) smithy=5;
        if (estate<5) estate=5; if(village<5) village=5;
        if(copper<5) copper=5; if(laboratory<5) laboratory=5;
        if(festival<5) festival=5;
        if(empty_decks<0 || empty_decks>7) empty_decks=3;
        emptyDeck=empty_decks;
        play=new Play();
        deck=new Deck(null,discardPile);
        discardPile=new DiscardPile(new LinkedList<>());
        hand=new Hand(deck);
        turnStatus=new TurnStatus();
        turn=new Turn();


    }

    public boolean playCard(int handIdx) {
        if(!actionPhase)
        {System.err.println("Nie je ActionPhase, nie je možné hrať.");
            return false;}

        return true;
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
