package sk.uniba.fmph.dcs;

import java.util.ArrayList;
import java.util.List;

public class Turn {
/*    Responsibilities
-- Tracks actions / buys / gold
-- Throws used cards into Play or DiscardPile
*/
    private int buying;
    private int action;
    private int coin;

    public Turn(){
        buying=1;
        action=1;
        coin=0;
    }
    public void addBuy(int buy){
        buying+=buy;
    }
    public void addAction(int act){
        action+=act;
    }
    public void addCoin(int co){
        coin+=co;
    }

}
