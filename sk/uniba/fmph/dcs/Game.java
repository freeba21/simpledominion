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
    LinkedList<GameCardType> type;
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
        type=new LinkedList<>();
        type.add(GameCardType.GAME_CARD_TYPE_ESTATE);
        type.add(GameCardType.GAME_CARD_TYPE_VILLAGE);
        type.add(GameCardType.GAME_CARD_TYPE_COPPER);
        type.add(GameCardType.GAME_CARD_TYPE_MARKET);
        type.add(GameCardType.GAME_CARD_TYPE_FESTIVAL);
        type.add(GameCardType.GAME_CARD_TYPE_LABORATORY);
        type.add(GameCardType.GAME_CARD_TYPE_SMITHY);
        buyPhase=false;
        actionPhase=true;
    }

    public boolean playCard(int handIdx) {
        if(!actionPhase)
        {System.err.println("Nie je ActionPhase, nie je možné hrať.");
            return false;}
        if(turnStatus.getActions()>0){
            return false;
        }
        else System.err.println("Nedostatok akcií.");
        return true;
    }

    public boolean endPlayCardPhase() {
        if(buyPhase){
            buyPhase=false;
            actionPhase=true;
            endTurn();
        }else if(actionPhase){
            actionPhase=false;
            buyPhase=true;
        }
        return false;
    }

    public boolean buyCard(int buyCardIdx) {
        if(!buyPhase){
            System.err.println("Nie je BuyPhase, nie je možné hrať.");
            return false;
        }if(turnStatus.getBuys()<1){
            System.err.println("Nie je možný nákup karty pre nedostatočný buys.");
            return false;
        }
        return false;
    }

    public boolean endTurn() {
        return false;
    }
}
