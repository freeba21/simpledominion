package sk.uniba.fmph.dcs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hand {
    /* Responsibilities
-- Check if card is in hand
-- Draws cards
-- Redraw cards
*/
    public LinkedList<CardInterface> inHand;
    public Hand(Deck deck){
        this.inHand=new LinkedList<>();
        LinkedList<CardInterface> nev= (LinkedList<CardInterface>) deck.draw(5);
        for (int i=0;i<5;i++){
            inHand.add(nev.get(i));
        }
    }
    public boolean isActionCard(int idx){
        return inHand.get(idx).cardType().isAction;
    }
    public CardInterface play(int idx){
        if(inHand.size()>idx) return inHand.get(idx);
        return null;
    }
    public LinkedList<CardInterface> getHand(){
        return inHand;
    }
    public void drawCard(LinkedList<CardInterface> card){
        inHand.addAll(card);
    }
    public LinkedList<CardInterface> throwsCard(){
        LinkedList<CardInterface> nev=new LinkedList<>(inHand);
        inHand=new LinkedList<>();
        return nev;
    }

}
