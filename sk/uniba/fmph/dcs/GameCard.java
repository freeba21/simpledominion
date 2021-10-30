package sk.uniba.fmph.dcs;

public class GameCard implements CardInterface{
    /*Responsibilities
-- Evaluates impact of the card
*/
    GameCardType game;
    public GameCard(GameCardType g){
        game=g;
    }

    @Override
    public void evaluate(TurnStatus ts) {
        ts.getBuys();
        ts.setBuy(ts.getBuys()+game.plusBuys);
        ts.setActions(ts.getActions()+game.plusActions);
        ts.setCoins(ts.getCoins()+game.plusCoins);
    }

    @Override
    public GameCardType cardType() {
        return game;
    }
}
