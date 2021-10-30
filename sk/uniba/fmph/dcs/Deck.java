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
    DiscardPile discardPile;
    public Deck(LinkedList<CardInterface> deck, DiscardPile dc){
        this.deck=deck;
        discardPile=dc;
        if(deck==null)
            this.deck=new LinkedList<>();
        else{
            for (int i=0;i<deck.size();i++){
                this.deck.add(deck.get(i));
            }
        }

    }
    public LinkedList<CardInterface> draw(int count){
        if(deck.size()<count){
            restdeck=count-deck.size();
        }
        LinkedList<CardInterface> a=new LinkedList<>();
        for (int i=0;i<count-restdeck;i++){
            a.add(deck.removeFirst());
        }
        if(restdeck>0){
            deck=new LinkedList<>(discardPile.shuffle());
            for (int i=0;i<restdeck;i++)
                a.add(deck.removeFirst());
        }
        return a;
    };

}
