package sk.uniba.fmph.dcs;

import java.util.*;

public class BuyDeck {
    /* Responsibilities
-- Creates cards
*/
    List<CardInterface> cards;
    public BuyDeck(GameCardType card, int count){
        cards=new LinkedList<>();
        for(int i=0;i<count;i++){
            cards.add(new GameCard(card));
        }
    }
    public int cardCount(){
        return cards.size();
    };
    public CardInterface buy(){
        return cards.remove(cards.size()-1);
    };

}
