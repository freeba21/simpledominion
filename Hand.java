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
    public List<CardInterface> inHand;
    public Hand(Deck deck){
        this.inHand=new ArrayList<>();
        LinkedList<CardInterface> nev=deck.draw(5);
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

}
