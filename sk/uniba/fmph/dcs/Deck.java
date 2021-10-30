package sk.uniba.fmph.dcs;

import java.util.LinkedList;

public class Deck {
    /* Responsibilities
-- Contains deck cards
-- Get cards from top
-- Knows when to shuffle
*/
    public int restdeck=0;
    LinkedList<CardInterface> deck;
    public Deck(LinkedList<CardInterface> deck, DiscardPile dc){
        this.deck=deck;
        if(deck==null)
            this.deck=new LinkedList<>(dc);
        else{
            for (int i=0;i<deck.size();i++){
                this.deck.add(deck.get(i));
            }
        }

    }
    public CardInterface draw(int count){
        if(deck.size()<count){
            restdeck=count-deck.size();
        }
        if(restdeck>0){
            deck=new LinkedList<>();
        }
    };

}
