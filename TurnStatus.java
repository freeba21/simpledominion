package sk.uniba.fmph.dcs;

public class TurnStatus {
    public int actions;
    public int buys;
    public int coins;
    public TurnStatus(){
        this.actions=1;
        this.buys=1;
        this.coins=0;
    }
    public int getBuys(){
        return buys;
    }
    public void setBuy(int buys){
        this.buys=buys;
    }
    public int getActions() {
        return actions;
    }
    public void setActions(int actions){
        this.actions=actions;
    }
    public int getCoins(){
        return coins;
    }
    public void setCoins(int coins){
        this.coins=coins;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + actions;
        result = prime * result + buys;
        result = prime * result + coins;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TurnStatus other = (TurnStatus) obj;
        if (actions != other.actions)
            return false;
        if (buys != other.buys)
            return false;
        if (coins != other.coins)
            return false;
        return true;
    }
}
