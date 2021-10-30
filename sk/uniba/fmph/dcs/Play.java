package sk.uniba.fmph.dcs;

import java.util.List;

public class Play {
    /* Responsibilities
-- Stores cards in play
-- Trows them to discard
pile at the end of turn
*/
    List<CardInterface> cards;
    public void puTo(List<CardInterface> card){
        cards=card;
    }
    public void trowAll(){
        cards=null;
    }
}
