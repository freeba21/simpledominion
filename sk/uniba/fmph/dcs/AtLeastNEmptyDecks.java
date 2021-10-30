package sk.uniba.fmph.dcs;

import java.util.LinkedList;

public class AtLeastNEmptyDecks implements EndGameStrategy{
    int counnt=0;
    LinkedList<BuyDeck> deck;
    public AtLeastNEmptyDecks(LinkedList<BuyDeck> bd, int count){
        deck=bd;
        counnt=count;
    }
    @Override
    public boolean isGameOver() {
        int count=0;
        for(int i=0;i<deck.size();i++){
            if(deck.get(1).cardCount()==0) return true;
            if(deck.get(i).cardCount()==0) count++;
        }
        if(count<counnt)return true;
        return false;
    }
}
