package sk.uniba.fmph.dcs;

import java.util.LinkedList;
import java.util.List;

public class Play {
    /* Responsibilities
-- Stores cards in play
-- Trows them to discard
pile at the end of turn
*/
    LinkedList<CardInterface> cards;

    public void putToPlay(CardInterface card){
        cards.add(card);
    }
    public LinkedList<CardInterface> trowAll(){
        LinkedList<CardInterface> a=new LinkedList<>();
        for (int i=0;i<cards.size();i++){
            a.add(cards.remove());
        }
        return a;
    }
}
